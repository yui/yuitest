/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.results;

import java.io.InputStreamReader;
import java.io.Reader;
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
public class DirectoryReportTest {

    private DirectoryReport report;

    public DirectoryReportTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        Reader in = new InputStreamReader(SummaryReportTest.class.getResourceAsStream("coverage.json"));
        SummaryReport summaryReport = new SummaryReport(in);
        summaryReport.merge(new SummaryReport(new InputStreamReader(SummaryReportTest.class.getResourceAsStream("coverage2.json"))));
        report = summaryReport.getDirectoryReports()[0];
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDirectory method, of class DirectoryReport.
     */
    @Test
    public void testGetDirectory() {
        assertEquals("build", report.getDirectory());
    }
    /**
     * Test of getFileReports method, of class DirectoryReport.
     */
    @Test
    public void testGetFileReports() {
        FileReport[] result = report.getFileReports();
        assertEquals(2, result.length);
        assertEquals("build/cookie.js", result[0].getFilename());
    }

    /**
     * Test of getCoveredLineCount method, of class DirectoryReport.
     */
    @Test
    public void testGetCoveredLineCount() throws Exception {
        FileReport[] fileReports = report.getFileReports();
        assertEquals(fileReports[0].getCoveredLineCount() + fileReports[1].getCoveredLineCount(), report.getCoveredLineCount());
    }

    /**
     * Test of getCalledLineCount method, of class DirectoryReport.
     */
    @Test
    public void testGetCalledLineCount() throws Exception {
        FileReport[] fileReports = report.getFileReports();
        assertEquals(fileReports[0].getCalledLineCount() + fileReports[1].getCalledLineCount(), report.getCalledLineCount());
    }

    /**
     * Test of getCalledLinePercentage method, of class DirectoryReport.
     */
    @Test
    public void testGetCalledLinePercentage() throws Exception {
        FileReport[] fileReports = report.getFileReports();
        assertEquals((double)(fileReports[0].getCalledLinePercentage() + fileReports[1].getCalledLinePercentage())/2, report.getCalledLinePercentage(), 0.0);
    }

    /**
     * Test of getCalledLinePercentageName method, of class DirectoryReport.
     */
    @Test
    public void testGetCalledLinePercentageName() throws Exception {
        assertEquals("high", report.getCalledLinePercentageName());
    }

    /**
     * Test of getCoveredFunctionCount method, of class DirectoryReport.
     */
    @Test
    public void testGetCoveredFunctionCount() throws Exception {
        FileReport[] fileReports = report.getFileReports();
        assertEquals(fileReports[0].getCoveredFunctionCount() + fileReports[1].getCoveredFunctionCount(), report.getCoveredFunctionCount());
    }

    /**
     * Test of getCalledFunctionCount method, of class DirectoryReport.
     */
    @Test
    public void testGetCalledFunctionCount() throws Exception {
        FileReport[] fileReports = report.getFileReports();
        assertEquals(fileReports[0].getCalledFunctionCount() + fileReports[1].getCalledFunctionCount(), report.getCalledFunctionCount());
    }

    /**
     * Test of getCalledFunctionPercentage method, of class DirectoryReport.
     */
    @Test
    public void testGetCalledFunctionPercentage() throws Exception {
        assertEquals(0, report.getCalledFunctionPercentage(), 0.0);
    }

    /**
     * Test of getCalledFunctionPercentageName method, of class DirectoryReport.
     */
    @Test
    public void testGetCalledFunctionPercentageName() throws Exception {
        assertEquals("med", report.getCalledFunctionPercentageName());
    }

}