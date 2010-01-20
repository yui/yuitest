/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.report;

import com.yahoo.platform.yuitest.coverage.results.SummaryReport;
import java.io.IOException;

/**
 *
 * @author nzakas
 */
public interface ReportGenerator {
    public void generate(SummaryReport report) throws IOException;
}
