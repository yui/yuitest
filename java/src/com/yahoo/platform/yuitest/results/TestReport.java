/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.results;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author Nicholas C. Zakas
 */
public class TestReport extends TestSuite {

    protected TestReport(String name, int duration, int passed, int failed, int ignored) {
        super(name, duration, passed, failed, ignored);
    }

    public static TestReport load(InputStream in) throws IOException {
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
