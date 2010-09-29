package com.github.smat.saxxp;

import com.github.smat.saxxp.annotation.ParseFromXmlWithXPath;

public class XmlParserTestClass {
    @ParseFromXmlWithXPath("string")
    private String test;
    @ParseFromXmlWithXPath("int")
    private int testInt;
    public String getTest() {
        return test;
    }
    public int getTestInt() {
        return testInt;
    }
}
