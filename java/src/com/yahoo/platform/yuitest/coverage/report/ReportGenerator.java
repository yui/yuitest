/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.report;

import com.yahoo.platform.yuitest.coverage.writers.StringTemplateFileReportWriter;
import com.yahoo.platform.yuitest.coverage.writers.StringTemplateSummaryReportWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;

/**
 * Grouping for generation of coverage reports.
 * @author Nicholas C. Zakas
 */
public class ReportGenerator {
    
    private static boolean verbose = false;
    
    /**
     * Returns the current verbose setting.
     * @return The current verbose setting.
     */
    public static boolean getVerbose(){
        return verbose;
    }
    
    /**
     * Sets the verbose setting.
     * @param newVerbose True to turn on verbose mode, false to turn off.
     */
    public static void setVerbose(boolean newVerbose){
        verbose = newVerbose;
    }

    /**
     * Outputs an HTML report for the given FileReport object.
     * @param report Object containing information to be output.
     * @param out Where to write the data.
     * @throws java.io.IOException
     */
    public static void generate(FileReport report, Writer out) throws IOException {
        generate(report, out, new Date());
    }
    
    /**
     * Outputs an HTML report for the given FileReport object.
     * @param report Object containing information to be output.
     * @param out Where to write the data.
     * @param date The date stamp for the report.
     * @throws java.io.IOException
     */
    public static void generate(FileReport report, Writer out, Date date) throws IOException {
        StringTemplateFileReportWriter reportWriter = new StringTemplateFileReportWriter(out, "HTML");
        reportWriter.write(report, date);
    }    
    
    /**
     * Outputs an HTML report for the given SummaryReport object.
     * @param report Object containing information to be output.
     * @param out Where to write the data.
     * @throws java.io.IOException
     */    
    public static void generate(SummaryReport report, Writer out) throws IOException {
        generate(report, out, new Date());        
    }
    
    /**
     * Outputs an HTML report for the given SummaryReport object.
     * @param report Object containing information to be output.
     * @param out Where to write the data.
     * @param date The date stamp for the report.
     * @throws java.io.IOException
     */    
    public static void generate(SummaryReport report, Writer out, Date date) throws IOException {
        StringTemplateSummaryReportWriter reportWriter = new StringTemplateSummaryReportWriter(out, "HTML");
        reportWriter.write(report, date);
    }
    
    /**
     * Generates HTML files for all code coverage information and outputs them
     * into the given directory.
     * @param report The report to generate the output from.
     * @param directory The directory to output the HTML files to.
     * @throws java.io.IOException
     */
    public static void generateAll(SummaryReport report, String directory, String charset) throws IOException {
        
        File dir = new File(directory);        
        Date now = new Date();
        FileReport[] fileReports = report.getFileReports();
        String outputFile = dir.getAbsolutePath() + File.separator + "index.html";
        
        //first, generate the index file
        if (verbose){
            System.err.println("[INFO] Outputting " + outputFile);
        }
        Writer out = new OutputStreamWriter(new FileOutputStream(outputFile), charset);
        generate(report, out, now);
        out.close();
        
        //next, generate the file reports
        for (int i=0; i < fileReports.length; i++){
            outputFile = dir.getAbsolutePath() + File.separator + fileReports[i].getReportName() + ".html";
            if (verbose){
                System.err.println("[INFO] Outputting " + outputFile);
            }            
            out = new OutputStreamWriter(new FileOutputStream(outputFile), charset);
            generate(fileReports[i], out, now);
            out.close();
        }
    }
}
