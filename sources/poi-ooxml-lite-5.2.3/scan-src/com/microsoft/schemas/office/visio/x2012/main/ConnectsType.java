/*
 * XML Type:  Connects_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ConnectsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Connects_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface ConnectsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.ConnectsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "connectstype8750type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Connect" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.ConnectType> getConnectList();

    /**
     * Gets array of all "Connect" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.ConnectType[] getConnectArray();

    /**
     * Gets ith "Connect" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ConnectType getConnectArray(int i);

    /**
     * Returns number of "Connect" element
     */
    int sizeOfConnectArray();

    /**
     * Sets array of all "Connect" element
     */
    void setConnectArray(com.microsoft.schemas.office.visio.x2012.main.ConnectType[] connectArray);

    /**
     * Sets ith "Connect" element
     */
    void setConnectArray(int i, com.microsoft.schemas.office.visio.x2012.main.ConnectType connect);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Connect" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ConnectType insertNewConnect(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Connect" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ConnectType addNewConnect();

    /**
     * Removes the ith "Connect" element
     */
    void removeConnect(int i);
}
