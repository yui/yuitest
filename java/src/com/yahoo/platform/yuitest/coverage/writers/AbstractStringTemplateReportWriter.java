/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yahoo.platform.yuitest.coverage.writers;

import com.yahoo.platform.yuitest.coverage.report.FileReport;
import com.yahoo.platform.yuitest.coverage.report.ReportGenerator;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

/**
 * Provides basic string template loading for writers.
 * @author Nicholas C. Zakas
 */
public abstract class AbstractStringTemplateReportWriter {

    protected Writer out;
    protected String templateName;

    protected AbstractStringTemplateReportWriter(Writer out, String templateName){
        this.out = out;
        this.templateName = templateName;
    }

    /**
     * Closes the writer.
     * @throws IOException
     */
    public void close() throws IOException {
        out.close();
    }

    /**
     * Retrieves a StringTemplate with the given name from the JAR.
     * @param name The name of the StringTemplate to retrieve.
     * @return A StringTemplate object.
     */
    protected StringTemplate getStringTemplate(){
        String templatePath = ReportGenerator.class.getResource(templateName + ".st").getFile();
        templatePath = templatePath.substring(0, templatePath.lastIndexOf("/") + 1);
        StringTemplateGroup group = new StringTemplateGroup(templateName, templatePath);
        StringTemplate template = group.getInstanceOf(templateName);
        group.setRefreshInterval(Integer.MAX_VALUE); //no refreshing
        return template;
    }
}
