/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.writers;

import java.io.Writer;

/**
 *
 * @author Nicholas C. Zakas
 */
public class TestReportWriterFactory {

    public static TestReportWriter getWriter(Writer out, String format) throws Exception {
        try {
            return new StringTemplateTestReportWriter(out, format);
        } catch(Exception ex){
            throw new Exception(String.format("No writer for '%s' found.", format));
        }
    }
}
