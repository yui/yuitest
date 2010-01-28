/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.report;

import com.yahoo.platform.yuitest.coverage.results.DirectoryReport;
import com.yahoo.platform.yuitest.coverage.results.FileReport;
import com.yahoo.platform.yuitest.coverage.results.SummaryReport;
import com.yahoo.platform.yuitest.writers.ReportWriter;
import com.yahoo.platform.yuitest.writers.ReportWriterFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;

/**
 *
 * @author Nicholas C. Zakas
 */
public class GCOVReportGenerator implements ReportGenerator {

    private File outputdir = null;
    private boolean verbose = false;

    /**
     * Creates a new GCOVReportGenerator
     * @param outputdir The output directory for the GCOV report.
     * @param verbose True to output additional information to the console.
     */
    public GCOVReportGenerator(String outputdir, boolean verbose){
        this.outputdir = new File(outputdir);
        this.verbose = verbose;
    }

    public void generate(SummaryReport report) throws IOException {
        Date now = new Date();

        //create the report directory now
        if (!outputdir.exists()){
            outputdir.mkdirs();
            if (verbose){
                System.err.println("[INFO] Creating " + outputdir.getCanonicalPath());
            }
        }

        DirectoryReport[] reports = report.getDirectoryReports();
        for (int i=0; i < reports.length; i++){
            generateDirectories(reports[i], now);
        }
    }
    /**
     * Generates a report page for each file in the coverage information.
     * @param report The coverage information to generate reports for.
     * @param date The date associated with the report.
     * @throws IOException When a file cannot be written to.
     */
    private void generateDirectories(DirectoryReport report, Date date) throws IOException {

        FileReport[] fileReports = report.getFileReports();

        //make the directory to mimic the source file
        String parentDir = fileReports[0].getFile().getParent();
        File parent = new File(outputdir.getAbsolutePath() + File.separator + parentDir);
        if (!parent.exists()){
            parent.mkdirs();
        }

        for (int i=0; i < fileReports.length; i++){            
            generateGCOVFile(fileReports[i], date, parent);
        }
    }

    /**
     * Generates a GCOV file for the file coverage information.
     * @param report The coverage information to generate files for.
     * @param date The date associated with the report.
     * @throws IOException When a file cannot be written to.
     */
    private void generateGCOVFile(FileReport report, Date date, File parent) throws IOException {
        String outputFile = parent.getAbsolutePath() + File.separator + report.getFile().getName() + ".gcov";

        if (verbose){
            System.err.println("[INFO] Outputting " + outputFile);
        }

        Writer out = new OutputStreamWriter(new FileOutputStream(outputFile));
        ReportWriter reportWriter = (new ReportWriterFactory<FileReport>()).getWriter(out, "GCOVFileReport");
        reportWriter.write(report, date);
        out.close();
    }
}
