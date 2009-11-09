/*
 * YUI Test Selenium Driver
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yui.selenium;

/**
 *
 * @author Nicholas C. Zakas
 */
public class TestPage {

    private TestPageGroup owner = null;
    private String path = null;
    private int timeout = 10000;
    private int version = -1;

    public TestPage(String path){
        this.path = path;
    }

    public TestPage(String path, int version){
        this.path = path;
        this.version = version;
    }

    public TestPage(String path, int version, int timeout){
        this.path = path;
        this.version = version;
        this.timeout = timeout;
    }

    public TestPage(TestPageGroup owner, int version, int timeout){
        this.owner = owner;
        this.timeout = timeout;
        this.version = version;
    }

    public TestPage(TestPageGroup owner, String path, int version, int timeout){
        this.owner = owner;
        this.path = path;
        this.timeout = timeout;
        this.version = version;
    }

    public void setPath(String path){
        this.path = path;
    }
    
    public String getPath() {
        return path;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getVersion(){
        return version;
    }

    public String getAbsolutePath(){
        return owner.getBase() + path;
    }

    @Override
    public String toString(){
        return "{path:" + getAbsolutePath() + ",version=" + version + ",timeout=" + timeout + "}";
    }

}
