/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.report;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Represents a code coverage report.
 * @author Nicholas C. Zakas
 */
public class CoverageReport {

    private JSONObject data;
    private FileReport[] items;
    
    //--------------------------------------------------------------------------
    // Constructors
    //--------------------------------------------------------------------------
    
    /**
     * Creates a new report object from data in a file.
     * @param file The file from which to read the JSON data.
     * @throws java.io.IOException
     * @throws org.json.JSONException
     */
    public CoverageReport(File file) throws IOException, JSONException {
        this(new InputStreamReader(new FileInputStream(file)));
    }

    /**
     * Creates a new report object from data in multiple files.
     * @param file The file from which to read the JSON data.
     * @throws java.io.IOException
     * @throws org.json.JSONException
     */
    public CoverageReport(File[] files) throws IOException, JSONException {

        //start with the first file
        this(files[0]);

        //include the others
        for (int i=1; i < files.length; i++){
            include(new CoverageReport(files[i]));
        }
    }

    /**
     * Creates a new report object from a reader.
     * @param in The reader containing JSON information.
     * @throws java.io.IOException
     * @throws org.json.JSONException
     */
    public CoverageReport(Reader in) throws IOException, JSONException {
        StringBuilder builder = new StringBuilder();
        int c;
        
        while((c = in.read()) != -1){
            builder.append((char)c);
        }
        
        this.data = new JSONObject(builder.toString());
        generateFileReports();
    }
    
    /**
     * Creates a new report object from a JSON object.
     * @param data The JSON object containing coverage data.
     */
    public CoverageReport(JSONObject data)  throws JSONException{
        this.data = data;
        generateFileReports();
    }
  
    /**
     * Generates FileReport objects for every file in the report.
     */
    private void generateFileReports()  throws JSONException{
        String[] filenames = getFilenames();
        Arrays.sort(filenames);
        items = new FileReport[filenames.length];
        
        for (int i=0; i < filenames.length; i++){
            items[i] = new FileReport(filenames[i], data.getJSONObject(filenames[i]));
        }        
    }
    
    /**
     * Returns the filenames tracked in the report.
     * @return The filenames tracked in the report.
     */
    public String[] getFilenames(){
        return JSONObject.getNames(data);
    }
    
    /**
     * Returns all FileReport objects in the report.
     * @return All FileReport objects in the report.
     */
    public FileReport[] getFileReports(){
        return items;
    }
    
    /**
     * Returns the FileReport in the given position in the report.
     * @param index The position in the report to retrieve.
     * @return The FileReport for the position.
     */
    public FileReport getFileReport(int index){
        return items[index];
    }
    
    /**
     * Returns the FileReport associated with a given filename.
     * @param filename The filename to retrieve.
     * @return The FileReport if found or null if not found.
     */
    public FileReport getFileReport(String filename){
        for (int i=0; i < items.length; i++){
            if (items[i].getFilename().equals(filename)){
                return items[i];
            }
        }
        return null;
    }

    public JSONObject toJSONObject(){
        return data;
    }

    /**
     * Include another report's data in this report.
     * @param otherReport The other report to include.
     */
    public void include(CoverageReport otherReport) throws JSONException{

        JSONObject otherData = otherReport.toJSONObject();
        String[] keys = JSONObject.getNames(otherData);

        for (int i=0; i < keys.length; i++){
            data.put(keys[i], otherData.getJSONObject(keys[i]));
        }
    }
    
}
