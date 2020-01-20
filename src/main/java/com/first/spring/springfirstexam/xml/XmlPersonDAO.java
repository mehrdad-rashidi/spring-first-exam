package com.first.spring.springfirstexam.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class XmlPersonDAO {

    private XmlJdbcConnection xmlJdbcConnection;

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }
}
