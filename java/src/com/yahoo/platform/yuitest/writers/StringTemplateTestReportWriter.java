/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.writers;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import org.antlr.stringtemplate.StringTemplateGroup;

/**
 *
 * @author Nicholas C. Zakas
 */
public class StringTemplateTestReportWriter {

    private String groupName;
    private Writer out;
    private StringTemplateGroup templateGroup;

    public StringTemplateTestReportWriter(Writer out, String format) throws IOException {
        this.out = out;
        this.templateGroup = getStringTemplateGroup(format);
    }


    private StringTemplateGroup getStringTemplateGroup(String format) throws IOException{
        //get string template group
        InputStream stgstream = StringTemplateTestReportWriter.class.getResourceAsStream(format + "TestReportTemplates.stg");
        InputStreamReader reader = new InputStreamReader(stgstream);
        StringTemplateGroup group = new StringTemplateGroup(reader);
        reader.close();
        return group;
    }
}
