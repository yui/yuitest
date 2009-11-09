/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yahoo.platform.yui.selenium;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Nicholas C. Zakas
 */
public class ResultsOutputter extends DefaultHandler {

    private int passed = 0;
    private int failed = 0;
    private int ignored = 0;
    private TestResult result = null;
    private StringBuilder builder = new StringBuilder();

//Running net.nczonline.web.cssembed.CSSURLEmbedderTest
//Testsuite: net.nczonline.web.cssembed.CSSURLEmbedderTest
//Tests run: 4, Failures: 0, Errors: 0, Time elapsed: 0.062 sec
//Tests run: 4, Failures: 0, Errors: 0, Time elapsed: 0.062 sec


    public ResultsOutputter(TestResult result){
        super();
        this.result = result;
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.printf("Tests run: %d, Failures: %d, Ignored: %d\n", (passed + failed), failed, ignored);

        if (passed + failed == 0){
            System.out.printf("Warning: No tests were run. Check the test page '%s'.\n", result.getName());
        }

        if (builder.length() > 0){
            System.out.println("\n" + builder.toString());
        }
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.printf("\nRunning %s on %s \n", result.getName(), result.getBrowser());
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("test")){
            String testResult = attributes.getValue("result");
            if (testResult.equals("fail")){
                builder.append(attributes.getValue("name"));
                builder.append(": ");
                builder.append(attributes.getValue("message"));
                builder.append("\n");
            } 
        } else if (qName.equals("report")){
            passed = Integer.parseInt(attributes.getValue("passed"));
            failed = Integer.parseInt(attributes.getValue("failed"));
            ignored = Integer.parseInt(attributes.getValue("ignored"));
        }
    }

}
