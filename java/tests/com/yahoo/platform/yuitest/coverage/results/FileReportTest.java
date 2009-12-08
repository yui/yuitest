/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.results;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nzakas
 */
public class FileReportTest {

    private FileReport report;


    public FileReportTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws IOException, JSONException {
        Reader in = new InputStreamReader(SummaryReportTest.class.getResourceAsStream("coverage.json"));
        SummaryReport summaryReport = new SummaryReport(in);
        report = summaryReport.getFileReport(0);
    }

    @After
    public void tearDown() {
        report = null;
    }

    /**
     * Test of getFilename method, of class FileReport.
     */
    @Test
    public void testGetFilename() {
        String expResult = "cookie.js";
        String result = report.getFilename();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPath method, of class FileReport.
     */
    @Test
    public void testGetPath() {
        String expResult = "C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\tests\\cookie.js";
        String result = report.getPath();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoveredLineCount method, of class FileReport.
     */
    @Test
    public void testGetTotalLineCount() throws Exception {
        assertEquals(127, report.getCoveredLineCount());
    }

    /**
     * Test of getCalledLineCount method, of class FileReport.
     */
    @Test
    public void testGetCalledLineCount() throws Exception {
        assertEquals(109, report.getCalledLineCount());
    }

    /**
     * Test of getCalledLinePercentage method, of class FileReport.
     */
    @Test
    public void testGetCalledLinePercentage() throws Exception {
        assertEquals(85.83, report.getCalledLinePercentage(), 0.05);
    }

    /**
     * Test of getTotalFunctionCount method, of class FileReport.
     */
    @Test
    public void testGetTotalFunctionCount() throws Exception {
        assertEquals(14, report.getTotalFunctionCount());
    }

    /**
     * Test of getCalledFunctionCount method, of class FileReport.
     */
    @Test
    public void testGetCalledFunctionCount() throws Exception {
        assertEquals(13, report.getCalledFunctionCount());
    }

    /**
     * Test of getCalledFunctionPercentage method, of class FileReport.
     */
    @Test
    public void testGetCalledFunctionPercentage() throws Exception {
        assertEquals(92.86, report.getCalledFunctionPercentage(), 0.05);
    }

    /**
     * Test of getLine method, of class FileReport.
     */
    @Test
    public void testGetUncoveredLine() throws Exception {
        FileLine result = report.getLine(1);
        assertEquals(-1, result.getCallCount());
        assertFalse(result.isCovered());
        assertFalse(result.isCalled());
        assertEquals("/**", result.getText());
        assertEquals(1, result.getLineNumber());
    }

    /**
     * Test of getLine method, of class FileReport.
     */
    @Test
    public void testGetCoveredandCalledLine() throws Exception {
        FileLine result = report.getLine(6);
        assertEquals(1, result.getCallCount());
        assertTrue(result.isCovered());
        assertTrue(result.isCalled());
        assertEquals("YAHOO.namespace(\"util\");", result.getText());
        assertEquals(6, result.getLineNumber());

    }

    /**
     * Test of getLine method, of class FileReport.
     */
    @Test
    public void testGetCoveredandNotCalledLine() throws Exception {
        FileLine result = report.getLine(76);
        assertEquals(0, result.getCallCount());
        assertTrue(result.isCovered());
        assertFalse(result.isCalled());
        assertEquals("            throw new TypeError(\"Cookie._createCookieHashString(): Argument must be an object.\");", result.getText());
        assertEquals(76, result.getLineNumber());

    }

    /**
     * Test of getLines method, of class FileReport.
     */
    @Test
    public void testGetLines() throws Exception {
        FileLine[] result = report.getLines();
        assertEquals(476, result.length);
        
        FileLine line = report.getLine(1);
        assertEquals(line.getCallCount(), result[0].getCallCount());
        assertEquals(line.isCovered(), result[0].isCovered());
        assertEquals(line.isCalled(), result[0].isCalled());
        assertEquals(line.getText(), result[0].getText());
        assertEquals(line.getLineNumber(), result[0].getLineNumber());
    }

    /**
     * Test of getLineCallCount method, of class FileReport.
     */
    @Test
    public void testGetLineCallCount() throws Exception {
        assertEquals(-1, report.getLineCallCount(1));
        assertEquals(1, report.getLineCallCount(6));
        assertEquals(2, report.getLineCallCount(371));
    }

    /**
     * Test of getFunctionCallCount method, of class FileReport.
     */
    @Test
    public void testGetFunctionCallCount() throws Exception {
        System.out.println("getFunctionCallCount");
        String functionName = "";
        FileReport instance = null;
        int expResult = 0;
        int result = instance.getFunctionCallCount(functionName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFunctionNames method, of class FileReport.
     */
    @Test
    public void testGetFunctionNames() throws Exception {
        System.out.println("getFunctionNames");
        FileReport instance = null;
        String[] expResult = null;
        String[] result = instance.getFunctionNames();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJSONObject method, of class FileReport.
     */
    @Test
    public void testToJSONObject() {
        System.out.println("toJSONObject");
        FileReport instance = null;
        JSONObject expResult = null;
        JSONObject result = instance.toJSONObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReportName method, of class FileReport.
     */
    @Test
    public void testGetReportName() {
        assertEquals("cookie.js", report.getReportName());

    }

    /**
     * Test of toString method, of class FileReport.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FileReport instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}