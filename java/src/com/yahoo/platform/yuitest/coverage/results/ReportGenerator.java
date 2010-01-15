/*
 * YUI Test
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.results;

import com.yahoo.platform.yuitest.coverage.writers.HTMLSummaryReportWriter;
import com.yahoo.platform.yuitest.coverage.writers.SummaryReportWriter;
import com.yahoo.platform.yuitest.writers.ReportWriter;
import com.yahoo.platform.yuitest.writers.ReportWriterFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;
import java.util.HashMap;

/**
 * Grouping for generation of coverage reports.
 * @author Nicholas C. Zakas
 */
public class ReportGenerator {
    
    private static boolean verbose = false;
    private static HashMap<String,String> summaryReportExtensions;
    private static HashMap<String,String> fileReportExtensions;
    private static HashMap<String,String> summaryReportName;
    private static HashMap<String,Class> fileReportWriters;
    private static HashMap<String,Class> summaryReportWriters;

    static {
        summaryReportExtensions = new HashMap<String,String>();
        summaryReportExtensions.put("HTML", "html");
        summaryReportExtensions.put("LCOV", "info");

        summaryReportName = new HashMap<String,String>();
        summaryReportName.put("HTML", "index");
        summaryReportName.put("LCOV", "lcov");

        fileReportExtensions = new HashMap<String,String>();
        fileReportExtensions.put("HTML", "html");
        fileReportExtensions.put("GCOV", "gcov");

        fileReportWriters = new HashMap<String,Class>();
//        fileReportWriters.put("HTML", HTMLFileReportWriter.class);
//        fileReportWriters.put("GCOV", GCOVFileReportWriter.class);

        summaryReportWriters = new HashMap<String,Class>();
        summaryReportWriters.put("HTML", HTMLSummaryReportWriter.class);
        summaryReportWriters.put("LCOV", HTMLSummaryReportWriter.class);


    }
    
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
    public static void generate(FileReport report, String format, Writer out) throws Exception, IOException {
        generate(report, format,  out, new Date());
    }
    
    /**
     * Outputs an HTML report for the given FileReport object.
     * @param report Object containing information to be output.
     * @param out Where to write the data.
     * @param date The date stamp for the report.
     * @throws java.io.IOException
     */
    public static void generate(FileReport report, String format, Writer out, Date date) throws Exception, IOException {
        //FileReportWriter reportWriter = FileReportWriterFactory.getWriter(out, format);
        ReportWriter reportWriter = (new ReportWriterFactory<FileReport>()).getWriter(out, "CoverageFileReport" + format);
        reportWriter.write(report, date);
    }    
    
    /**
     * Outputs an HTML report for the given SummaryReport object.
     * @param report Object containing information to be output.
     * @param out Where to write the data.
     * @throws java.io.IOException
     */    
    public static void generate(SummaryReport report, String format, Writer out) throws Exception, IOException {
        generate(report, format, out, new Date());
    }
    
    /**
     * Outputs an HTML report for the given SummaryReport object.
     * @param report Object containing information to be output.
     * @param out Where to write the data.
     * @param date The date stamp for the report.
     * @throws java.io.IOException
     */    
    public static void generate(SummaryReport report, String format, Writer out, Date date) throws Exception, IOException {

        ReportWriter reportWriter = (new ReportWriterFactory<FileReport>()).getWriter(out, "CoverageSummaryReport" + format);

        //StringTemplateSummaryReportWriter reportWriter = new StringTemplateSummaryReportWriter(out, format);
        reportWriter.write(report, date);
    }
    
    /**
     * Generates HTML files for all code coverage information and outputs them
     * into the given directory.
     * @param report The report to generate the output from.
     * @param directory The directory to output the HTML files to.
     * @throws java.io.IOException
     */
    public static void generateAll(SummaryReport report, String format, String directory) throws Exception, IOException, IllegalArgumentException {
        
        File dir = new File(directory);        
        Date now = new Date();
        FileReport[] fileReports = report.getFileReports();
        String outputFile = "";
        Writer out;

        //create directory if not already there
        if (!dir.exists()){
            dir.mkdirs();
        }

        //figure out if there should be a summary report
        if (summaryReportWriters.containsKey(format)){
            outputFile = dir.getAbsolutePath() + File.separator + summaryReportName.get(format) + "." + summaryReportExtensions.get(format);

            //first, generate the index file
            if (verbose){
                System.err.println("[INFO] Outputting " + outputFile);
            }
            out = new OutputStreamWriter(new FileOutputStream(outputFile));
            generate(report, format, out, now);
            out.close();
        }

        if (!format.equals("LCOV")){
            //next, generate the file reports
            for (int i=0; i < fileReports.length; i++){
                outputFile = dir.getAbsolutePath() + File.separator + fileReports[i].getReportName() + "." + fileReportExtensions.get(format);
                if (verbose){
                    System.err.println("[INFO] Outputting " + outputFile);
                }
                out = new OutputStreamWriter(new FileOutputStream(outputFile));
                generate(fileReports[i], format, out, now);
                out.close();
            }
        }
    }
}
