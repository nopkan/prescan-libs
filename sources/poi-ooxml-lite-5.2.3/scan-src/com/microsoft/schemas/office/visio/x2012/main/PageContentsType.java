/*
 * XML Type:  PageContents_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PageContentsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PageContents_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface PageContentsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.PageContentsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "pagecontentstypea5d0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Shapes" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ShapesType getShapes();

    /**
     * True if has "Shapes" element
     */
    boolean isSetShapes();

    /**
     * Sets the "Shapes" element
     */
    void setShapes(com.microsoft.schemas.office.visio.x2012.main.ShapesType shapes);

    /**
     * Appends and returns a new empty "Shapes" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ShapesType addNewShapes();

    /**
     * Unsets the "Shapes" element
     */
    void unsetShapes();

    /**
     * Gets the "Connects" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ConnectsType getConnects();

    /**
     * True if has "Connects" element
     */
    boolean isSetConnects();

    /**
     * Sets the "Connects" element
     */
    void setConnects(com.microsoft.schemas.office.visio.x2012.main.ConnectsType connects);

    /**
     * Appends and returns a new empty "Connects" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ConnectsType addNewConnects();

    /**
     * Unsets the "Connects" element
     */
    void unsetConnects();
}
