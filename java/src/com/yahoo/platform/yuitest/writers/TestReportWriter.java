/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.writers;

import com.yahoo.platform.yuitest.results.TestReport;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Nicholas C. Zakas
 */
public interface TestReportWriter {
    public void write(TestReport report) throws IOException;
    public void write(TestReport report, Date date) throws IOException;
    public void close() throws IOException;
}
