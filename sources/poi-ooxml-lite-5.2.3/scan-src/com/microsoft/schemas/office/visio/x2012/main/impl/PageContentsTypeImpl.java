/*
 * XML Type:  PageContents_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PageContentsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML PageContents_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class PageContentsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.PageContentsType {
    private static final long serialVersionUID = 1L;

    public PageContentsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Shapes"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Connects"),
    };


    /**
     * Gets the "Shapes" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ShapesType getShapes() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ShapesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ShapesType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Shapes" element
     */
    @Override
    public boolean isSetShapes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Shapes" element
     */
    @Override
    public void setShapes(com.microsoft.schemas.office.visio.x2012.main.ShapesType shapes) {
        generatedSetterHelperImpl(shapes, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Shapes" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ShapesType addNewShapes() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ShapesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ShapesType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "Shapes" element
     */
    @Override
    public void unsetShapes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Connects" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ConnectsType getConnects() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ConnectsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ConnectsType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Connects" element
     */
    @Override
    public boolean isSetConnects() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Connects" element
     */
    @Override
    public void setConnects(com.microsoft.schemas.office.visio.x2012.main.ConnectsType connects) {
        generatedSetterHelperImpl(connects, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Connects" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ConnectsType addNewConnects() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ConnectsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ConnectsType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "Connects" element
     */
    @Override
    public void unsetConnects() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
