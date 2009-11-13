/*
 * YUI Test Selenium Driver
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yui.selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * Handles generating results files for a SeleniumDriver with the same set of
 * properties.
 * @author Nicholas C. Zakas
 */
public class TestResultFileGenerator {

    private boolean verbose = false;
    private Properties properties = null;

    public TestResultFileGenerator(Properties properties, boolean verbose){
        this.properties = properties;
        this.verbose = verbose;
    }

    public void generateAll(List<TestResult> results, Date timestamp) throws Exception {
        for (int i=0; i < results.size(); i++){
            generateAll(results.get(i), timestamp);
        }
    }

    public void generateAll(TestResult[] results, Date timestamp) throws Exception {
        for (int i=0; i < results.length; i++){
            generateAll(results[i], timestamp);
        }
    }

    public void generateAll(TestResult result, Date timestamp) throws Exception {

        //generate test results file
        if (result.hasReport("results")){
            generate(result, "results", timestamp);
        }

        //generate test coverage file
        if (result.hasReport("coverage")){
            generate(result, "coverage", timestamp);
        }

    }

    private void generate(TestResult result, String type, Date timestamp) throws Exception {
        String dirname = properties.getProperty(type + ".outputdir");
        String filenameFormat = properties.getProperty(type + ".filename");
        String browser = result.getBrowser().replace("*", "");

        if (dirname == null){
            throw new Exception("Missing '" + type + ".outputdir' configuration parameter.");
        }

        if (filenameFormat == null){
            throw new Exception("Missing '" + type + ".outputdir' configuration parameter.");
        }

        //create the directory if necessary
        File dir = new File(dirname);
        if (!dir.exists()){

            if (verbose){
                System.err.println("[INFO] Creating directory " + dir.getPath());
            }

            dir.mkdirs();
        }

        //format filename
        String filename = filenameFormat.replace("{browser}", browser).replace("{name}", result.getName()).trim();

        int pos = filename.indexOf("{date:");

        if (pos > -1){

            int endpos = filename.indexOf("}", pos);
            String format = filename.substring(pos + 6, endpos);

            //get the format
            SimpleDateFormat formatter = new SimpleDateFormat(format);

            //insert into filename
            filename = filename.replace("{date:" + format + "}", formatter.format(timestamp));
        }

        filename = filename.replaceAll("[^a-zA-Z0-9\\.\\-]", "_").replaceAll("_+", "_");

        if (verbose){
            System.err.println("[INFO] Outputting " + type + " to " + dirname + File.separator + filename);
        }

        String reportText = result.getReport(type);

        //for JUnit XML add browser information
        //kind of hacky, better way to do this?
        if (type.equals("results") && properties.getProperty(SeleniumDriver.RESULTS_FORMAT).equals("JUnitXML")){
            reportText = reportText.replace("classname=\"", "classname=\"" + browser + ".");
        }

        //output to file
        Writer out = new OutputStreamWriter(new FileOutputStream(dirname + File.separator + filename), "UTF-8");
        out.write(reportText);
        out.close();

    }
}
