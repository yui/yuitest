/*
 * YUI Test Selenium Driver
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.selenium;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.SeleniumException;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

/**
 * Controls Selenium to extract YUI Test information.
 * @author Nicholas C. Zakas
 */
public class SeleniumDriver {

    //--------------------------------------------------------------------------
    // Constants
    //--------------------------------------------------------------------------

    public static final String YUITEST_VERSION = "yuitest.version";
    public static final String YUITEST_TIMEOUT = "yuitest.timeout";
    public static final String YUITEST_TESTS_FILE = "yuitest.tests";

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
    public static final String ERROR_ON_FAIL = "console.erroronfail";

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

    //--------------------------------------------------------------------------
    // Private
    //--------------------------------------------------------------------------

    /**
     * Configuration properties for the instance.
     */
    private Properties properties;
    
    /**
     * Indicates if additional information should be output to the console.
     */
    private boolean verbose = false;
    
    /**
     * The list of Selenium browsers to test.
     */
    private String[] browsers;

    //--------------------------------------------------------------------------
    // Constructors
    //--------------------------------------------------------------------------
    
    /**
     * Creates a new instance of the Selenium driver based on the given
     * properties.
     * @param properties Properties defining how the driver should act.
     */
    public SeleniumDriver(Properties properties) throws Exception {
        this.properties = properties;
        getBrowserList();
    }

    /**
     * Creates a new instance of the Selenium driver based on the given
     * properties.
     * @param properties Properties defining how the driver should act.
     * @param verbose Indicates if additional information should be output to
     *      the console.
     */
    public SeleniumDriver(Properties properties, boolean verbose) throws Exception {
        this.properties = properties;
        this.verbose = verbose;
        getBrowserList();
    }

    //--------------------------------------------------------------------------
    // Methods to run tests
    //--------------------------------------------------------------------------

    /**
     * Runs all tests contained in the config object.
     * @param config Information about tests to run.
     * @return An array of test results based on the tests that were run.
     * @throws Exception When a test cannot be run.
     */
    public TestResult[] runTests(TestConfig config) throws Exception {
        return runTests(config.getGroups());
    }
   
    /**
     * Runs all tests contained in the TestPageGroup objects.
     * @param groups Information about tests to run.
     * @return An array of test results based on the tests that were run.
     * @throws Exception When a test cannot be run.
     */
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

    /**
     * Runs all tests contained in the TestPageGroup object.
     * @param groups Information about tests to run.
     * @return An array of test results based on the tests that were run.
     * @throws Exception When a test cannot be run.
     */
    public TestResult[] runTests(TestPageGroup group) throws Exception {
        List<TestResult> results = new LinkedList<TestResult>();

        for (int j=0; j < browsers.length; j++){
            results.addAll(runTestGroup(browsers[j], group));
        }

        return results.toArray(new TestResult[results.size()]);
    }

    //--------------------------------------------------------------------------
    // Run a test page group
    //--------------------------------------------------------------------------

    /**
     * Runs all tests in a test group on the given browser. First, determines
     * the most optimal way to run the tests, either by using a single Selenium
     * instance or by creating multiple Selenium instances.
     * @param browser The Selenium browser name to run the tests on.
     * @param group The TestPageGroup containing tests to run.
     * @return A list of TestResult objects.
     * @throws Exception If any of the tests error out.
     */
    private List<TestResult> runTestGroup(String browser, TestPageGroup group)
            throws Exception {
        
        //if there's a common base, try to optimize
        if (group.getBase().length() > 0){
            return runTestGroupOpt(browser, group);
        } else {
            return runTestGroupUnopt(browser, group);
        }
    }

    /**
     * Runs all tests in a test group using a single Selenium instance.
     * @param browser The Selenium browser name to run the tests on.
     * @param group The TestPageGroup containing tests to run.
     * @return A list of TestResult objects.
     * @throws Exception If any of the tests error out.
     */
    private List<TestResult> runTestGroupOpt(String browser, TestPageGroup group)
            throws Exception {

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

    /**
     * Runs all tests in a test group using multiple Selenium instances.
     * @param browser The Selenium browser name to run the tests on.
     * @param group The TestPageGroup containing tests to run.
     * @return A list of TestResult objects.
     * @throws Exception If any of the tests error out.
     */
    private List<TestResult> runTestGroupUnopt(String browser, TestPageGroup group)
            throws Exception {

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

    //--------------------------------------------------------------------------
    // Run a single test page
    //--------------------------------------------------------------------------

    /**
     * Runs a single test page in a given browser. It first creates a selenium
     * instance for the given browser and then runs the tests.
     * @param browser The Selenium name of the browser being run.
     * @param page The test page to run.
     * @return The results of the test being run.
     * @throws Exception If there's an error while running the test.
     */
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

    /**
     * Runs a single test page in a given browser.
     * @param selenium The Selenium object to use to run the test.
     * @param browser The Selenium name of the browser being run.
     * @param page The test page to run.
     * @return The results of the test being run.
     * @throws Exception If there's an error while running the test.
     */
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
            pageTimeout = properties.getProperty(YUITEST_TIMEOUT, "10000");
        }

        //run the tests
        try {

            selenium.open(url);

            if (!isSilent()){
                System.out.printf("\nRunning %s\n", url);
            }

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

            TestResult result = new TestResult(name, browser, url);
            RawTestResultsParser.parse(new ByteArrayInputStream(rawResults.getBytes()), result);
            result.setReport("results", results);
            result.setReport("coverage", coverage);

            //output results detail
            if (!isSilent()){

                System.out.printf("Testsuite: %s on %s\n", result.getName(), result.getBrowser());
                System.out.printf("Tests run: %d, Failures: %d, Ignored: %d\n", result.getTotal(), result.getFailed(), result.getIgnored());

                if (result.getTotal() == 0){
                    System.out.printf("Warning: No tests were run. Check the test page '%s'.\n", result.getName());
                }

                String messages[] = result.getMessages();
                if (messages.length > 0){
                    System.out.println();
                    for (int i=0; i < messages.length; i++){
                        System.out.println(messages[i]);
                    }
                }
            }

            //determine if a failure should throw an error
            if (!properties.getProperty(ERROR_ON_FAIL).equals("0") && result.getFailed() > 0){
                throw new Exception(String.format("There were %d failures in %s on %s", result.getFailed(), result.getName(), result.getBrowser()));
            }
            
            return result;
            
        } catch (SeleniumException ex){

            //probably not a valid page
            throw new Exception("Selenium failed with message: " + ex.getMessage() + ". Check the test URL " + url + " to ensure it is valid.", ex);

        } catch (Exception ex){
            throw ex;
        }

    }

    //--------------------------------------------------------------------------
    // Helper methods
    //--------------------------------------------------------------------------

    /**
     * Splits the comma-delimited list of browsers into an array of strings.
     * @throws Exception If there are no browsers specified.
     */
    private void getBrowserList() throws Exception {

        browsers = (properties.getProperty("selenium.browsers", "")).split("\\,");
        if(browsers.length == 0){
            throw new Exception("The configuration property 'selenium.browsers' is missing.");
        }
    }

    /**
     * Creates a Selenium instance for the given browser and with the given base
     * URL. The instance is then started and returned.
     * @param browser The Selenium browser name to create an instance for.
     * @param base The base URL to test.
     * @return A Selenium instance based on the given information.
     */
    private Selenium startBrowser(String browser, String base){
        Selenium selenium = new DefaultSelenium(properties.getProperty(SELENIUM_HOST),
                Integer.parseInt(properties.getProperty(SELENIUM_PORT)), browser, base);

        selenium.start();

        return selenium;
    }
            
    /**
     * Determines if the driver is being run in silent mode.
     * @return True if the driver is in silent mode, false if not.
     */
    private boolean isSilent(){
        return properties.getProperty(CONSOLE_MODE, "normal").equals("silent");
    }
}
