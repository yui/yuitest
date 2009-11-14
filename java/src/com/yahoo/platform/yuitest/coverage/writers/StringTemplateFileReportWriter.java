/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yahoo.platform.yuitest.coverage.writers;

import com.yahoo.platform.yuitest.coverage.report.FileReport;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import org.antlr.stringtemplate.StringTemplate;

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
        StringTemplate template = getStringTemplate();

        template.setAttribute("report", report);
        template.setAttribute("date", date);

        out.write(template.toString());
    }

}
