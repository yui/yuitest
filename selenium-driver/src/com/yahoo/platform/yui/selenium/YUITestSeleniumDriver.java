/*
 * YUI Test Selenium Driver
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
import java.util.Properties;

/**
 * Main YUI Test Coverage class.
 * @author Nicholas C. Zakas
 */
public class YUITestSeleniumDriver {

    public static void main(String args[]) {

        //----------------------------------------------------------------------
        // Initialize command line parser
        //----------------------------------------------------------------------
        CmdLineParser parser = new CmdLineParser();
        CmdLineParser.Option verboseOpt = parser.addBooleanOption('v', "verbose");
        CmdLineParser.Option helpOpt = parser.addBooleanOption('h', "help");
        CmdLineParser.Option confOpt = parser.addStringOption("conf");

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
            
            //conf option
            String confFile = (String) parser.getOptionValue(confOpt);
            if (confFile == null){
                System.err.println("[ERROR] Missing configuration file. Use --conf to specify.");
                System.exit(1);
            } else {
                if (verbose){
                    System.err.println("[INFO] Loading configuration properties from " + confFile);
                }
            }
            
            //load properties from configuration file
            Properties confProperties = new Properties();
            confProperties.load(new FileInputStream(confFile));

            SeleniumDriver driver = new SeleniumDriver(confProperties, verbose);
            driver.start();

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
                "\nUsage: java -jar yuitest-selenium-driver-x.y.z.jar --conf [conf file] [options] [input file]\n\n"

                        + "Global Options\n"
                        + "  -h, --help                Displays this information.\n"
                        + "  --conf <file>             Load configuration from <file>.\n"
                        + "  -v, --verbose             Display informational messages and warnings.\n\n");
    }


}
