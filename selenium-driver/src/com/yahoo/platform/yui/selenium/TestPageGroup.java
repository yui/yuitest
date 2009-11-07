/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yahoo.platform.yui.selenium;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author nzakas
 */
public class TestPageGroup {

    private String base = "";
    private int version;
    private List<TestPage> testPages = null;
    private int timeout = -1;

    public TestPageGroup(String base, int version, int timeout){
        this.base = base;
        this.version = version;
        this.timeout = timeout;
        this.testPages = new LinkedList<TestPage>();
    }

    public void add(TestPage testPage){
        testPages.add(testPage);
    }

    public TestPage[] getTestPages(){
        TestPage[] result = new TestPage[testPages.size()];
        testPages.toArray(result);
        return result;
    }

    public String getBase(){
        return base;
    }

    public int getVersion(){
        return version;
    }

    public int getTimeout(){
        return timeout;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("GROUP! Version=" + version + ", Base=" + base + ", Timeout=" + timeout);
        builder.append(testPages.toString());
        return builder.toString();
    }

}
