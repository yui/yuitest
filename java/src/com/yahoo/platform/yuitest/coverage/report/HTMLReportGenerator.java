/*
 *  YUI Test
 *  Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 *  Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 *  Code licensed under the BSD License:
 *      http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.report;

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
public class HTMLReportGenerator implements ReportGenerator {

    private File outputdir = null;
    private boolean verbose = false;
    
    public HTMLReportGenerator(String outputdir, boolean verbose){
        this.outputdir = new File(outputdir);
        this.verbose = verbose;

        //create directory if not already there
        if (!this.outputdir.exists()){
            this.outputdir.mkdirs();
        }
    }

    public void generate(SummaryReport report) throws IOException {
        Date now = new Date();

        generateSummaryPage(report, now);
        generateFilePages(report, now);

    }

    private void generateSummaryPage(SummaryReport report, Date date) throws IOException {

        String outputFile = outputdir.getAbsolutePath() + File.separator + "index.html";
        Writer out = new OutputStreamWriter(new FileOutputStream(outputFile));

        if (verbose){
            System.err.println("[INFO] Outputting " + outputFile);
        }

        ReportWriter reportWriter = (new ReportWriterFactory<SummaryReport>()).getWriter(out, "CoverageSummaryReportHTML");
        reportWriter.write(report, date);
        out.close();
    }

    private void generateFilePages(SummaryReport report, Date date) throws IOException {

        String outputFile = "";
        Writer out = null;
        FileReport[] fileReports = report.getFileReports();

        //next, generate the file reports
        for (int i=0; i < fileReports.length; i++){
            outputFile = outputdir.getAbsolutePath() + File.separator + fileReports[i].getReportName() + ".html";

            if (verbose){
                System.err.println("[INFO] Outputting " + outputFile);
            }

            out = new OutputStreamWriter(new FileOutputStream(outputFile));
            ReportWriter reportWriter = (new ReportWriterFactory<FileReport>()).getWriter(out, "CoverageFileReportHTML");
            reportWriter.write(fileReports[i], date);
            out.close();
        }
    }

}
