/*
 * YUI Test Selenium
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */
package com.yahoo.platform.yui.selenium;

import com.thoughtworks.selenium.*;
import jargs.gnu.CmdLineParser;
import java.io.*;
import java.nio.charset.Charset;

/**
 * Main YUI Test Coverage class.
 * @author Nicholas C. Zakas
 */
public class YUITestSelenium {

    public static void main(String args[]) {

        //----------------------------------------------------------------------
        // Initialize command line parser
        //----------------------------------------------------------------------
        CmdLineParser parser = new CmdLineParser();
        CmdLineParser.Option verboseOpt = parser.addBooleanOption('v', "verbose");
        CmdLineParser.Option helpOpt = parser.addBooleanOption('h', "help");
        CmdLineParser.Option charsetOpt = parser.addStringOption("charset");
        CmdLineParser.Option reportOpt = parser.addStringOption("report");
        CmdLineParser.Option outputFilenameOpt = parser.addStringOption('o', "output");

                Selenium selenium = new DefaultSelenium("localhost", 4444, "*googlechrome", "http://www.google.com/");
                selenium.start();

        Reader in = null;
        Writer out = null;

        try {

            parser.parse(args);

            //Help option
            Boolean help = (Boolean) parser.getOptionValue(helpOpt);
            if (help != null && help.booleanValue()) {
                usage();
                System.exit(0);
            }

            //Verbose option
            boolean verbose = parser.getOptionValue(verboseOpt) != null;

            //Charset option
            String charset = (String) parser.getOptionValue(charsetOpt);
            if (charset == null || !Charset.isSupported(charset)) {
                charset = System.getProperty("file.encoding");
                if (charset == null) {
                    charset = "UTF-8";
                }
                if (verbose) {
                    System.err.println("\n[INFO] Using charset " + charset);
                }
            }
            
            //report option
            String outputReportDir = (String) parser.getOptionValue(reportOpt);            
            
            //get the files to operate on
            String[] fileArgs = parser.getRemainingArgs();

            if (fileArgs.length == 0) {

                usage();
                System.exit(1);
                
            } else {
               
                in = new InputStreamReader(new FileInputStream(fileArgs[0]), charset);
            }                           

            if (outputReportDir != null){  //report mode

                if (verbose) {
                    System.err.println("\n[INFO] Preparing to generate coverage reports.");
                }                
                

//                CoverageReport fullReport = new CoverageReport(in);   
//                ReportGenerator.setVerbose(verbose);
//                ReportGenerator.generateAll(fullReport, outputReportDir, charset);

            } else {  //cover mode

                if (verbose) {
                    System.err.println("\n[INFO] Preparing to instrument JavaScript file " + fileArgs[0] + ".");
                }                 
                
                String outputFilename = (String) parser.getOptionValue(outputFilenameOpt);                                 
                JavaScriptInstrumenter instrumenter = new JavaScriptInstrumenter(in, fileArgs[0]);

                if (outputFilename == null) {
                    out = new OutputStreamWriter(System.out, charset);
                } else {
                    out = new OutputStreamWriter(new FileOutputStream(outputFilename), charset);
                }

                instrumenter.instrument(out, verbose);
            }


        } catch (CmdLineParser.OptionException e) {

            usage();
            System.exit(1);

        } catch (IOException e) {

            e.printStackTrace();
            System.exit(1);

        } catch (Exception e) {

            e.printStackTrace();
            // Return a special error code used specifically by the web front-end.
            System.exit(2);
        
        } finally {

            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void usage() {
        System.out.println(
                "\nUsage: java -jar yuitestcoverage-x.y.z.jar [options] [input file]\n\n"

                        + "Global Options\n"
                        + "  -h, --help                Displays this information.\n"
                        + "  --charset <charset>       Read the input file using <charset>.\n"
                        + "  --report <directory>      Output HTML reports to <directory>.\n"
                        + "  -v, --verbose             Display informational messages and warnings.\n"
                        + "                            Input file is assumed to be a coverage report.\n"                        
                        + "  -o <file>                 Place the output into <file>. Defaults to stdout.\n\n");
    }


}
