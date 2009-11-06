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
import java.util.HashMap;
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

    public static final String COVERAGE_OUTPUTDIR = "coverage.outputdir";
    public static final String COVERAGE_FILENAME = "coverage.filename";
    public static final String COVERAGE_FORMAT = "coverage.format";

    public static final String RESULTS_OUTPUTDIR = "results.outputdir";
    public static final String RESULTS_FILENAME = "results.filename";
    public static final String RESULTS_FORMAT = "results.format";

    public static final String SELENIUM_HOST = "selenium.host";
    public static final String SELENIUM_PORT = "selenium.port";
    public static final String SELENIUM_BROWSERS = "selenium.browsers";

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
    private Boolean verbose;
    
    /**
     * The list of YUI Test URLs to test.
     */
    private String[] urls;
    
    /**
     * The list of Selenium browsers to test.
     */
    private String[] browsers;
    
    /**
     * Creates a new instance.
     * @param properties
     * @param verbose
     */
    public SeleniumDriver(Properties properties, boolean verbose){
        this.properties = properties;
        this.verbose = verbose;
    }

    /**
     * Starts the testing process.
     */
    public void start() throws Exception{
        
        getURLsAndBrowsers();
        
        for(int i=0; i < urls.length; i++){
            for (int j=0; j < browsers.length; j++){
                runTest(browsers[j], urls[i]);
            }
        }
        
    }
    
    /**
     * Runs a YUI Test url against a given browser.
     * @param browser The Selenium browser to run against.
     * @param url The URL of the YUI Tests to run.
     * @throws java.lang.Exception
     */
    private void runTest(String browser, String url) throws Exception {
        
        //basic YUI Test info
        String yuitestVersion = properties.getProperty("yuitest.version", "2");
        String testRunner = jsWindow + "." + testRunners.get(yuitestVersion);
        String testFormat = jsWindow + "." + testFormats.get(yuitestVersion);
        String coverageFormat = jsWindow + "." + coverageFormats.get(yuitestVersion);
                
        //JS strings to use
        String testRunnerIsNotRunning = "!" + testRunner + ".isRunning()";
        String testResults = testRunner + ".getResults(" + testFormat + "." + 
                properties.getProperty("results.format", "JUnitXML") +
                ");";    
        String testCoverage = testRunner + ".getCoverage(" + coverageFormat + "." + 
                properties.getProperty("coverage.format", "JSON") +
                ");";
        String testName = testRunner + ".getName();";
        
        if (verbose){
            System.err.println("[INFO] Starting browser '" + browser + "'");
        }
        
        Selenium selenium = null;
        String results = "";
        String coverage = "";
        String name = "";
        
        //run the tests
        try {
            //start up selenium
            selenium = new DefaultSelenium(properties.getProperty(SELENIUM_HOST),
                    Integer.parseInt(properties.getProperty(SELENIUM_PORT)), browser, url);
            
            selenium.start();
            selenium.open(url);
            
            if (verbose){
                System.err.println("[INFO] Navigating to '" + url + "'");
            }            

            selenium.waitForPageToLoad(properties.getProperty("selenium.waitforload", "10000"));
            
            if (verbose){
                System.err.println("[INFO] Page is loaded.");
            }

            selenium.waitForCondition(testRunnerIsNotRunning, properties.getProperty("selenium.waitfordone", "1000000"));

            if (verbose){
                System.err.println("[INFO] Tests are complete.");
            }            
            
            //get results
            results = selenium.getEval(testResults);            
            coverage = selenium.getEval(testCoverage);
            name = selenium.getEval(testName);

        } catch (SeleniumException ex){

            //probably not a valid page
            throw new Exception("Selenium failed with message: " + ex.getMessage() + ". Check the test URL " + url + " to ensure it is valid.", ex);

        } catch (Exception ex){
            //TODO: What should happen here? Default file generation?
            throw ex;
        } finally {
            if (selenium != null){
                selenium.stop();
            }
        }

        //save the results
        try {
            FileGenerator generator = new FileGenerator(properties, verbose);
            //output the reports
            generator.generate(name, results, "results", browser);
            if (!coverage.equals("null")){
                generator.generate(name, coverage, "coverage", browser);
            }
            
        } catch (Exception ex){
            //what to do?
            throw ex;
        }
    }        
    
    private void getURLsAndBrowsers() throws Exception {
        
        //try to get list of URLs to hit
        urls = (properties.getProperty("yuitest.urls", "")).split("\\,");
        if(urls.length == 0){
            throw new Exception("The configuration property 'yuitest.urls' is missing.");
        }
        
        //try to get list of browsers to hit
        browsers = (properties.getProperty("selenium.browsers", "")).split("\\,");
        if(browsers.length == 0){
            throw new Exception("The configuration property 'selenium.browsers' is missing.");
        }
    }
            

}
