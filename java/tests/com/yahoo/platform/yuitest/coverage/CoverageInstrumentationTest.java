/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.antlr.runtime.RecognitionException;
import static org.junit.Assert.*;

/**
 * This test case tests whether instrumentation is working correctly for various
 * scenarios. The tests are done by comparing plain-text files against the actual
 * output of the instrumenter.
 * @author nzakas
 */
public class CoverageInstrumentationTest {

    BufferedReader actual;
    BufferedReader expected;

    public CoverageInstrumentationTest() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws IOException {
        if (actual != null){
            actual.close();
        }
        if (expected != null){
            expected.close();
        }
    }

    private String getFileContents(String filename) throws IOException {
        Reader in = new InputStreamReader(CoverageInstrumentationTest.class.getResourceAsStream(filename));
        StringBuilder builder = new StringBuilder();
        int c;

        while((c = in.read()) != -1){
            builder.append((char)c);
        }

        in.close();
        return builder.toString();
    }

    private void assertResultsMatch(String sourceFilename, String resultFilename) throws IOException{
        Reader in = new InputStreamReader(CoverageInstrumentationTest.class.getResourceAsStream(sourceFilename));
        Writer out = new StringWriter();
        JavaScriptInstrumenter instrumenter = new JavaScriptInstrumenter(in, sourceFilename);

        try {
            instrumenter.instrument(out, false);
        } catch (RecognitionException ex){
            throw new RuntimeException(ex);
        }

        String actualResult = out.toString();
        String expectedResult = getFileContents(resultFilename);

        actual = new BufferedReader(new StringReader(actualResult));
        expected = new BufferedReader(new StringReader(expectedResult));
        String actualLine, expectedLine;
        
        int i=0;
        while((actualLine = actual.readLine()) != null){
            i++;
            expectedLine = expected.readLine();
            assertEquals("Line " + i + " doesn't match", expectedLine, actualLine);
        }
      
    }

    @Test
    public void testArrayItem() throws IOException {
        assertResultsMatch("array-item.js", "array-item-covered.js");
    }

    @Test
    public void testEmptyFile() throws IOException {
        assertResultsMatch("empty.js", "empty-covered.js");
    }

    @Test
    public void testStringProperty() throws IOException {
        assertResultsMatch("string-property.js", "string-property-covered.js");
    }

    @Test
    public void testNoBraces() throws IOException {
        assertResultsMatch("nobraces.js", "nobraces-covered.js");
    }

}