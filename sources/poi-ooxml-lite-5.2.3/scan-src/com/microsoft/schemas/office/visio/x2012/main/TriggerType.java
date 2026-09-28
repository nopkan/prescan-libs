/*
 * XML Type:  Trigger_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.TriggerType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Trigger_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface TriggerType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.TriggerType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "triggertype2933type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "RefBy" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.RefByType> getRefByList();

    /**
     * Gets array of all "RefBy" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.RefByType[] getRefByArray();

    /**
     * Gets ith "RefBy" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RefByType getRefByArray(int i);

    /**
     * Returns number of "RefBy" element
     */
    int sizeOfRefByArray();

    /**
     * Sets array of all "RefBy" element
     */
    void setRefByArray(com.microsoft.schemas.office.visio.x2012.main.RefByType[] refByArray);

    /**
     * Sets ith "RefBy" element
     */
    void setRefByArray(int i, com.microsoft.schemas.office.visio.x2012.main.RefByType refBy);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RefBy" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RefByType insertNewRefBy(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RefBy" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RefByType addNewRefBy();

    /**
     * Removes the ith "RefBy" element
     */
    void removeRefBy(int i);

    /**
     * Gets the "N" attribute
     */
    java.lang.String getN();

    /**
     * Gets (as xml) the "N" attribute
     */
    org.apache.xmlbeans.XmlString xgetN();

    /**
     * Sets the "N" attribute
     */
    void setN(java.lang.String n);

    /**
     * Sets (as xml) the "N" attribute
     */
    void xsetN(org.apache.xmlbeans.XmlString n);
}
