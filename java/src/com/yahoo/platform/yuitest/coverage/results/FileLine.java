/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.results;

/**
 * Represents a single line in a file.
 * @author Nicholas C. Zakas
 */
public class FileLine {

    private String text;
    private int lineNumber;
    private int callCount;
    
    protected FileLine(int lineNumber, String text, int callCount){
        this.lineNumber = lineNumber;
        this.text = text;
        this.callCount = callCount;
    }
    
    public int getCallCount() {
        return callCount;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getText() {
        return text;
    }
    
    public String getHTML(){
        return text.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;").replace(" ", "&nbsp;");
    }
    
    public boolean getIsCovered(){
        return callCount > -1;
    }
    
    public boolean getIsCalled(){
        return callCount > 0;
    }
  
}
