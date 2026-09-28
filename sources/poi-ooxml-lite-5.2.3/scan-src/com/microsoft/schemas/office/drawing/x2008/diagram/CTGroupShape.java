/*
 * XML Type:  CT_GroupShape
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_GroupShape(@http://schemas.microsoft.com/office/drawing/2008/diagram).
 *
 * This is a complex type.
 */
public interface CTGroupShape extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctgroupshape48cbtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "nvGrpSpPr" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShapeNonVisual getNvGrpSpPr();

    /**
     * Sets the "nvGrpSpPr" element
     */
    void setNvGrpSpPr(com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShapeNonVisual nvGrpSpPr);

    /**
     * Appends and returns a new empty "nvGrpSpPr" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShapeNonVisual addNewNvGrpSpPr();

    /**
     * Gets the "grpSpPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties getGrpSpPr();

    /**
     * Sets the "grpSpPr" element
     */
    void setGrpSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties grpSpPr);

    /**
     * Appends and returns a new empty "grpSpPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties addNewGrpSpPr();

    /**
     * Gets a List of "sp" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2008.diagram.CTShape> getSpList();

    /**
     * Gets array of all "sp" elements
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTShape[] getSpArray();

    /**
     * Gets ith "sp" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTShape getSpArray(int i);

    /**
     * Returns number of "sp" element
     */
    int sizeOfSpArray();

    /**
     * Sets array of all "sp" element
     */
    void setSpArray(com.microsoft.schemas.office.drawing.x2008.diagram.CTShape[] spArray);

    /**
     * Sets ith "sp" element
     */
    void setSpArray(int i, com.microsoft.schemas.office.drawing.x2008.diagram.CTShape sp);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sp" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTShape insertNewSp(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "sp" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTShape addNewSp();

    /**
     * Removes the ith "sp" element
     */
    void removeSp(int i);

    /**
     * Gets a List of "grpSp" elements
     */
    java.util.List<com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape> getGrpSpList();

    /**
     * Gets array of all "grpSp" elements
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape[] getGrpSpArray();

    /**
     * Gets ith "grpSp" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape getGrpSpArray(int i);

    /**
     * Returns number of "grpSp" element
     */
    int sizeOfGrpSpArray();

    /**
     * Sets array of all "grpSp" element
     */
    void setGrpSpArray(com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape[] grpSpArray);

    /**
     * Sets ith "grpSp" element
     */
    void setGrpSpArray(int i, com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape grpSp);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "grpSp" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape insertNewGrpSp(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "grpSp" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape addNewGrpSp();

    /**
     * Removes the ith "grpSp" element
     */
    void removeGrpSp(int i);

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
}
