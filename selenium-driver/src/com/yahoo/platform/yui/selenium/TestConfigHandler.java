/*
 * YUI Test Selenium Driver
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yui.selenium;

import java.util.LinkedList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Nicholas C. Zakas
 */
public class TestConfigHandler extends DefaultHandler {

    private int version = -1;
    private List<TestPageGroup> groups = null;;
    private TestPageGroup currentGroup = null;
    private TestPage currentPage = null;

    public TestConfigHandler(){
        this.groups = new LinkedList<TestPageGroup>();
    }

    public TestPageGroup[] getGroups(){
        TestPageGroup[] groupsArray = new TestPageGroup[groups.size()];
        groups.toArray(groupsArray);
        return groupsArray;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (currentPage != null){
            currentPage.setPath(new String(ch, start, length));
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("yuitest")){
            String ver = attributes.getValue("version");
            if (ver != null){
                version = Integer.parseInt(ver);
            }            
        } else if (qName.equals("tests")){
            String ver = attributes.getValue("version");
            String timeout = attributes.getValue("timeout");
            currentGroup = new TestPageGroup(attributes.getValue("base"), (ver == null ? version : Integer.parseInt(ver)), (timeout == null ? -1 : Integer.parseInt(timeout)));
            groups.add(currentGroup);
        } else if (qName.equals("url")){

            //make sure it's inside of a group
            if (currentGroup == null){
                throw new SAXException("<url> must be within <tests>");
            }
            String ver = attributes.getValue("version");
            String timeout = attributes.getValue("timeout");
            currentPage = new TestPage(currentGroup, (ver == null ? currentGroup.getVersion() : Integer.parseInt(ver)), (timeout == null ? currentGroup.getTimeout() : Integer.parseInt(timeout)));
            currentGroup.add(currentPage);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("tests")){
            currentGroup = null;
        } else if (qName.equals("url")){
            currentPage = null;
        }
    }



}
