/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.results;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Nicholas C. Zakas
 */
public class TestCase {

    private String name;
    private int duration;
    private List<Test> tests;
    private int passed = 0;
    private int failed = 0;
    private int ignored = 0;

    protected TestCase(String name, int duration, int passed, int failed, int ignored){
        this.name = name;
        this.duration = duration;
        this.passed = passed;
        this.failed = failed;
        this.ignored = ignored;
        this.tests = new LinkedList<Test>();
    }

    protected void addTest(Test test){
        tests.add(test);
    }

    public int getDuration() {
        return duration;
    }

    public int getFailed() {
        return failed;
    }

    public int getIgnored() {
        return ignored;
    }

    public String getName() {
        return name;
    }

    public int getPassed() {
        return passed;
    }
            
    public Test[] getTests(){
        return tests.toArray(new Test[tests.size()]);
    }


}
