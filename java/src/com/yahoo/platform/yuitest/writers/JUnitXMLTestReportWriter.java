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
import java.io.Writer;
import java.util.Date;
import org.antlr.stringtemplate.AttributeRenderer;
import org.antlr.stringtemplate.StringTemplate;

/**
 *
 * @author Nicholas C. Zakas
 */
public class JUnitXMLTestReportWriter extends StringTemplateTestReportWriter
        implements TestReportWriter {

    public JUnitXMLTestReportWriter(Writer out) throws IOException {
        super(out, "JUnitXML");
    }

    @Override
    public void write(TestReport report, Date date) throws IOException {
        StringTemplate template = templateGroup.getInstanceOf("report");
        template.setAttribute("report", report);
        template.setAttribute("date", date);

        template.registerRenderer(Integer.class, new AttributeRenderer(){

            public String toString(Object o) {
                return o.toString();
            }

            public String toString(Object o, String format) {
                if (format.equals("seconds")){
                    return String.valueOf(Double.parseDouble(o.toString()) / 1000);
                } else {
                    return o.toString();
                }
            }
        });

        template.registerRenderer(String.class, new AttributeRenderer(){

            public String toString(Object o) {
                return o.toString();
            }

            public String toString(Object o, String format) {
                if (format.equals("classname")){
                    return o.toString().replace(TestReport.PATH_SEPARATOR, ".").replaceAll("[^a-zA-Z0-9\\\\.]", "");
                } else if (format.equals("escape")){
                    return o.toString().replace("&", "&amp;").replace(">", "&gt;").replace("<", "&lt;").replace("\"", "&quot;").replace("'", "&apos;");
                } else {
                    return o.toString();
                }
            }
        });

        out.write(template.toString());
    }



}
