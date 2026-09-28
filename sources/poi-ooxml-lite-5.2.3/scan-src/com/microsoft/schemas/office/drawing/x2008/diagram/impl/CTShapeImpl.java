/*
 * XML Type:  CT_Shape
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.CTShape
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Shape(@http://schemas.microsoft.com/office/drawing/2008/diagram).
 *
 * This is a complex type.
 */
public class CTShapeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2008.diagram.CTShape {
    private static final long serialVersionUID = 1L;

    public CTShapeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "nvSpPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "spPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "style"),
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "txBody"),
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "txXfrm"),
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "extLst"),
        new QName("", "modelId"),
    };


    /**
     * Gets the "nvSpPr" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTShapeNonVisual getNvSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTShapeNonVisual target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTShapeNonVisual)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "nvSpPr" element
     */
    @Override
    public void setNvSpPr(com.microsoft.schemas.office.drawing.x2008.diagram.CTShapeNonVisual nvSpPr) {
        generatedSetterHelperImpl(nvSpPr, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "nvSpPr" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTShapeNonVisual addNewNvSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTShapeNonVisual target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTShapeNonVisual)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "spPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "spPr" element
     */
    @Override
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr) {
        generatedSetterHelperImpl(spPr, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "spPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets the "style" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle getStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "style" element
     */
    @Override
    public boolean isSetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "style" element
     */
    @Override
    public void setStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle style) {
        generatedSetterHelperImpl(style, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "style" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle addNewStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "style" element
     */
    @Override
    public void unsetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "txBody" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxBody() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "txBody" element
     */
    @Override
    public boolean isSetTxBody() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "txBody" element
     */
    @Override
    public void setTxBody(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txBody) {
        generatedSetterHelperImpl(txBody, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "txBody" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxBody() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "txBody" element
     */
    @Override
    public void unsetTxBody() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "txXfrm" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D getTxXfrm() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "txXfrm" element
     */
    @Override
    public boolean isSetTxXfrm() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "txXfrm" element
     */
    @Override
    public void setTxXfrm(org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D txXfrm) {
        generatedSetterHelperImpl(txXfrm, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "txXfrm" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D addNewTxXfrm() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "txXfrm" element
     */
    @Override
    public void unsetTxXfrm() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "extLst" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "modelId" attribute
     */
    @Override
    public java.lang.Object getModelId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "modelId" attribute
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetModelId() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Sets the "modelId" attribute
     */
    @Override
    public void setModelId(java.lang.Object modelId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setObjectValue(modelId);
        }
    }

    /**
     * Sets (as xml) the "modelId" attribute
     */
    @Override
    public void xsetModelId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId modelId) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(modelId);
        }
    }
}
