/*
 * YUI Test Selenium Driver
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yui.selenium;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.SeleniumException;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


/**
 * Controls Selenium to extract YUI Test information.
 * @author Nicholas C. Zakas
 */
public class SeleniumDriver {

    //--------------------------------------------------------------------------
    // Constants
    //--------------------------------------------------------------------------

    public static final String YUITEST_VERSION = "yuitest.version";

    public static final String COVERAGE_OUTPUTDIR = "coverage.outputdir";
    public static final String COVERAGE_FILENAME = "coverage.filename";
    public static final String COVERAGE_FORMAT = "coverage.format";

    public static final String RESULTS_OUTPUTDIR = "results.outputdir";
    public static final String RESULTS_FILENAME = "results.filename";
    public static final String RESULTS_FORMAT = "results.format";

    public static final String SELENIUM_HOST = "selenium.host";
    public static final String SELENIUM_PORT = "selenium.port";
    public static final String SELENIUM_BROWSERS = "selenium.browsers";

    public static final String SELENIUM_WAIT_FOR_LOAD = "selenium.waitforload";
    public static final String SELENIUM_WAIT_FOR_DONE = "selenium.waitfordone";

    public static final String CONSOLE_MODE = "console.enabled";


    //--------------------------------------------------------------------------
    // Private Static
    //--------------------------------------------------------------------------


    private static HashMap<String,String> testRunners = 
            new HashMap<String,String>();
    private static HashMap<String,String> testFormats = 
            new HashMap<String,String>();
    private static HashMap<String,String> coverageFormats = 
            new HashMap<String,String>();
    private static final String jsWindow = "selenium.browserbot.getCurrentWindow()";
    
    static {
        testRunners.put("2", "YAHOO.tool.TestRunner");
        testRunners.put("3", "Y.Test.Runner");
        
        testFormats.put("2", "YAHOO.tool.TestFormat");
        testFormats.put("3", "Y.Test.Format");
        
        coverageFormats.put("2", "YAHOO.tool.CoverageFormat");
        coverageFormats.put("3", "Y.Coverage.Format");
    }

    /**
     * Configuration properties for the instance.
     */
    private Properties properties;
    
    /**
     * Indicates if additional information should be output to the console.
     */
    private boolean verbose;
    
    /**
     * The list of Selenium browsers to test.
     */
    private String[] browsers;
    
    /**
     * Creates a new instance.
     * @param properties
     * @param verbose
     */
    public SeleniumDriver(Properties properties, boolean verbose) throws Exception {
        this.properties = properties;
        this.verbose = verbose;
        getBrowserList();
    }

    public TestResult[] runTests(TestConfig config) throws Exception {
        return runTests(config.getGroups());
    }
   
    public TestResult[] runTests(TestPageGroup[] groups) throws Exception {
        
        List<TestResult> results = new LinkedList<TestResult>();        

        //do the tests
        for(int i=0; i < groups.length; i++){
            for (int j=0; j < browsers.length; j++){
                results.addAll(runTestGroup(browsers[j], groups[i]));
            }
        }

        return results.toArray(new TestResult[results.size()]);        
    }

    public TestResult[] runTests(TestPageGroup group) throws Exception {
        List<TestResult> results = new LinkedList<TestResult>();

        for (int j=0; j < browsers.length; j++){
            results.addAll(runTestGroup(browsers[j], group));
        }

        return results.toArray(new TestResult[results.size()]);
    }

    //--------------------------------------------------------------------------

    private List<TestResult> runTestGroup(String browser, TestPageGroup group) throws Exception {
        
        //if there's a common base, try to optimize
        if (group.getBase().length() > 0){
            return runTestGroupOpt(browser, group);
        } else {
            return runTestGroupUnopt(browser, group);
        }
    }

    private List<TestResult> runTestGroupOpt(String browser, TestPageGroup group) throws Exception {

        TestPage[] testpages = group.getTestPages();
        List<TestResult> results = new LinkedList<TestResult>();
        Selenium selenium = startBrowser(browser, group.getBase());

        try {
            for (int i=0; i < testpages.length; i++){
                results.add(runTestPage(selenium, browser, testpages[i]));
            }
        } catch (Exception ex){
            throw ex;
        } finally {
            selenium.stop();
        }

        return results;
    }

    private List<TestResult> runTestGroupUnopt(String browser, TestPageGroup group) throws Exception {

        TestPage[] testpages = group.getTestPages();
        List<TestResult> results = new LinkedList<TestResult>();
        Selenium selenium = null;

        try {
            for (int i=0; i < testpages.length; i++){
                selenium = startBrowser(browser, testpages[i].getAbsolutePath());
                results.add(runTestPage(selenium, browser, testpages[i]));
            }
        } catch (Exception ex){
            throw ex;
        } finally {
            if (selenium != null){
                selenium.stop();
            }
        }

        return results;
    }

    public TestResult runTestPage(String browser, TestPage page) throws Exception {

        Selenium selenium = null;
        String url = page.getAbsolutePath();

        try {
            selenium = new DefaultSelenium(properties.getProperty(SELENIUM_HOST),
                    Integer.parseInt(properties.getProperty(SELENIUM_PORT)), browser, url);

            selenium.start();

            return runTestPage(selenium, browser, page);

        } catch (Exception ex){
            //TODO: What should happen here? Default file generation?
            throw ex;
        } finally {
            if (selenium != null){
                selenium.stop();
            }
        }

    }

    private TestResult runTestPage(Selenium selenium, String browser, 
            TestPage page) throws Exception {
    
        //basic YUI Test info
        String yuitestVersion = String.valueOf(page.getVersion());
        String testRunner = jsWindow + "." + testRunners.get(yuitestVersion);
        String testFormat = jsWindow + "." + testFormats.get(yuitestVersion);
        String coverageFormat = jsWindow + "." + coverageFormats.get(yuitestVersion);

        //JS strings to use
        String testRunnerIsNotRunning = "!" + testRunner + ".isRunning()";
        String testRawResults = testRunner + ".getResults(" + testFormat + ".XML);";
        String testResults = testRunner + ".getResults(" + testFormat + "." +
                properties.getProperty("results.format", "JUnitXML") +
                ");";
        String testCoverage = testRunner + ".getCoverage(" + coverageFormat + "." +
                properties.getProperty("coverage.format", "JSON") +
                ");";
        String testName = testRunner + ".getName();";

        //extracted from page
        String results = "";
        String rawResults = "";
        String coverage = "";
        String name = "";

        //page info
        String url = page.getAbsolutePath();
        String pageTimeout = String.valueOf(page.getTimeout());
        if (pageTimeout.equals("-1")){
            pageTimeout = properties.getProperty(SELENIUM_WAIT_FOR_DONE, "10000");
        }

        //run the tests
        try {
            selenium.open(url);

            if (verbose){
                System.err.println("[INFO] Navigating to '" + url + "'");
            }

            selenium.waitForPageToLoad(properties.getProperty(SELENIUM_WAIT_FOR_LOAD, "10000"));

            if (verbose){
                System.err.println("[INFO] Page is loaded.");
            }

            selenium.waitForCondition(testRunnerIsNotRunning, pageTimeout);

            if (verbose){
                System.err.println("[INFO] Test complete.");
            }

            //get results
            results = selenium.getEval(testResults);
            if (results.equals("null")){
                results = null;
            }

            rawResults = selenium.getEval(testRawResults);
            if (rawResults.equals("null")){
                rawResults = null;
            }

            coverage = selenium.getEval(testCoverage);
            if (coverage.equals("null")){
                coverage = null;
            }

            name = selenium.getEval(testName);

            TestResult result = new TestResult(name, browser, url, rawResults);
            result.setReport("results", results);
            result.setReport("coverage", coverage);

            if (!properties.getProperty(CONSOLE_MODE, "normal").equals("silent")){
                outputResultToConsole(result);
            }
            
            return result;
            
        } catch (SeleniumException ex){

            //probably not a valid page
            throw new Exception("Selenium failed with message: " + ex.getMessage() + ". Check the test URL " + url + " to ensure it is valid.", ex);

        } catch (Exception ex){
            throw ex;
        }

    }

    private void getBrowserList() throws Exception {

        browsers = (properties.getProperty("selenium.browsers", "")).split("\\,");
        if(browsers.length == 0){
            throw new Exception("The configuration property 'selenium.browsers' is missing.");
        }
    }

    private void outputResultToConsole(TestResult result) throws Exception {

        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser parser = null;
        ResultsOutputter handler = new ResultsOutputter(result);

        try {
            parser = spf.newSAXParser();
            parser.parse(new ByteArrayInputStream(result.getResults().getBytes()), handler);
        } catch (ParserConfigurationException ex) {
            throw new Exception("Could not parse results file: " + ex.getMessage(), ex);
        }

    }

    private Selenium startBrowser(String browser, String base){
        Selenium selenium = new DefaultSelenium(properties.getProperty(SELENIUM_HOST),
                Integer.parseInt(properties.getProperty(SELENIUM_PORT)), browser, base);

        selenium.start();

        return selenium;
    }
            

}
