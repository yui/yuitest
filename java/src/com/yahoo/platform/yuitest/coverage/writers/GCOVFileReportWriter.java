/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.writers;

import com.yahoo.platform.yuitest.coverage.results.FileReport;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import org.antlr.stringtemplate.AttributeRenderer;

/**
 *
 * @author Nicholas C. Zakas
 */
public class GCOVFileReportWriter extends StringTemplateFileReportWriter {

    public GCOVFileReportWriter(Writer out) {
        super(out, "GCOV");
    }

    @Override
    public void write(FileReport report, Date date) throws IOException {

        //assign renderer
        template.registerRenderer(Integer.class, new AttributeRenderer(){

            public String toString(Object o) {
                return o.toString();
            }

            public String toString(Object o, String format) {
                if (format.equals("padLeft")){
                    int value = Integer.parseInt(o.toString());
                    String result = o.toString();
                    if (value > 9999){
                        return result;
                    } else if (value > 999){
                        return " " + result;
                    } else if (value > 99){
                        return "  " + result;
                    } else if (value > 9){
                        return "   " + result;
                    } else {
                        return "    " + result;
                    }
                } else {
                    return o.toString();
                }
            }
        });


        super.write(report, date);
    }


}
