/*
 * YUI Test Selenium Driver
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.selenium;

/**
 * Represents the relevant data related to a test run.
 * @author Nicholas C. Zakas
 */
public class SessionResult {

    public static final String XML_FORMAT = "XML";
    public static final String JSON_FORMAT = "JSON";
    public static final String JUNIT_XML_FORMAT = "JUnitXML";
    public static final String TAP_FORMAT = "TAP";

    private String url;
    private String browser;
    private String resultsReportText = null;
    private String coverageReportText = null;
    private String name;
    private int failed = 0;
    private int passed = 0;
    private int ignored = 0;
    private String[] messages;

    protected SessionResult(String name, String browser, String url) {
        this.url = url;
        this.browser = browser;
        this.name = name;
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

    public int getFailed() {
        return failed;
    }

    public void setFailed(int failures) {
        this.failed = failures;
    }

    public int getIgnored() {
        return ignored;
    }

    protected void setIgnored(int ignored) {
        this.ignored = ignored;
    }

    public String[] getMessages() {
        return messages;
    }

    protected void setMessages(String[] messages) {
        this.messages = messages;
    }

    public int getPassed() {
        return passed;
    }

    protected void setPassed(int passed) {
        this.passed = passed;
    }

    public int getTotal(){
        return passed + failed;
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
