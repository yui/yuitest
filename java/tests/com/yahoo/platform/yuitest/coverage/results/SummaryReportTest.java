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
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.json.*;
import static org.junit.Assert.*;

/**
 *
 * @author Nicholas C. Zakas
 */
public class SummaryReportTest {

    public SummaryReportTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSummaryReportLoad() throws IOException, JSONException {
        Reader in = new InputStreamReader(SummaryReportTest.class.getResourceAsStream("coverage.json"));
        SummaryReport report = new SummaryReport(in);

        //make sure the number of file reports is correct
        FileReport[] fileReports = report.getFileReports();
        assertEquals(1, fileReports.length);
    }

}