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

/**
 * Provides basic string template loading for writers.
 * @author Nicholas C. Zakas
 */
public class StringTemplateFileReportWriter extends AbstractStringTemplateReportWriter
        implements FileReportWriter {

    public StringTemplateFileReportWriter(Writer out, String templateName){
        super(out, templateName + "FileReportTemplate");
    }

    /**
     * Passthrough to overloaded write() with a date representing now.
     * @param report The file report to write
     * @throws IOException
     */
    public void write(FileReport report) throws IOException {
        write(report, new Date());
    }

    /**
     * Writes a report out to the writer.
     * @param report The report to write out.
     * @param date The date to specify in the report.
     * @throws IOException
     */
    public void write(FileReport report, Date date) throws IOException {
        template.setAttribute("report", report);
        template.setAttribute("date", date);
        out.write(template.toString());
    }

}
