/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.converters;

import java.io.Writer;

/**
 *
 * @author Nicholas C. Zakas
 */
public class TestReportConverterFactory {

    public static TestReportConverter getConverter(String format, Writer out) throws Exception {
        try {
            Class c = Class.forName("com.yahoo.platform.yuitest.converters." + format + "TestReportConverter");
            return (TestReportConverter) c.getConstructor(new Class[]{Writer.class}).newInstance(new Object[]{out});
        } catch(Exception ex){
            throw new Exception(String.format("No converter for '%s' found.", format));
        }
    }
}
