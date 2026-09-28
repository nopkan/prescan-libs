/*
 * XML Type:  CT_Lock
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTLock
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Lock(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTLock extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTLock> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctlock6b8etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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

    /**
     * Gets the "position" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getPosition();

    /**
     * Gets (as xml) the "position" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetPosition();

    /**
     * True if has "position" attribute
     */
    boolean isSetPosition();

    /**
     * Sets the "position" attribute
     */
    void setPosition(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum position);

    /**
     * Sets (as xml) the "position" attribute
     */
    void xsetPosition(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse position);

    /**
     * Unsets the "position" attribute
     */
    void unsetPosition();

    /**
     * Gets the "selection" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getSelection();

    /**
     * Gets (as xml) the "selection" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetSelection();

    /**
     * True if has "selection" attribute
     */
    boolean isSetSelection();

    /**
     * Sets the "selection" attribute
     */
    void setSelection(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum selection);

    /**
     * Sets (as xml) the "selection" attribute
     */
    void xsetSelection(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse selection);

    /**
     * Unsets the "selection" attribute
     */
    void unsetSelection();

    /**
     * Gets the "grouping" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getGrouping();

    /**
     * Gets (as xml) the "grouping" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetGrouping();

    /**
     * True if has "grouping" attribute
     */
    boolean isSetGrouping();

    /**
     * Sets the "grouping" attribute
     */
    void setGrouping(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum grouping);

    /**
     * Sets (as xml) the "grouping" attribute
     */
    void xsetGrouping(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse grouping);

    /**
     * Unsets the "grouping" attribute
     */
    void unsetGrouping();

    /**
     * Gets the "ungrouping" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getUngrouping();

    /**
     * Gets (as xml) the "ungrouping" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetUngrouping();

    /**
     * True if has "ungrouping" attribute
     */
    boolean isSetUngrouping();

    /**
     * Sets the "ungrouping" attribute
     */
    void setUngrouping(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum ungrouping);

    /**
     * Sets (as xml) the "ungrouping" attribute
     */
    void xsetUngrouping(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse ungrouping);

    /**
     * Unsets the "ungrouping" attribute
     */
    void unsetUngrouping();

    /**
     * Gets the "rotation" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getRotation();

    /**
     * Gets (as xml) the "rotation" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetRotation();

    /**
     * True if has "rotation" attribute
     */
    boolean isSetRotation();

    /**
     * Sets the "rotation" attribute
     */
    void setRotation(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum rotation);

    /**
     * Sets (as xml) the "rotation" attribute
     */
    void xsetRotation(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse rotation);

    /**
     * Unsets the "rotation" attribute
     */
    void unsetRotation();

    /**
     * Gets the "cropping" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getCropping();

    /**
     * Gets (as xml) the "cropping" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetCropping();

    /**
     * True if has "cropping" attribute
     */
    boolean isSetCropping();

    /**
     * Sets the "cropping" attribute
     */
    void setCropping(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum cropping);

    /**
     * Sets (as xml) the "cropping" attribute
     */
    void xsetCropping(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse cropping);

    /**
     * Unsets the "cropping" attribute
     */
    void unsetCropping();

    /**
     * Gets the "verticies" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getVerticies();

    /**
     * Gets (as xml) the "verticies" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetVerticies();

    /**
     * True if has "verticies" attribute
     */
    boolean isSetVerticies();

    /**
     * Sets the "verticies" attribute
     */
    void setVerticies(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum verticies);

    /**
     * Sets (as xml) the "verticies" attribute
     */
    void xsetVerticies(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse verticies);

    /**
     * Unsets the "verticies" attribute
     */
    void unsetVerticies();

    /**
     * Gets the "adjusthandles" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAdjusthandles();

    /**
     * Gets (as xml) the "adjusthandles" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAdjusthandles();

    /**
     * True if has "adjusthandles" attribute
     */
    boolean isSetAdjusthandles();

    /**
     * Sets the "adjusthandles" attribute
     */
    void setAdjusthandles(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum adjusthandles);

    /**
     * Sets (as xml) the "adjusthandles" attribute
     */
    void xsetAdjusthandles(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse adjusthandles);

    /**
     * Unsets the "adjusthandles" attribute
     */
    void unsetAdjusthandles();

    /**
     * Gets the "text" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getText();

    /**
     * Gets (as xml) the "text" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetText();

    /**
     * True if has "text" attribute
     */
    boolean isSetText();

    /**
     * Sets the "text" attribute
     */
    void setText(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum text);

    /**
     * Sets (as xml) the "text" attribute
     */
    void xsetText(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse text);

    /**
     * Unsets the "text" attribute
     */
    void unsetText();

    /**
     * Gets the "aspectratio" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAspectratio();

    /**
     * Gets (as xml) the "aspectratio" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAspectratio();

    /**
     * True if has "aspectratio" attribute
     */
    boolean isSetAspectratio();

    /**
     * Sets the "aspectratio" attribute
     */
    void setAspectratio(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum aspectratio);

    /**
     * Sets (as xml) the "aspectratio" attribute
     */
    void xsetAspectratio(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse aspectratio);

    /**
     * Unsets the "aspectratio" attribute
     */
    void unsetAspectratio();

    /**
     * Gets the "shapetype" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getShapetype();

    /**
     * Gets (as xml) the "shapetype" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetShapetype();

    /**
     * True if has "shapetype" attribute
     */
    boolean isSetShapetype();

    /**
     * Sets the "shapetype" attribute
     */
    void setShapetype(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum shapetype);

    /**
     * Sets (as xml) the "shapetype" attribute
     */
    void xsetShapetype(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse shapetype);

    /**
     * Unsets the "shapetype" attribute
     */
    void unsetShapetype();
}
