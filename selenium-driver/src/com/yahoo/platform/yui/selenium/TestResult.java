/*
 * YUI Test Selenium Driver
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yui.selenium;

/**
 * Represents the relevant data related to a test run.
 * @author Nicholas C. Zakas
 */
public class TestResult {

    public static final String XML_FORMAT = "XML";
    public static final String JSON_FORMAT = "JSON";
    public static final String JUNIT_XML_FORMAT = "JUnitXML";
    public static final String TAP_FORMAT = "TAP";

    private String url;
    private String browser;
    private String resultsReportText = null;
    private String coverageReportText = null;
    private String rawResults = null;
    private String name;

    protected TestResult(String name, String browser, String url, String rawResults) {
        this.url = url;
        this.browser = browser;
        this.name = name;
        this.rawResults = rawResults;
    }

    public String getBrowser() {
        return browser;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    protected String getResults(){
        return rawResults;
    }

    protected void setReport(String type, String reportText){
        if (type.equals("coverage")){
            coverageReportText = reportText;
        } else {
            resultsReportText = reportText;
        }
    }

    public String getReport(String type){
        if (type.equals("coverage")){
            return coverageReportText;
        } else {
            return resultsReportText;
        } 
    }

    public boolean hasReport(String type){
        if (type.equals("coverage")){
            return coverageReportText != null;
        } else {
            return resultsReportText != null;
        }
    }
}
