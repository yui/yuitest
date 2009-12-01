/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.converters;

import com.yahoo.platform.yuitest.results.TestReport;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Date;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;

/**
 *
 * @author Nicholas C. Zakas
 */
public class StringTemplateTestReportConverter implements TestReportConverter {

    protected Writer out;
    protected StringTemplateGroup templateGroup;

    public StringTemplateTestReportConverter(Writer out, String format) throws IOException {
        this.out = out;
        this.templateGroup = getStringTemplateGroup(format);
    }

    private StringTemplateGroup getStringTemplateGroup(String format) throws IOException{
        //get string template group
        InputStream stgstream = StringTemplateTestReportConverter.class.getResourceAsStream(format + "TestReportTemplates.stg");
        InputStreamReader reader = new InputStreamReader(stgstream);
        StringTemplateGroup group = new StringTemplateGroup(reader, DefaultTemplateLexer.class);
        reader.close();
        return group;
    }

    public void write(TestReport report) throws IOException {
        write(report, new Date());
    }

    public void write(TestReport report, Date date) throws IOException {
        StringTemplate template = templateGroup.getInstanceOf("report");
        template.setAttribute("report", report);
        template.setAttribute("date", date);
        out.write(template.toString());
    }

    public void close() throws IOException {
        out.close();
    }
}
