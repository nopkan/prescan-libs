/*
 * XML Type:  CT_ShapeLayout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTShapeLayout
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_ShapeLayout(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTShapeLayout extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTShapeLayout> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctshapelayoutbda4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "idmap" element
     */
    com.microsoft.schemas.office.office.CTIdMap getIdmap();

    /**
     * True if has "idmap" element
     */
    boolean isSetIdmap();

    /**
     * Sets the "idmap" element
     */
    void setIdmap(com.microsoft.schemas.office.office.CTIdMap idmap);

    /**
     * Appends and returns a new empty "idmap" element
     */
    com.microsoft.schemas.office.office.CTIdMap addNewIdmap();

    /**
     * Unsets the "idmap" element
     */
    void unsetIdmap();

    /**
     * Gets the "regrouptable" element
     */
    com.microsoft.schemas.office.office.CTRegroupTable getRegrouptable();

    /**
     * True if has "regrouptable" element
     */
    boolean isSetRegrouptable();

    /**
     * Sets the "regrouptable" element
     */
    void setRegrouptable(com.microsoft.schemas.office.office.CTRegroupTable regrouptable);

    /**
     * Appends and returns a new empty "regrouptable" element
     */
    com.microsoft.schemas.office.office.CTRegroupTable addNewRegrouptable();

    /**
     * Unsets the "regrouptable" element
     */
    void unsetRegrouptable();

    /**
     * Gets the "rules" element
     */
    com.microsoft.schemas.office.office.CTRules getRules();

    /**
     * True if has "rules" element
     */
    boolean isSetRules();

    /**
     * Sets the "rules" element
     */
    void setRules(com.microsoft.schemas.office.office.CTRules rules);

    /**
     * Appends and returns a new empty "rules" element
     */
    com.microsoft.schemas.office.office.CTRules addNewRules();

    /**
     * Unsets the "rules" element
     */
    void unsetRules();

    /**
     * Gets the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt.Enum getExt();

    /**
     * Gets (as xml) the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt xgetExt();

    /**
     * True if has "ext" attribute
     */
    boolean isSetExt();

    /**
     * Sets the "ext" attribute
     */
    void setExt(com.microsoft.schemas.vml.STExt.Enum ext);

    /**
     * Sets (as xml) the "ext" attribute
     */
    void xsetExt(com.microsoft.schemas.vml.STExt ext);

    /**
     * Unsets the "ext" attribute
     */
    void unsetExt();
}
