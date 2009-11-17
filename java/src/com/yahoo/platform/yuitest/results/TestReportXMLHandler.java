/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yahoo.platform.yuitest.results;

import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Nicholas C. Zakas
 */
public class TestReportXMLHandler extends DefaultHandler {

    private TestReport report = null;
    private Stack<TestSuite> suites = null;
    private TestCase curTestCase = null;

    public TestReportXMLHandler() {
        suites = new Stack<TestSuite>();
    }

    public TestReport getTestReport(){
        return report;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("testsuite")){
            suites.pop();
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("report")){
            report = new TestReport(attributes.getValue("name"),
                    Integer.parseInt(attributes.getValue("duration")),
                    Integer.parseInt(attributes.getValue("passed")),
                    Integer.parseInt(attributes.getValue("failed")),
                    Integer.parseInt(attributes.getValue("ignored")));
            
            suites.push(report);
        } else if (qName.equals("testsuite")){
            TestSuite suite = new TestSuite(attributes.getValue("name"),
                    Integer.parseInt(attributes.getValue("duration")),
                    Integer.parseInt(attributes.getValue("passed")),
                    Integer.parseInt(attributes.getValue("failed")),
                    Integer.parseInt(attributes.getValue("ignored")));

            //if there's another suite, add as a child
            suites.peek().addTestSuite(suite);
            suites.push(suite);
        } else if (qName.equals("testcase")){
            TestCase testCase = new TestCase(attributes.getValue("name"),
                    Integer.parseInt(attributes.getValue("duration")),
                    Integer.parseInt(attributes.getValue("passed")),
                    Integer.parseInt(attributes.getValue("failed")),
                    Integer.parseInt(attributes.getValue("ignored")));

            //if there's another suite, add as a child
            suites.peek().addTestCase(testCase);
            curTestCase = testCase;
        } else if (qName.equals("testcase")){

            //figure out the result
            String xmlResult = attributes.getValue("result");
            int result = Test.PASS;
            if (xmlResult.equals("fail")){
                result = Test.FAIL;
            } else if (xmlResult.equals("ignore")){
                result = Test.IGNORE;
            }

            Test test = new Test(attributes.getValue("name"),
                    Integer.parseInt(attributes.getValue("duration")),
                    result, attributes.getValue("message"));

            curTestCase.addTest(test);
        }
    }


}
