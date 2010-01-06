/*
 * YUI Test
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.coverage.results;

import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Represents a single item on a report.
 * @author Nicholas C. Zakas
 */
public class FileReport {

    private JSONObject data;
    private String filename;
    private FileLine[] lines;
    private FileFunction[] functions;
    private String path;

    /**
     * Creates a new FileReport for the given filename.
     * @param filename The filename of the item.
     * @param data The associated coverage data.
     */
    protected FileReport(String filename, JSONObject data) throws JSONException {
        this.filename = filename;
        this.data = data;
        this.path = data.getString("path");
        createFileLines();
        createFileFunctions();
    }

    /**
     * Creates the FileLine objects for the file.
     * @throws org.json.JSONException
     */
    private void createFileLines() throws JSONException {
        int count = data.getJSONArray("code").length();
        lines = new FileLine[count];

        for (int i=0; i < count; i++){
            lines[i] = new FileLine(i+1, data.getJSONArray("code").getString(i), data.getJSONObject("lines").optInt(String.valueOf(i+1), -1));
        }
    }

    /**
     * Creates the FileFunction objects for the file.
     * @throws org.json.JSONException
     */
    private void createFileFunctions() throws JSONException {
        JSONObject functionData = data.getJSONObject("functions");
        String[] keys = JSONObject.getNames(functionData);
        
        functions = new FileFunction[keys.length];

        for (int i=0; i < keys.length; i++){
            functions[i] = new FileFunction(keys[i], functionData.optInt(keys[i], -1));
        }
    }

    /**
     * Returns the filename for this item.
     * @return The filename for this item.
     */
    public String getFilename(){
        return filename;
    }

    /**
     * Returns the file path for this item.
     * @return The file path for this item.
     */
    public String getPath(){
        return path;
    }

    /**
     * Returns the total number of lines tracked.
     * @return The total number of lines tracked.
     * @throws org.json.JSONException
     */
    public int getCoveredLineCount() throws JSONException {
        return data.getInt("coveredLines");
    }

    /**
     * Returns the number of called lines.
     * @return The number of called lines.
     * @throws org.json.JSONException
     */
    public int getCalledLineCount() throws JSONException {
        return data.getInt("calledLines");
    }    
        
    /**
     * Returns the percentage of lines called.
     * @return The percentage of lines called.
     * @throws org.json.JSONException
     */
    public double getCalledLinePercentage() throws JSONException {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
	return Double.valueOf(twoDForm.format(((double) getCalledLineCount() / (double) getCoveredLineCount()) * 100));
    }    

    /**
     * Returns the total number of functions tracked.
     * @return The total number of functions tracked.
     * @throws org.json.JSONException
     */
    public int getCoveredFunctionCount() throws JSONException {
        return data.getInt("coveredFunctions");
    }

    /**
     * Returns the number of functions that were called.
     * @return The number of functions that were called.
     * @throws org.json.JSONException
     */
    public int getCalledFunctionCount() throws JSONException {
        return data.getInt("calledFunctions");
    }          
    
    /**
     * Returns the percentage of functions called.
     * @return The percentage of functions called.
     * @throws org.json.JSONException
     */
    public double getCalledFunctionPercentage() throws JSONException {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
	return Double.valueOf(twoDForm.format(((double) getCalledFunctionCount() / (double) getCoveredFunctionCount()) * 100));
    }

    /**
     * Returns all information about a given line.
     * @param line The one-based number of the line to retrieve.
     * @return A FileLine for the specified line.
     * @throws org.json.JSONException
     */
    public FileLine getLine(int line) throws JSONException{
        return lines[line-1];
    }

    /**
     * Returns all information about all lines.
     * @return An array of lines for the file.
     * @throws org.json.JSONException
     */
    public FileLine[] getLines() throws JSONException {
        return lines;
    }

    /**
     * Returns all information about all functions.
     * @return An array of functions for the file.
     * @throws org.json.JSONException
     */
    public FileFunction[] getFunctions() throws JSONException {
        return functions;
    }

    /**
     * Returns the number of times that a given line was called.
     * @param line The line number to check.
     * @return The number of times that the lines was called.
     * @throws org.json.JSONException
     */
    public int getLineCallCount(int line)  throws JSONException{

        //error for uncovered lines
        try {
            return data.getJSONObject("lines").getInt(String.valueOf(line));
        } catch (Exception ex){
            return -1;
        }
    }

    /**
     * Returns the number of times a given function was called.
     * @param functionName The name of the function. This is the function
     *      name followed by a colon followed by the line number.
     * @return The number of times that the function was called.
     * @throws org.json.JSONException
     */
    public int getFunctionCallCount(String functionName) throws JSONException {
        return data.getJSONObject("functions").getInt(functionName);
    }

    /**
     * Returns all function names stored in the report item.
     * @return All function names stored in the report item.
     * @throws org.json.JSONException
     */
    public String[] getFunctionNames() throws JSONException {
        return JSONObject.getNames(data.getJSONObject("functions"));         
    }

    /**
     * Returns the JSONObject associated with the report item.
     * @return The JSONObject associated with the report item.
     */
    public JSONObject toJSONObject() {
        return data;
    }
    
    /**
     * Returns a name suitable for use as a filename in which the report can
     * be saved.
     * @return A name containing only A-Z,0-9, and _.
     */
    public String getReportName(){
        return filename.replaceAll("[^A-Za-z0-9\\.]", "_");
    }
    
    /**
     * Returns the JSON string representing the item.
     * @return The JSON string representing the item.
     */
    @Override
    public String toString(){
        return data.toString();
    }

    /**
     * Merges the data in another report with this report.
     * @param report The report to merge data from.
     */
    public void merge(FileReport report) throws JSONException {

        //make sure the file is the same
        if (this.getPath().equals(report.getPath())){

            //update calledFunctions
            if (this.getCalledFunctionCount() < report.getCalledFunctionCount()){
                data.put("calledFunctions", report.getCalledFunctionCount());
            }

            //update calledLines
            if (this.getCalledLineCount() < report.getCalledLineCount()){
                data.put("calledLines", report.getCalledLineCount());
            }

            //update line calls
            for (int i=0; i < lines.length; i++){
                data.getJSONObject("lines").put(String.valueOf(lines[i].getLineNumber()),
                        (lines[i].getCallCount() + report.getLineCallCount(lines[i].getLineNumber())));

            }

            //update function calls
            String[] functionNames = getFunctionNames();
            for (int i=0; i < functionNames.length; i++){
                data.getJSONObject("functions").put(functionNames[i],
                        (getFunctionCallCount(functionNames[i]) + report.getFunctionCallCount(functionNames[i])));

            }

            //re-create file lines and functions
            createFileLines();
            createFileFunctions();
        } else {
            throw new IllegalArgumentException("Expected a report for " + this.getPath());
        }

    }
}
