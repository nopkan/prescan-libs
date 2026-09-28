/*
 * XML Type:  CT_Shape
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.CTShape
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Shape(@http://schemas.microsoft.com/office/drawing/2008/diagram).
 *
 * This is a complex type.
 */
public interface CTShape extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2008.diagram.CTShape> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctshape6416type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "nvSpPr" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTShapeNonVisual getNvSpPr();

    /**
     * Sets the "nvSpPr" element
     */
    void setNvSpPr(com.microsoft.schemas.office.drawing.x2008.diagram.CTShapeNonVisual nvSpPr);

    /**
     * Appends and returns a new empty "nvSpPr" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTShapeNonVisual addNewNvSpPr();

    /**
     * Gets the "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr();

    /**
     * Sets the "spPr" element
     */
    void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr);

    /**
     * Appends and returns a new empty "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr();

    /**
     * Gets the "style" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle getStyle();

    /**
     * True if has "style" element
     */
    boolean isSetStyle();

    /**
     * Sets the "style" element
     */
    void setStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle style);

    /**
     * Appends and returns a new empty "style" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle addNewStyle();

    /**
     * Unsets the "style" element
     */
    void unsetStyle();

    /**
     * Gets the "txBody" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxBody();

    /**
     * True if has "txBody" element
     */
    boolean isSetTxBody();

    /**
     * Sets the "txBody" element
     */
    void setTxBody(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txBody);

    /**
     * Appends and returns a new empty "txBody" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxBody();

    /**
     * Unsets the "txBody" element
     */
    void unsetTxBody();

    /**
     * Gets the "txXfrm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D getTxXfrm();

    /**
     * True if has "txXfrm" element
     */
    boolean isSetTxXfrm();

    /**
     * Sets the "txXfrm" element
     */
    void setTxXfrm(org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D txXfrm);

    /**
     * Appends and returns a new empty "txXfrm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D addNewTxXfrm();

    /**
     * Unsets the "txXfrm" element
     */
    void unsetTxXfrm();

    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst();

    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst);

    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();

    /**
     * Gets the "modelId" attribute
     */
    java.lang.Object getModelId();

    /**
     * Gets (as xml) the "modelId" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetModelId();

    /**
     * Sets the "modelId" attribute
     */
    void setModelId(java.lang.Object modelId);

    /**
     * Sets (as xml) the "modelId" attribute
     */
    void xsetModelId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId modelId);
}
