/*
 * XML Type:  CT_Handles
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTHandles
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Handles(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTHandles extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.CTHandles> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cthandles5c1ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "h" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTH> getHList();

    /**
     * Gets array of all "h" elements
     */
    com.microsoft.schemas.vml.CTH[] getHArray();

    /**
     * Gets ith "h" element
     */
    com.microsoft.schemas.vml.CTH getHArray(int i);

    /**
     * Returns number of "h" element
     */
    int sizeOfHArray();

    /**
     * Sets array of all "h" element
     */
    void setHArray(com.microsoft.schemas.vml.CTH[] hArray);

    /**
     * Sets ith "h" element
     */
    void setHArray(int i, com.microsoft.schemas.vml.CTH h);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "h" element
     */
    com.microsoft.schemas.vml.CTH insertNewH(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "h" element
     */
    com.microsoft.schemas.vml.CTH addNewH();

    /**
     * Removes the ith "h" element
     */
    void removeH(int i);
}
