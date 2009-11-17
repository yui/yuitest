/*
 * YUI Test
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.results;

/**
 * Represents a single test result.
 * @author Nicholas C. Zakas
 */
public class Test {

    public static final int PASS = 0;
    public static final int FAIL = 1;
    public static final int IGNORE = 2;

    private String name;
    private int result;
    private String message;
    private String stackTrace;
    private int duration;
    private TestCase parent;

    protected Test(String name, int duration, int result, String message) {
        this.name = name;
        this.result = result;
        this.message = message;
        this.duration = duration;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public int getDuration(){
        return duration;
    }

    protected void setStackTrace(String stackTrace){
        this.stackTrace = stackTrace;
    }

    public TestCase getParent(){
        return parent;
    }

    protected void setParent(TestCase parent){
        this.parent = parent;
    }

    public String getPath(){
        return getPath(TestReport.PATH_SEPARATOR);
    }

    public String getPath(String separator){
        return (parent != null ? parent.getPath() + separator : "") + name;
    }

    public boolean getFailed(){
        return result == FAIL;
    }
}
