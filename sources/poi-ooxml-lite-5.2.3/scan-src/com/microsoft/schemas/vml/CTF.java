/*
 * XML Type:  CT_F
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTF
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_F(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTF extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.CTF> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfbc3atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "eqn" attribute
     */
    java.lang.String getEqn();

    /**
     * Gets (as xml) the "eqn" attribute
     */
    org.apache.xmlbeans.XmlString xgetEqn();

    /**
     * True if has "eqn" attribute
     */
    boolean isSetEqn();

    /**
     * Sets the "eqn" attribute
     */
    void setEqn(java.lang.String eqn);

    /**
     * Sets (as xml) the "eqn" attribute
     */
    void xsetEqn(org.apache.xmlbeans.XmlString eqn);

    /**
     * Unsets the "eqn" attribute
     */
    void unsetEqn();
}
