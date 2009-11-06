/*
 * YUI Test Selenium Driver
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */
package com.yahoo.platform.yui.selenium;

import jargs.gnu.CmdLineParser;
import java.io.*;
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
        CmdLineParser.Option hostOpt = parser.addStringOption("host");
        CmdLineParser.Option portOpt = parser.addStringOption("port");
        CmdLineParser.Option browsersOpt = parser.addStringOption("browsers");
        CmdLineParser.Option yuitestOpt = parser.addStringOption("yuitest");

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

            //load default properties from configuration file
            Properties properties = new Properties();
            properties.load(YUITestSeleniumDriver.class.getResourceAsStream("default.properties"));

            //conf option
            String confFile = (String) parser.getOptionValue(confOpt);
            if (confFile != null){
                if (verbose){
                    System.err.println("[INFO] Loading configuration properties from " + confFile);
                }
                properties.load(new FileInputStream(confFile));
            }

            //load all command-line properties, which override everything else

            //host option
            String host = (String) parser.getOptionValue(hostOpt);
            if (host != null){
                properties.setProperty(SeleniumDriver.SELENIUM_HOST, host);
                if (verbose){
                    System.err.println("[INFO] Using command line value for " + SeleniumDriver.SELENIUM_HOST + ": " + host);
                }
            }

            //port option
            String port = (String) parser.getOptionValue(portOpt);
            if (port != null){
                properties.setProperty(SeleniumDriver.SELENIUM_PORT, port);
                if (verbose){
                    System.err.println("[INFO] Using command line value for " + SeleniumDriver.SELENIUM_PORT + ": " + port);
                }
            }

            //browsers option
            String browsers = (String) parser.getOptionValue(browsersOpt);
            if (browsers != null){
                properties.setProperty(SeleniumDriver.SELENIUM_BROWSERS, browsers);
                if (verbose){
                    System.err.println("[INFO] Using command line value for " + SeleniumDriver.SELENIUM_BROWSERS + ": " + browsers);
                }
            }

            //YUI Test version option
            String yuitest = (String) parser.getOptionValue(yuitestOpt);
            if (yuitest != null){
                properties.setProperty(SeleniumDriver.YUITEST_VERSION, yuitest);
                if (verbose){
                    System.err.println("[INFO] Using command line value for " + SeleniumDriver.YUITEST_VERSION + ": " + yuitest);
                }
            }

            //see if there are any test files
            String[] testFiles = parser.getRemainingArgs();
            if (testFiles.length > 0){
                
                properties.setProperty("yuitest.urls", testFiles[0]);
                if (verbose){
                    //System.err.println("[INFO] Using command line value for " + SeleniumDriver.YUITEST_VERSION + ": " + yuitest);
                }
            }

            //create a new selenium driver with the properties
            SeleniumDriver driver = new SeleniumDriver(properties, verbose);
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
                "\nUsage: java -jar yuitest-selenium-driver-x.y.z.jar [options] [test files]\n\n"

                        + "Global Options\n"
                        + "  -h, --help                Displays this information.\n"
                        + "  --browsers <browsers>     Run tests in these browseres (comma-delimited).\n"
                        + "  --conf <file>             Load options from <file>.\n"
                        + "  --host <host>             Use the Selenium host <host>.\n"
                        + "  --port <port>             Use <port> port on the Selenium host.\n"
                        + "  --yuitest <version>       The version of YUI Test to use (2 or 3).\n"
                        + "  -v, --verbose             Display informational messages and warnings.\n\n");
    }


}
