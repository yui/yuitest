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
import java.util.HashMap;
import java.util.Properties;


/**
 * Controls Selenium to extract YUI Test information.
 * @author Nicholas C. Zakas
 */
public class SeleniumDriver {
    
    private static HashMap<String,String> testRunners = new HashMap<String,String>();
    private static HashMap<String,String> testFormats = new HashMap<String,String>();
    private static String jsWindow = "selenium.browserbot.getCurrentWindow()";
    
    static {
        testRunners.put("2", "YAHOO.tool.TestRunner");
        testRunners.put("3", "Y.Test.Runner");
        
        testFormats.put("2", "YAHOO.tool.TestFormat");
        testFormats.put("3", "Y.Test.Format");
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
        
        
        //strings to use
        String testRunnerIsNotRunning = "!" + testRunner + ".isRunning()";
        String testResults = testRunner + ".getResults(" + testFormat + "." + 
                properties.getProperty("yuitest.results.format", "JUnitXML") +
                ");";      
        
        if (verbose){
            System.err.println("[INFO] Starting browser '" + browser + "'");
        }
        
        Selenium selenium = null;
        
        try {
            //start up selenium
            selenium = new DefaultSelenium(properties.getProperty("selenium.host"), 
                    Integer.parseInt(properties.getProperty("selenium.port")), browser, url);        
            selenium.start();
            selenium.open(url);
            
            if (verbose){
                System.err.println("[INFO] Navigating to '" + url + "'");
            }            
            
            //wait until the testrunner is done
            selenium.waitForPageToLoad(properties.getProperty("selenium.waitforload", "10000"));
            
            if (verbose){
                System.err.println("[INFO] Page is loaded.");
            }

            selenium.waitForCondition(testRunnerIsNotRunning, properties.getProperty("selenium.waitfordone", "10000"));

            if (verbose){
                System.err.println("[INFO] Tests are complete.");
            }            
            
            //get results
            String results = selenium.getEval(testResults);

            System.out.println(results);
        } catch (Exception ex){
            throw ex;
        } finally {
            if (selenium != null){
                selenium.stop();
            }
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
