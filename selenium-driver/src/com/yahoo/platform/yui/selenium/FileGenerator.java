/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yahoo.platform.yui.selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 *
 * @author nzakas
 */
public class FileGenerator {

    private boolean verbose = false;
    private Properties properties = null;


    public FileGenerator(Properties properties, boolean verbose){
        this.properties = properties;
        this.verbose = verbose;
    }

    public void generate(String name, String results, String type, String browser) throws Exception {
        String dirname = properties.getProperty(type + ".outputdir");
        String filenameFormat = properties.getProperty(type + ".filename");

        if (dirname == null){
            throw new Exception("Missing '" + type + ".outputdir' configuration parameter.");
        }

        if (filenameFormat == null){
            throw new Exception("Missing '" + type + ".outputdir' configuration parameter.");
        }

        //format filename
        String filename = filenameFormat.replace("{browser}", browser.replace("*", "")).replace("{name}", name).trim();

        int pos = filename.indexOf("{date:");

        if (pos > -1){

            int endpos = filename.indexOf("}", pos);
            String format = filename.substring(pos + 6, endpos);

            //get the format
            Date now = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat(format);

            //insert into filename
            filename = filename.replace("{date:" + format + "}", formatter.format(now));
        }

        filename = filename.replaceAll("[^a-zA-Z0-9\\.\\-]", "_").replaceAll("_+", "_");

        if (verbose){
            System.err.println("[INFO] Outputting " + type + " to " + dirname + File.separator + filename);
        }

        //output to file
        Writer out = new OutputStreamWriter(new FileOutputStream(dirname + File.separator + filename), "UTF-8");
        out.write(results);
        out.close();

    }
}
