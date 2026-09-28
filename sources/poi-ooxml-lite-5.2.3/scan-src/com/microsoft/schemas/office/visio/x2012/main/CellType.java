/*
 * XML Type:  Cell_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.CellType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Cell_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface CellType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.CellType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "celltyped857type");
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

    /**
     * Gets the "U" attribute
     */
    java.lang.String getU();

    /**
     * Gets (as xml) the "U" attribute
     */
    org.apache.xmlbeans.XmlString xgetU();

    /**
     * True if has "U" attribute
     */
    boolean isSetU();

    /**
     * Sets the "U" attribute
     */
    void setU(java.lang.String u);

    /**
     * Sets (as xml) the "U" attribute
     */
    void xsetU(org.apache.xmlbeans.XmlString u);

    /**
     * Unsets the "U" attribute
     */
    void unsetU();

    /**
     * Gets the "E" attribute
     */
    java.lang.String getE();

    /**
     * Gets (as xml) the "E" attribute
     */
    org.apache.xmlbeans.XmlString xgetE();

    /**
     * True if has "E" attribute
     */
    boolean isSetE();

    /**
     * Sets the "E" attribute
     */
    void setE(java.lang.String e);

    /**
     * Sets (as xml) the "E" attribute
     */
    void xsetE(org.apache.xmlbeans.XmlString e);

    /**
     * Unsets the "E" attribute
     */
    void unsetE();

    /**
     * Gets the "F" attribute
     */
    java.lang.String getF();

    /**
     * Gets (as xml) the "F" attribute
     */
    org.apache.xmlbeans.XmlString xgetF();

    /**
     * True if has "F" attribute
     */
    boolean isSetF();

    /**
     * Sets the "F" attribute
     */
    void setF(java.lang.String f);

    /**
     * Sets (as xml) the "F" attribute
     */
    void xsetF(org.apache.xmlbeans.XmlString f);

    /**
     * Unsets the "F" attribute
     */
    void unsetF();

    /**
     * Gets the "V" attribute
     */
    java.lang.String getV();

    /**
     * Gets (as xml) the "V" attribute
     */
    org.apache.xmlbeans.XmlString xgetV();

    /**
     * True if has "V" attribute
     */
    boolean isSetV();

    /**
     * Sets the "V" attribute
     */
    void setV(java.lang.String v);

    /**
     * Sets (as xml) the "V" attribute
     */
    void xsetV(org.apache.xmlbeans.XmlString v);

    /**
     * Unsets the "V" attribute
     */
    void unsetV();
}
