/*
 * XML Type:  CT_Formulas
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTFormulas
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Formulas(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTFormulas extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.CTFormulas> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctformulas808btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "f" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTF> getFList();

    /**
     * Gets array of all "f" elements
     */
    com.microsoft.schemas.vml.CTF[] getFArray();

    /**
     * Gets ith "f" element
     */
    com.microsoft.schemas.vml.CTF getFArray(int i);

    /**
     * Returns number of "f" element
     */
    int sizeOfFArray();

    /**
     * Sets array of all "f" element
     */
    void setFArray(com.microsoft.schemas.vml.CTF[] fArray);

    /**
     * Sets ith "f" element
     */
    void setFArray(int i, com.microsoft.schemas.vml.CTF f);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "f" element
     */
    com.microsoft.schemas.vml.CTF insertNewF(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "f" element
     */
    com.microsoft.schemas.vml.CTF addNewF();

    /**
     * Removes the ith "f" element
     */
    void removeF(int i);
}
