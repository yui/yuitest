/*
 * YUI Test Selenium Driver
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yui.selenium;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 * Represents all tests that need to be executed.
 * @author Nicholas C. Zakas
 */
public class TestConfig {

    private TestPageGroup[] groups;

    /**
     * Creates a new instance.
     */
    public TestConfig(){
    }

    /**
     * Loads test configuration information from the specific input stream.
     * @param in The stream to read the data from.
     * @throws SAXException When there's an XML parse error.
     * @throws IOException When the input stream can't be read.
     */
    public void load(InputStream in) throws SAXException, IOException {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser parser = null;
        TestConfigHandler handler = new TestConfigHandler();

        try {
            parser = spf.newSAXParser();
            parser.parse(in, handler);
            groups = handler.getGroups();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(TestConfig.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Returns all groups.
     * @return All groups.
     */
    public TestPageGroup[] getGroups(){
        return groups;
    }
}
