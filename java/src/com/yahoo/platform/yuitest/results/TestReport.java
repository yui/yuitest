/*
 * YUI Test
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.results;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;

/**
 *
 * @author Nicholas C. Zakas
 */
public class TestReport extends TestSuite {

    public static final String PATH_SEPARATOR = "\\";

    private String browser = "";

    protected TestReport(String name, int duration, int passed, int failed, int ignored) {
        super(name, duration, passed, failed, ignored);
    }

    protected void setBrowser(String browser){
        this.browser = browser;
    }

    @Override
    public String getPath(){
        return (!browser.equals("") ? browser + " > " : "") + getName();
    }

    public static TestReport load(File file) throws IOException {
        return load(new FileInputStream(file));
    }

    public static TestReport load(InputStream in) throws IOException {
        return load(new InputSource(in));
    }

    public static TestReport load(Reader in) throws IOException {
        return load(new InputSource(in));
    }

    public static TestReport load(InputSource in) throws IOException {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser parser = null;
        TestReportXMLHandler handler = new TestReportXMLHandler();

        try {
            parser = spf.newSAXParser();
            parser.parse(in, handler);
        } catch (Exception ex) {
            throw new IOException("XML could not be parsed.");
        }

        return handler.getTestReport();

    }

}
