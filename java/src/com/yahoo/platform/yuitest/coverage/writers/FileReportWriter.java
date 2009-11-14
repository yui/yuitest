/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.writers;

import com.yahoo.platform.yuitest.coverage.report.FileReport;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Nicholas C. Zakas
 */
public interface FileReportWriter {
    public void write(FileReport report) throws IOException;
    public void write(FileReport report, Date date) throws IOException;
    public void close() throws IOException;
}
