/*
 * XML Type:  CT_Group
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTGroup
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Group(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.CTGroup {
    private static final long serialVersionUID = 1L;

    public CTGroupImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "path"),
        new QName("urn:schemas-microsoft-com:vml", "formulas"),
        new QName("urn:schemas-microsoft-com:vml", "handles"),
        new QName("urn:schemas-microsoft-com:vml", "fill"),
        new QName("urn:schemas-microsoft-com:vml", "stroke"),
        new QName("urn:schemas-microsoft-com:vml", "shadow"),
        new QName("urn:schemas-microsoft-com:vml", "textbox"),
        new QName("urn:schemas-microsoft-com:vml", "textpath"),
        new QName("urn:schemas-microsoft-com:vml", "imagedata"),
        new QName("urn:schemas-microsoft-com:office:office", "skew"),
        new QName("urn:schemas-microsoft-com:office:office", "extrusion"),
        new QName("urn:schemas-microsoft-com:office:office", "callout"),
        new QName("urn:schemas-microsoft-com:office:office", "lock"),
        new QName("urn:schemas-microsoft-com:office:office", "clippath"),
        new QName("urn:schemas-microsoft-com:office:office", "signatureline"),
        new QName("urn:schemas-microsoft-com:office:word", "wrap"),
        new QName("urn:schemas-microsoft-com:office:word", "anchorlock"),
        new QName("urn:schemas-microsoft-com:office:word", "bordertop"),
        new QName("urn:schemas-microsoft-com:office:word", "borderbottom"),
        new QName("urn:schemas-microsoft-com:office:word", "borderleft"),
        new QName("urn:schemas-microsoft-com:office:word", "borderright"),
        new QName("urn:schemas-microsoft-com:office:excel", "ClientData"),
        new QName("urn:schemas-microsoft-com:office:powerpoint", "textdata"),
        new QName("urn:schemas-microsoft-com:vml", "group"),
        new QName("urn:schemas-microsoft-com:vml", "shape"),
        new QName("urn:schemas-microsoft-com:vml", "shapetype"),
        new QName("urn:schemas-microsoft-com:vml", "arc"),
        new QName("urn:schemas-microsoft-com:vml", "curve"),
        new QName("urn:schemas-microsoft-com:vml", "image"),
        new QName("urn:schemas-microsoft-com:vml", "line"),
        new QName("urn:schemas-microsoft-com:vml", "oval"),
        new QName("urn:schemas-microsoft-com:vml", "polyline"),
        new QName("urn:schemas-microsoft-com:vml", "rect"),
        new QName("urn:schemas-microsoft-com:vml", "roundrect"),
        new QName("urn:schemas-microsoft-com:office:office", "diagram"),
        new QName("", "id"),
        new QName("", "style"),
        new QName("", "href"),
        new QName("", "target"),
        new QName("", "class"),
        new QName("", "title"),
        new QName("", "alt"),
        new QName("", "coordsize"),
        new QName("", "coordorigin"),
        new QName("", "wrapcoords"),
        new QName("", "print"),
        new QName("urn:schemas-microsoft-com:office:office", "spid"),
        new QName("urn:schemas-microsoft-com:office:office", "oned"),
        new QName("urn:schemas-microsoft-com:office:office", "regroupid"),
        new QName("urn:schemas-microsoft-com:office:office", "doubleclicknotify"),
        new QName("urn:schemas-microsoft-com:office:office", "button"),
        new QName("urn:schemas-microsoft-com:office:office", "userhidden"),
        new QName("urn:schemas-microsoft-com:office:office", "bullet"),
        new QName("urn:schemas-microsoft-com:office:office", "hr"),
        new QName("urn:schemas-microsoft-com:office:office", "hrstd"),
        new QName("urn:schemas-microsoft-com:office:office", "hrnoshade"),
        new QName("urn:schemas-microsoft-com:office:office", "hrpct"),
        new QName("urn:schemas-microsoft-com:office:office", "hralign"),
        new QName("urn:schemas-microsoft-com:office:office", "allowincell"),
        new QName("urn:schemas-microsoft-com:office:office", "allowoverlap"),
        new QName("urn:schemas-microsoft-com:office:office", "userdrawn"),
        new QName("urn:schemas-microsoft-com:office:office", "bordertopcolor"),
        new QName("urn:schemas-microsoft-com:office:office", "borderleftcolor"),
        new QName("urn:schemas-microsoft-com:office:office", "borderbottomcolor"),
        new QName("urn:schemas-microsoft-com:office:office", "borderrightcolor"),
        new QName("urn:schemas-microsoft-com:office:office", "dgmlayout"),
        new QName("urn:schemas-microsoft-com:office:office", "dgmnodekind"),
        new QName("urn:schemas-microsoft-com:office:office", "dgmlayoutmru"),
        new QName("urn:schemas-microsoft-com:office:office", "insetmode"),
        new QName("", "filled"),
        new QName("", "fillcolor"),
        new QName("", "editas"),
        new QName("urn:schemas-microsoft-com:office:office", "tableproperties"),
        new QName("urn:schemas-microsoft-com:office:office", "tablelimits"),
    };


    /**
     * Gets a List of "path" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTPath> getPathList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPathArray,
                this::setPathArray,
                this::insertNewPath,
                this::removePath,
                this::sizeOfPathArray
            );
        }
    }

    /**
     * Gets array of all "path" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTPath[] getPathArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.vml.CTPath[0]);
    }

    /**
     * Gets ith "path" element
     */
    @Override
    public com.microsoft.schemas.vml.CTPath getPathArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTPath target = null;
            target = (com.microsoft.schemas.vml.CTPath)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "path" element
     */
    @Override
    public int sizeOfPathArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "path" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPathArray(com.microsoft.schemas.vml.CTPath[] pathArray) {
        check_orphaned();
        arraySetterHelper(pathArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "path" element
     */
    @Override
    public void setPathArray(int i, com.microsoft.schemas.vml.CTPath path) {
        generatedSetterHelperImpl(path, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "path" element
     */
    @Override
    public com.microsoft.schemas.vml.CTPath insertNewPath(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTPath target = null;
            target = (com.microsoft.schemas.vml.CTPath)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "path" element
     */
    @Override
    public com.microsoft.schemas.vml.CTPath addNewPath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTPath target = null;
            target = (com.microsoft.schemas.vml.CTPath)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "path" element
     */
    @Override
    public void removePath(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "formulas" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTFormulas> getFormulasList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFormulasArray,
                this::setFormulasArray,
                this::insertNewFormulas,
                this::removeFormulas,
                this::sizeOfFormulasArray
            );
        }
    }

    /**
     * Gets array of all "formulas" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTFormulas[] getFormulasArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.vml.CTFormulas[0]);
    }

    /**
     * Gets ith "formulas" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFormulas getFormulasArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFormulas target = null;
            target = (com.microsoft.schemas.vml.CTFormulas)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "formulas" element
     */
    @Override
    public int sizeOfFormulasArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "formulas" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFormulasArray(com.microsoft.schemas.vml.CTFormulas[] formulasArray) {
        check_orphaned();
        arraySetterHelper(formulasArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "formulas" element
     */
    @Override
    public void setFormulasArray(int i, com.microsoft.schemas.vml.CTFormulas formulas) {
        generatedSetterHelperImpl(formulas, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "formulas" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFormulas insertNewFormulas(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFormulas target = null;
            target = (com.microsoft.schemas.vml.CTFormulas)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "formulas" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFormulas addNewFormulas() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFormulas target = null;
            target = (com.microsoft.schemas.vml.CTFormulas)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "formulas" element
     */
    @Override
    public void removeFormulas(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "handles" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTHandles> getHandlesList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getHandlesArray,
                this::setHandlesArray,
                this::insertNewHandles,
                this::removeHandles,
                this::sizeOfHandlesArray
            );
        }
    }

    /**
     * Gets array of all "handles" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTHandles[] getHandlesArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new com.microsoft.schemas.vml.CTHandles[0]);
    }

    /**
     * Gets ith "handles" element
     */
    @Override
    public com.microsoft.schemas.vml.CTHandles getHandlesArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTHandles target = null;
            target = (com.microsoft.schemas.vml.CTHandles)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "handles" element
     */
    @Override
    public int sizeOfHandlesArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "handles" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setHandlesArray(com.microsoft.schemas.vml.CTHandles[] handlesArray) {
        check_orphaned();
        arraySetterHelper(handlesArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "handles" element
     */
    @Override
    public void setHandlesArray(int i, com.microsoft.schemas.vml.CTHandles handles) {
        generatedSetterHelperImpl(handles, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "handles" element
     */
    @Override
    public com.microsoft.schemas.vml.CTHandles insertNewHandles(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTHandles target = null;
            target = (com.microsoft.schemas.vml.CTHandles)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "handles" element
     */
    @Override
    public com.microsoft.schemas.vml.CTHandles addNewHandles() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTHandles target = null;
            target = (com.microsoft.schemas.vml.CTHandles)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "handles" element
     */
    @Override
    public void removeHandles(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "fill" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTFill> getFillList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFillArray,
                this::setFillArray,
                this::insertNewFill,
                this::removeFill,
                this::sizeOfFillArray
            );
        }
    }

    /**
     * Gets array of all "fill" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTFill[] getFillArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new com.microsoft.schemas.vml.CTFill[0]);
    }

    /**
     * Gets ith "fill" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFill getFillArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFill target = null;
            target = (com.microsoft.schemas.vml.CTFill)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "fill" element
     */
    @Override
    public int sizeOfFillArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "fill" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFillArray(com.microsoft.schemas.vml.CTFill[] fillArray) {
        check_orphaned();
        arraySetterHelper(fillArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "fill" element
     */
    @Override
    public void setFillArray(int i, com.microsoft.schemas.vml.CTFill fill) {
        generatedSetterHelperImpl(fill, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fill" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFill insertNewFill(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFill target = null;
            target = (com.microsoft.schemas.vml.CTFill)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "fill" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFill addNewFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFill target = null;
            target = (com.microsoft.schemas.vml.CTFill)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "fill" element
     */
    @Override
    public void removeFill(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "stroke" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTStroke> getStrokeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStrokeArray,
                this::setStrokeArray,
                this::insertNewStroke,
                this::removeStroke,
                this::sizeOfStrokeArray
            );
        }
    }

    /**
     * Gets array of all "stroke" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTStroke[] getStrokeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new com.microsoft.schemas.vml.CTStroke[0]);
    }

    /**
     * Gets ith "stroke" element
     */
    @Override
    public com.microsoft.schemas.vml.CTStroke getStrokeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTStroke target = null;
            target = (com.microsoft.schemas.vml.CTStroke)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "stroke" element
     */
    @Override
    public int sizeOfStrokeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "stroke" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStrokeArray(com.microsoft.schemas.vml.CTStroke[] strokeArray) {
        check_orphaned();
        arraySetterHelper(strokeArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "stroke" element
     */
    @Override
    public void setStrokeArray(int i, com.microsoft.schemas.vml.CTStroke stroke) {
        generatedSetterHelperImpl(stroke, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "stroke" element
     */
    @Override
    public com.microsoft.schemas.vml.CTStroke insertNewStroke(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTStroke target = null;
            target = (com.microsoft.schemas.vml.CTStroke)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "stroke" element
     */
    @Override
    public com.microsoft.schemas.vml.CTStroke addNewStroke() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTStroke target = null;
            target = (com.microsoft.schemas.vml.CTStroke)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "stroke" element
     */
    @Override
    public void removeStroke(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "shadow" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTShadow> getShadowList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getShadowArray,
                this::setShadowArray,
                this::insertNewShadow,
                this::removeShadow,
                this::sizeOfShadowArray
            );
        }
    }

    /**
     * Gets array of all "shadow" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTShadow[] getShadowArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new com.microsoft.schemas.vml.CTShadow[0]);
    }

    /**
     * Gets ith "shadow" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShadow getShadowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShadow target = null;
            target = (com.microsoft.schemas.vml.CTShadow)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "shadow" element
     */
    @Override
    public int sizeOfShadowArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "shadow" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setShadowArray(com.microsoft.schemas.vml.CTShadow[] shadowArray) {
        check_orphaned();
        arraySetterHelper(shadowArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "shadow" element
     */
    @Override
    public void setShadowArray(int i, com.microsoft.schemas.vml.CTShadow shadow) {
        generatedSetterHelperImpl(shadow, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "shadow" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShadow insertNewShadow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShadow target = null;
            target = (com.microsoft.schemas.vml.CTShadow)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "shadow" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShadow addNewShadow() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShadow target = null;
            target = (com.microsoft.schemas.vml.CTShadow)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "shadow" element
     */
    @Override
    public void removeShadow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "textbox" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTTextbox> getTextboxList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTextboxArray,
                this::setTextboxArray,
                this::insertNewTextbox,
                this::removeTextbox,
                this::sizeOfTextboxArray
            );
        }
    }

    /**
     * Gets array of all "textbox" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTTextbox[] getTextboxArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new com.microsoft.schemas.vml.CTTextbox[0]);
    }

    /**
     * Gets ith "textbox" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextbox getTextboxArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextbox target = null;
            target = (com.microsoft.schemas.vml.CTTextbox)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "textbox" element
     */
    @Override
    public int sizeOfTextboxArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "textbox" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTextboxArray(com.microsoft.schemas.vml.CTTextbox[] textboxArray) {
        check_orphaned();
        arraySetterHelper(textboxArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "textbox" element
     */
    @Override
    public void setTextboxArray(int i, com.microsoft.schemas.vml.CTTextbox textbox) {
        generatedSetterHelperImpl(textbox, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "textbox" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextbox insertNewTextbox(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextbox target = null;
            target = (com.microsoft.schemas.vml.CTTextbox)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "textbox" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextbox addNewTextbox() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextbox target = null;
            target = (com.microsoft.schemas.vml.CTTextbox)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "textbox" element
     */
    @Override
    public void removeTextbox(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "textpath" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTTextPath> getTextpathList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTextpathArray,
                this::setTextpathArray,
                this::insertNewTextpath,
                this::removeTextpath,
                this::sizeOfTextpathArray
            );
        }
    }

    /**
     * Gets array of all "textpath" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTTextPath[] getTextpathArray() {
        return getXmlObjectArray(PROPERTY_QNAME[7], new com.microsoft.schemas.vml.CTTextPath[0]);
    }

    /**
     * Gets ith "textpath" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextPath getTextpathArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextPath target = null;
            target = (com.microsoft.schemas.vml.CTTextPath)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "textpath" element
     */
    @Override
    public int sizeOfTextpathArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "textpath" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTextpathArray(com.microsoft.schemas.vml.CTTextPath[] textpathArray) {
        check_orphaned();
        arraySetterHelper(textpathArray, PROPERTY_QNAME[7]);
    }

    /**
     * Sets ith "textpath" element
     */
    @Override
    public void setTextpathArray(int i, com.microsoft.schemas.vml.CTTextPath textpath) {
        generatedSetterHelperImpl(textpath, PROPERTY_QNAME[7], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "textpath" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextPath insertNewTextpath(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextPath target = null;
            target = (com.microsoft.schemas.vml.CTTextPath)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "textpath" element
     */
    @Override
    public com.microsoft.schemas.vml.CTTextPath addNewTextpath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTTextPath target = null;
            target = (com.microsoft.schemas.vml.CTTextPath)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "textpath" element
     */
    @Override
    public void removeTextpath(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "imagedata" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTImageData> getImagedataList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getImagedataArray,
                this::setImagedataArray,
                this::insertNewImagedata,
                this::removeImagedata,
                this::sizeOfImagedataArray
            );
        }
    }

    /**
     * Gets array of all "imagedata" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTImageData[] getImagedataArray() {
        return getXmlObjectArray(PROPERTY_QNAME[8], new com.microsoft.schemas.vml.CTImageData[0]);
    }

    /**
     * Gets ith "imagedata" element
     */
    @Override
    public com.microsoft.schemas.vml.CTImageData getImagedataArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTImageData target = null;
            target = (com.microsoft.schemas.vml.CTImageData)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "imagedata" element
     */
    @Override
    public int sizeOfImagedataArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "imagedata" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setImagedataArray(com.microsoft.schemas.vml.CTImageData[] imagedataArray) {
        check_orphaned();
        arraySetterHelper(imagedataArray, PROPERTY_QNAME[8]);
    }

    /**
     * Sets ith "imagedata" element
     */
    @Override
    public void setImagedataArray(int i, com.microsoft.schemas.vml.CTImageData imagedata) {
        generatedSetterHelperImpl(imagedata, PROPERTY_QNAME[8], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "imagedata" element
     */
    @Override
    public com.microsoft.schemas.vml.CTImageData insertNewImagedata(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTImageData target = null;
            target = (com.microsoft.schemas.vml.CTImageData)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "imagedata" element
     */
    @Override
    public com.microsoft.schemas.vml.CTImageData addNewImagedata() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTImageData target = null;
            target = (com.microsoft.schemas.vml.CTImageData)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "imagedata" element
     */
    @Override
    public void removeImagedata(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }

    /**
     * Gets a List of "skew" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.office.CTSkew> getSkewList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSkewArray,
                this::setSkewArray,
                this::insertNewSkew,
                this::removeSkew,
                this::sizeOfSkewArray
            );
        }
    }

    /**
     * Gets array of all "skew" elements
     */
    @Override
    public com.microsoft.schemas.office.office.CTSkew[] getSkewArray() {
        return getXmlObjectArray(PROPERTY_QNAME[9], new com.microsoft.schemas.office.office.CTSkew[0]);
    }

    /**
     * Gets ith "skew" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSkew getSkewArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSkew target = null;
            target = (com.microsoft.schemas.office.office.CTSkew)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "skew" element
     */
    @Override
    public int sizeOfSkewArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets array of all "skew" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSkewArray(com.microsoft.schemas.office.office.CTSkew[] skewArray) {
        check_orphaned();
        arraySetterHelper(skewArray, PROPERTY_QNAME[9]);
    }

    /**
     * Sets ith "skew" element
     */
    @Override
    public void setSkewArray(int i, com.microsoft.schemas.office.office.CTSkew skew) {
        generatedSetterHelperImpl(skew, PROPERTY_QNAME[9], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "skew" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSkew insertNewSkew(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSkew target = null;
            target = (com.microsoft.schemas.office.office.CTSkew)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "skew" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSkew addNewSkew() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSkew target = null;
            target = (com.microsoft.schemas.office.office.CTSkew)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "skew" element
     */
    @Override
    public void removeSkew(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets a List of "extrusion" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.office.CTExtrusion> getExtrusionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getExtrusionArray,
                this::setExtrusionArray,
                this::insertNewExtrusion,
                this::removeExtrusion,
                this::sizeOfExtrusionArray
            );
        }
    }

    /**
     * Gets array of all "extrusion" elements
     */
    @Override
    public com.microsoft.schemas.office.office.CTExtrusion[] getExtrusionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[10], new com.microsoft.schemas.office.office.CTExtrusion[0]);
    }

    /**
     * Gets ith "extrusion" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTExtrusion getExtrusionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTExtrusion target = null;
            target = (com.microsoft.schemas.office.office.CTExtrusion)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "extrusion" element
     */
    @Override
    public int sizeOfExtrusionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets array of all "extrusion" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setExtrusionArray(com.microsoft.schemas.office.office.CTExtrusion[] extrusionArray) {
        check_orphaned();
        arraySetterHelper(extrusionArray, PROPERTY_QNAME[10]);
    }

    /**
     * Sets ith "extrusion" element
     */
    @Override
    public void setExtrusionArray(int i, com.microsoft.schemas.office.office.CTExtrusion extrusion) {
        generatedSetterHelperImpl(extrusion, PROPERTY_QNAME[10], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "extrusion" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTExtrusion insertNewExtrusion(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTExtrusion target = null;
            target = (com.microsoft.schemas.office.office.CTExtrusion)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "extrusion" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTExtrusion addNewExtrusion() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTExtrusion target = null;
            target = (com.microsoft.schemas.office.office.CTExtrusion)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "extrusion" element
     */
    @Override
    public void removeExtrusion(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets a List of "callout" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.office.CTCallout> getCalloutList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCalloutArray,
                this::setCalloutArray,
                this::insertNewCallout,
                this::removeCallout,
                this::sizeOfCalloutArray
            );
        }
    }

    /**
     * Gets array of all "callout" elements
     */
    @Override
    public com.microsoft.schemas.office.office.CTCallout[] getCalloutArray() {
        return getXmlObjectArray(PROPERTY_QNAME[11], new com.microsoft.schemas.office.office.CTCallout[0]);
    }

    /**
     * Gets ith "callout" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTCallout getCalloutArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTCallout target = null;
            target = (com.microsoft.schemas.office.office.CTCallout)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "callout" element
     */
    @Override
    public int sizeOfCalloutArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets array of all "callout" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCalloutArray(com.microsoft.schemas.office.office.CTCallout[] calloutArray) {
        check_orphaned();
        arraySetterHelper(calloutArray, PROPERTY_QNAME[11]);
    }

    /**
     * Sets ith "callout" element
     */
    @Override
    public void setCalloutArray(int i, com.microsoft.schemas.office.office.CTCallout callout) {
        generatedSetterHelperImpl(callout, PROPERTY_QNAME[11], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "callout" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTCallout insertNewCallout(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTCallout target = null;
            target = (com.microsoft.schemas.office.office.CTCallout)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "callout" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTCallout addNewCallout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTCallout target = null;
            target = (com.microsoft.schemas.office.office.CTCallout)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Removes the ith "callout" element
     */
    @Override
    public void removeCallout(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], i);
        }
    }

    /**
     * Gets a List of "lock" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.office.CTLock> getLockList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLockArray,
                this::setLockArray,
                this::insertNewLock,
                this::removeLock,
                this::sizeOfLockArray
            );
        }
    }

    /**
     * Gets array of all "lock" elements
     */
    @Override
    public com.microsoft.schemas.office.office.CTLock[] getLockArray() {
        return getXmlObjectArray(PROPERTY_QNAME[12], new com.microsoft.schemas.office.office.CTLock[0]);
    }

    /**
     * Gets ith "lock" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTLock getLockArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTLock target = null;
            target = (com.microsoft.schemas.office.office.CTLock)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "lock" element
     */
    @Override
    public int sizeOfLockArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets array of all "lock" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLockArray(com.microsoft.schemas.office.office.CTLock[] lockArray) {
        check_orphaned();
        arraySetterHelper(lockArray, PROPERTY_QNAME[12]);
    }

    /**
     * Sets ith "lock" element
     */
    @Override
    public void setLockArray(int i, com.microsoft.schemas.office.office.CTLock lock) {
        generatedSetterHelperImpl(lock, PROPERTY_QNAME[12], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lock" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTLock insertNewLock(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTLock target = null;
            target = (com.microsoft.schemas.office.office.CTLock)get_store().insert_element_user(PROPERTY_QNAME[12], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "lock" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTLock addNewLock() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTLock target = null;
            target = (com.microsoft.schemas.office.office.CTLock)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Removes the ith "lock" element
     */
    @Override
    public void removeLock(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], i);
        }
    }

    /**
     * Gets a List of "clippath" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.office.CTClipPath> getClippathList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClippathArray,
                this::setClippathArray,
                this::insertNewClippath,
                this::removeClippath,
                this::sizeOfClippathArray
            );
        }
    }

    /**
     * Gets array of all "clippath" elements
     */
    @Override
    public com.microsoft.schemas.office.office.CTClipPath[] getClippathArray() {
        return getXmlObjectArray(PROPERTY_QNAME[13], new com.microsoft.schemas.office.office.CTClipPath[0]);
    }

    /**
     * Gets ith "clippath" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTClipPath getClippathArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTClipPath target = null;
            target = (com.microsoft.schemas.office.office.CTClipPath)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "clippath" element
     */
    @Override
    public int sizeOfClippathArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets array of all "clippath" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClippathArray(com.microsoft.schemas.office.office.CTClipPath[] clippathArray) {
        check_orphaned();
        arraySetterHelper(clippathArray, PROPERTY_QNAME[13]);
    }

    /**
     * Sets ith "clippath" element
     */
    @Override
    public void setClippathArray(int i, com.microsoft.schemas.office.office.CTClipPath clippath) {
        generatedSetterHelperImpl(clippath, PROPERTY_QNAME[13], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "clippath" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTClipPath insertNewClippath(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTClipPath target = null;
            target = (com.microsoft.schemas.office.office.CTClipPath)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "clippath" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTClipPath addNewClippath() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTClipPath target = null;
            target = (com.microsoft.schemas.office.office.CTClipPath)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Removes the ith "clippath" element
     */
    @Override
    public void removeClippath(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], i);
        }
    }

    /**
     * Gets a List of "signatureline" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.office.CTSignatureLine> getSignaturelineList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSignaturelineArray,
                this::setSignaturelineArray,
                this::insertNewSignatureline,
                this::removeSignatureline,
                this::sizeOfSignaturelineArray
            );
        }
    }

    /**
     * Gets array of all "signatureline" elements
     */
    @Override
    public com.microsoft.schemas.office.office.CTSignatureLine[] getSignaturelineArray() {
        return getXmlObjectArray(PROPERTY_QNAME[14], new com.microsoft.schemas.office.office.CTSignatureLine[0]);
    }

    /**
     * Gets ith "signatureline" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSignatureLine getSignaturelineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSignatureLine target = null;
            target = (com.microsoft.schemas.office.office.CTSignatureLine)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "signatureline" element
     */
    @Override
    public int sizeOfSignaturelineArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets array of all "signatureline" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSignaturelineArray(com.microsoft.schemas.office.office.CTSignatureLine[] signaturelineArray) {
        check_orphaned();
        arraySetterHelper(signaturelineArray, PROPERTY_QNAME[14]);
    }

    /**
     * Sets ith "signatureline" element
     */
    @Override
    public void setSignaturelineArray(int i, com.microsoft.schemas.office.office.CTSignatureLine signatureline) {
        generatedSetterHelperImpl(signatureline, PROPERTY_QNAME[14], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "signatureline" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSignatureLine insertNewSignatureline(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSignatureLine target = null;
            target = (com.microsoft.schemas.office.office.CTSignatureLine)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "signatureline" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTSignatureLine addNewSignatureline() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTSignatureLine target = null;
            target = (com.microsoft.schemas.office.office.CTSignatureLine)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Removes the ith "signatureline" element
     */
    @Override
    public void removeSignatureline(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], i);
        }
    }

    /**
     * Gets a List of "wrap" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.CTWrap> getWrapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getWrapArray,
                this::setWrapArray,
                this::insertNewWrap,
                this::removeWrap,
                this::sizeOfWrapArray
            );
        }
    }

    /**
     * Gets array of all "wrap" elements
     */
    @Override
    public com.microsoft.schemas.office.word.CTWrap[] getWrapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[15], new com.microsoft.schemas.office.word.CTWrap[0]);
    }

    /**
     * Gets ith "wrap" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTWrap getWrapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTWrap target = null;
            target = (com.microsoft.schemas.office.word.CTWrap)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "wrap" element
     */
    @Override
    public int sizeOfWrapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets array of all "wrap" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setWrapArray(com.microsoft.schemas.office.word.CTWrap[] wrapArray) {
        check_orphaned();
        arraySetterHelper(wrapArray, PROPERTY_QNAME[15]);
    }

    /**
     * Sets ith "wrap" element
     */
    @Override
    public void setWrapArray(int i, com.microsoft.schemas.office.word.CTWrap wrap) {
        generatedSetterHelperImpl(wrap, PROPERTY_QNAME[15], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "wrap" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTWrap insertNewWrap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTWrap target = null;
            target = (com.microsoft.schemas.office.word.CTWrap)get_store().insert_element_user(PROPERTY_QNAME[15], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "wrap" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTWrap addNewWrap() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTWrap target = null;
            target = (com.microsoft.schemas.office.word.CTWrap)get_store().add_element_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * Removes the ith "wrap" element
     */
    @Override
    public void removeWrap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], i);
        }
    }

    /**
     * Gets a List of "anchorlock" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.CTAnchorLock> getAnchorlockList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAnchorlockArray,
                this::setAnchorlockArray,
                this::insertNewAnchorlock,
                this::removeAnchorlock,
                this::sizeOfAnchorlockArray
            );
        }
    }

    /**
     * Gets array of all "anchorlock" elements
     */
    @Override
    public com.microsoft.schemas.office.word.CTAnchorLock[] getAnchorlockArray() {
        return getXmlObjectArray(PROPERTY_QNAME[16], new com.microsoft.schemas.office.word.CTAnchorLock[0]);
    }

    /**
     * Gets ith "anchorlock" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTAnchorLock getAnchorlockArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTAnchorLock target = null;
            target = (com.microsoft.schemas.office.word.CTAnchorLock)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "anchorlock" element
     */
    @Override
    public int sizeOfAnchorlockArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Sets array of all "anchorlock" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAnchorlockArray(com.microsoft.schemas.office.word.CTAnchorLock[] anchorlockArray) {
        check_orphaned();
        arraySetterHelper(anchorlockArray, PROPERTY_QNAME[16]);
    }

    /**
     * Sets ith "anchorlock" element
     */
    @Override
    public void setAnchorlockArray(int i, com.microsoft.schemas.office.word.CTAnchorLock anchorlock) {
        generatedSetterHelperImpl(anchorlock, PROPERTY_QNAME[16], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "anchorlock" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTAnchorLock insertNewAnchorlock(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTAnchorLock target = null;
            target = (com.microsoft.schemas.office.word.CTAnchorLock)get_store().insert_element_user(PROPERTY_QNAME[16], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "anchorlock" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTAnchorLock addNewAnchorlock() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTAnchorLock target = null;
            target = (com.microsoft.schemas.office.word.CTAnchorLock)get_store().add_element_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * Removes the ith "anchorlock" element
     */
    @Override
    public void removeAnchorlock(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], i);
        }
    }

    /**
     * Gets a List of "bordertop" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.CTBorder> getBordertopList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getBordertopArray,
                this::setBordertopArray,
                this::insertNewBordertop,
                this::removeBordertop,
                this::sizeOfBordertopArray
            );
        }
    }

    /**
     * Gets array of all "bordertop" elements
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder[] getBordertopArray() {
        return getXmlObjectArray(PROPERTY_QNAME[17], new com.microsoft.schemas.office.word.CTBorder[0]);
    }

    /**
     * Gets ith "bordertop" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder getBordertopArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "bordertop" element
     */
    @Override
    public int sizeOfBordertopArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets array of all "bordertop" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setBordertopArray(com.microsoft.schemas.office.word.CTBorder[] bordertopArray) {
        check_orphaned();
        arraySetterHelper(bordertopArray, PROPERTY_QNAME[17]);
    }

    /**
     * Sets ith "bordertop" element
     */
    @Override
    public void setBordertopArray(int i, com.microsoft.schemas.office.word.CTBorder bordertop) {
        generatedSetterHelperImpl(bordertop, PROPERTY_QNAME[17], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "bordertop" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder insertNewBordertop(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().insert_element_user(PROPERTY_QNAME[17], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "bordertop" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder addNewBordertop() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().add_element_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * Removes the ith "bordertop" element
     */
    @Override
    public void removeBordertop(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[17], i);
        }
    }

    /**
     * Gets a List of "borderbottom" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.CTBorder> getBorderbottomList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getBorderbottomArray,
                this::setBorderbottomArray,
                this::insertNewBorderbottom,
                this::removeBorderbottom,
                this::sizeOfBorderbottomArray
            );
        }
    }

    /**
     * Gets array of all "borderbottom" elements
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder[] getBorderbottomArray() {
        return getXmlObjectArray(PROPERTY_QNAME[18], new com.microsoft.schemas.office.word.CTBorder[0]);
    }

    /**
     * Gets ith "borderbottom" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder getBorderbottomArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "borderbottom" element
     */
    @Override
    public int sizeOfBorderbottomArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets array of all "borderbottom" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setBorderbottomArray(com.microsoft.schemas.office.word.CTBorder[] borderbottomArray) {
        check_orphaned();
        arraySetterHelper(borderbottomArray, PROPERTY_QNAME[18]);
    }

    /**
     * Sets ith "borderbottom" element
     */
    @Override
    public void setBorderbottomArray(int i, com.microsoft.schemas.office.word.CTBorder borderbottom) {
        generatedSetterHelperImpl(borderbottom, PROPERTY_QNAME[18], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "borderbottom" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder insertNewBorderbottom(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().insert_element_user(PROPERTY_QNAME[18], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "borderbottom" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder addNewBorderbottom() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().add_element_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * Removes the ith "borderbottom" element
     */
    @Override
    public void removeBorderbottom(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], i);
        }
    }

    /**
     * Gets a List of "borderleft" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.CTBorder> getBorderleftList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getBorderleftArray,
                this::setBorderleftArray,
                this::insertNewBorderleft,
                this::removeBorderleft,
                this::sizeOfBorderleftArray
            );
        }
    }

    /**
     * Gets array of all "borderleft" elements
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder[] getBorderleftArray() {
        return getXmlObjectArray(PROPERTY_QNAME[19], new com.microsoft.schemas.office.word.CTBorder[0]);
    }

    /**
     * Gets ith "borderleft" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder getBorderleftArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "borderleft" element
     */
    @Override
    public int sizeOfBorderleftArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[19]);
        }
    }

    /**
     * Sets array of all "borderleft" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setBorderleftArray(com.microsoft.schemas.office.word.CTBorder[] borderleftArray) {
        check_orphaned();
        arraySetterHelper(borderleftArray, PROPERTY_QNAME[19]);
    }

    /**
     * Sets ith "borderleft" element
     */
    @Override
    public void setBorderleftArray(int i, com.microsoft.schemas.office.word.CTBorder borderleft) {
        generatedSetterHelperImpl(borderleft, PROPERTY_QNAME[19], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "borderleft" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder insertNewBorderleft(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().insert_element_user(PROPERTY_QNAME[19], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "borderleft" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder addNewBorderleft() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().add_element_user(PROPERTY_QNAME[19]);
            return target;
        }
    }

    /**
     * Removes the ith "borderleft" element
     */
    @Override
    public void removeBorderleft(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[19], i);
        }
    }

    /**
     * Gets a List of "borderright" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.word.CTBorder> getBorderrightList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getBorderrightArray,
                this::setBorderrightArray,
                this::insertNewBorderright,
                this::removeBorderright,
                this::sizeOfBorderrightArray
            );
        }
    }

    /**
     * Gets array of all "borderright" elements
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder[] getBorderrightArray() {
        return getXmlObjectArray(PROPERTY_QNAME[20], new com.microsoft.schemas.office.word.CTBorder[0]);
    }

    /**
     * Gets ith "borderright" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder getBorderrightArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().find_element_user(PROPERTY_QNAME[20], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "borderright" element
     */
    @Override
    public int sizeOfBorderrightArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[20]);
        }
    }

    /**
     * Sets array of all "borderright" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setBorderrightArray(com.microsoft.schemas.office.word.CTBorder[] borderrightArray) {
        check_orphaned();
        arraySetterHelper(borderrightArray, PROPERTY_QNAME[20]);
    }

    /**
     * Sets ith "borderright" element
     */
    @Override
    public void setBorderrightArray(int i, com.microsoft.schemas.office.word.CTBorder borderright) {
        generatedSetterHelperImpl(borderright, PROPERTY_QNAME[20], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "borderright" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder insertNewBorderright(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().insert_element_user(PROPERTY_QNAME[20], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "borderright" element
     */
    @Override
    public com.microsoft.schemas.office.word.CTBorder addNewBorderright() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.CTBorder target = null;
            target = (com.microsoft.schemas.office.word.CTBorder)get_store().add_element_user(PROPERTY_QNAME[20]);
            return target;
        }
    }

    /**
     * Removes the ith "borderright" element
     */
    @Override
    public void removeBorderright(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[20], i);
        }
    }

    /**
     * Gets a List of "ClientData" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.excel.CTClientData> getClientDataList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClientDataArray,
                this::setClientDataArray,
                this::insertNewClientData,
                this::removeClientData,
                this::sizeOfClientDataArray
            );
        }
    }

    /**
     * Gets array of all "ClientData" elements
     */
    @Override
    public com.microsoft.schemas.office.excel.CTClientData[] getClientDataArray() {
        return getXmlObjectArray(PROPERTY_QNAME[21], new com.microsoft.schemas.office.excel.CTClientData[0]);
    }

    /**
     * Gets ith "ClientData" element
     */
    @Override
    public com.microsoft.schemas.office.excel.CTClientData getClientDataArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.CTClientData target = null;
            target = (com.microsoft.schemas.office.excel.CTClientData)get_store().find_element_user(PROPERTY_QNAME[21], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClientData" element
     */
    @Override
    public int sizeOfClientDataArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[21]);
        }
    }

    /**
     * Sets array of all "ClientData" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClientDataArray(com.microsoft.schemas.office.excel.CTClientData[] clientDataArray) {
        check_orphaned();
        arraySetterHelper(clientDataArray, PROPERTY_QNAME[21]);
    }

    /**
     * Sets ith "ClientData" element
     */
    @Override
    public void setClientDataArray(int i, com.microsoft.schemas.office.excel.CTClientData clientData) {
        generatedSetterHelperImpl(clientData, PROPERTY_QNAME[21], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClientData" element
     */
    @Override
    public com.microsoft.schemas.office.excel.CTClientData insertNewClientData(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.CTClientData target = null;
            target = (com.microsoft.schemas.office.excel.CTClientData)get_store().insert_element_user(PROPERTY_QNAME[21], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClientData" element
     */
    @Override
    public com.microsoft.schemas.office.excel.CTClientData addNewClientData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.CTClientData target = null;
            target = (com.microsoft.schemas.office.excel.CTClientData)get_store().add_element_user(PROPERTY_QNAME[21]);
            return target;
        }
    }

    /**
     * Removes the ith "ClientData" element
     */
    @Override
    public void removeClientData(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[21], i);
        }
    }

    /**
     * Gets a List of "textdata" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.powerpoint.CTRel> getTextdataList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTextdataArray,
                this::setTextdataArray,
                this::insertNewTextdata,
                this::removeTextdata,
                this::sizeOfTextdataArray
            );
        }
    }

    /**
     * Gets array of all "textdata" elements
     */
    @Override
    public com.microsoft.schemas.office.powerpoint.CTRel[] getTextdataArray() {
        return getXmlObjectArray(PROPERTY_QNAME[22], new com.microsoft.schemas.office.powerpoint.CTRel[0]);
    }

    /**
     * Gets ith "textdata" element
     */
    @Override
    public com.microsoft.schemas.office.powerpoint.CTRel getTextdataArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.powerpoint.CTRel target = null;
            target = (com.microsoft.schemas.office.powerpoint.CTRel)get_store().find_element_user(PROPERTY_QNAME[22], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "textdata" element
     */
    @Override
    public int sizeOfTextdataArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[22]);
        }
    }

    /**
     * Sets array of all "textdata" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTextdataArray(com.microsoft.schemas.office.powerpoint.CTRel[] textdataArray) {
        check_orphaned();
        arraySetterHelper(textdataArray, PROPERTY_QNAME[22]);
    }

    /**
     * Sets ith "textdata" element
     */
    @Override
    public void setTextdataArray(int i, com.microsoft.schemas.office.powerpoint.CTRel textdata) {
        generatedSetterHelperImpl(textdata, PROPERTY_QNAME[22], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "textdata" element
     */
    @Override
    public com.microsoft.schemas.office.powerpoint.CTRel insertNewTextdata(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.powerpoint.CTRel target = null;
            target = (com.microsoft.schemas.office.powerpoint.CTRel)get_store().insert_element_user(PROPERTY_QNAME[22], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "textdata" element
     */
    @Override
    public com.microsoft.schemas.office.powerpoint.CTRel addNewTextdata() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.powerpoint.CTRel target = null;
            target = (com.microsoft.schemas.office.powerpoint.CTRel)get_store().add_element_user(PROPERTY_QNAME[22]);
            return target;
        }
    }

    /**
     * Removes the ith "textdata" element
     */
    @Override
    public void removeTextdata(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[22], i);
        }
    }

    /**
     * Gets a List of "group" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTGroup> getGroupList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGroupArray,
                this::setGroupArray,
                this::insertNewGroup,
                this::removeGroup,
                this::sizeOfGroupArray
            );
        }
    }

    /**
     * Gets array of all "group" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTGroup[] getGroupArray() {
        return getXmlObjectArray(PROPERTY_QNAME[23], new com.microsoft.schemas.vml.CTGroup[0]);
    }

    /**
     * Gets ith "group" element
     */
    @Override
    public com.microsoft.schemas.vml.CTGroup getGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTGroup target = null;
            target = (com.microsoft.schemas.vml.CTGroup)get_store().find_element_user(PROPERTY_QNAME[23], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "group" element
     */
    @Override
    public int sizeOfGroupArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[23]);
        }
    }

    /**
     * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setGroupArray(com.microsoft.schemas.vml.CTGroup[] groupArray) {
        check_orphaned();
        arraySetterHelper(groupArray, PROPERTY_QNAME[23]);
    }

    /**
     * Sets ith "group" element
     */
    @Override
    public void setGroupArray(int i, com.microsoft.schemas.vml.CTGroup group) {
        generatedSetterHelperImpl(group, PROPERTY_QNAME[23], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    @Override
    public com.microsoft.schemas.vml.CTGroup insertNewGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTGroup target = null;
            target = (com.microsoft.schemas.vml.CTGroup)get_store().insert_element_user(PROPERTY_QNAME[23], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    @Override
    public com.microsoft.schemas.vml.CTGroup addNewGroup() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTGroup target = null;
            target = (com.microsoft.schemas.vml.CTGroup)get_store().add_element_user(PROPERTY_QNAME[23]);
            return target;
        }
    }

    /**
     * Removes the ith "group" element
     */
    @Override
    public void removeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[23], i);
        }
    }

    /**
     * Gets a List of "shape" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTShape> getShapeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getShapeArray,
                this::setShapeArray,
                this::insertNewShape,
                this::removeShape,
                this::sizeOfShapeArray
            );
        }
    }

    /**
     * Gets array of all "shape" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTShape[] getShapeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[24], new com.microsoft.schemas.vml.CTShape[0]);
    }

    /**
     * Gets ith "shape" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShape getShapeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShape target = null;
            target = (com.microsoft.schemas.vml.CTShape)get_store().find_element_user(PROPERTY_QNAME[24], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "shape" element
     */
    @Override
    public int sizeOfShapeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[24]);
        }
    }

    /**
     * Sets array of all "shape" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setShapeArray(com.microsoft.schemas.vml.CTShape[] shapeArray) {
        check_orphaned();
        arraySetterHelper(shapeArray, PROPERTY_QNAME[24]);
    }

    /**
     * Sets ith "shape" element
     */
    @Override
    public void setShapeArray(int i, com.microsoft.schemas.vml.CTShape shape) {
        generatedSetterHelperImpl(shape, PROPERTY_QNAME[24], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "shape" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShape insertNewShape(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShape target = null;
            target = (com.microsoft.schemas.vml.CTShape)get_store().insert_element_user(PROPERTY_QNAME[24], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "shape" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShape addNewShape() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShape target = null;
            target = (com.microsoft.schemas.vml.CTShape)get_store().add_element_user(PROPERTY_QNAME[24]);
            return target;
        }
    }

    /**
     * Removes the ith "shape" element
     */
    @Override
    public void removeShape(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[24], i);
        }
    }

    /**
     * Gets a List of "shapetype" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTShapetype> getShapetypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getShapetypeArray,
                this::setShapetypeArray,
                this::insertNewShapetype,
                this::removeShapetype,
                this::sizeOfShapetypeArray
            );
        }
    }

    /**
     * Gets array of all "shapetype" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTShapetype[] getShapetypeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[25], new com.microsoft.schemas.vml.CTShapetype[0]);
    }

    /**
     * Gets ith "shapetype" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShapetype getShapetypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShapetype target = null;
            target = (com.microsoft.schemas.vml.CTShapetype)get_store().find_element_user(PROPERTY_QNAME[25], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "shapetype" element
     */
    @Override
    public int sizeOfShapetypeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[25]);
        }
    }

    /**
     * Sets array of all "shapetype" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setShapetypeArray(com.microsoft.schemas.vml.CTShapetype[] shapetypeArray) {
        check_orphaned();
        arraySetterHelper(shapetypeArray, PROPERTY_QNAME[25]);
    }

    /**
     * Sets ith "shapetype" element
     */
    @Override
    public void setShapetypeArray(int i, com.microsoft.schemas.vml.CTShapetype shapetype) {
        generatedSetterHelperImpl(shapetype, PROPERTY_QNAME[25], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "shapetype" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShapetype insertNewShapetype(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShapetype target = null;
            target = (com.microsoft.schemas.vml.CTShapetype)get_store().insert_element_user(PROPERTY_QNAME[25], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "shapetype" element
     */
    @Override
    public com.microsoft.schemas.vml.CTShapetype addNewShapetype() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTShapetype target = null;
            target = (com.microsoft.schemas.vml.CTShapetype)get_store().add_element_user(PROPERTY_QNAME[25]);
            return target;
        }
    }

    /**
     * Removes the ith "shapetype" element
     */
    @Override
    public void removeShapetype(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[25], i);
        }
    }

    /**
     * Gets a List of "arc" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTArc> getArcList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getArcArray,
                this::setArcArray,
                this::insertNewArc,
                this::removeArc,
                this::sizeOfArcArray
            );
        }
    }

    /**
     * Gets array of all "arc" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTArc[] getArcArray() {
        return getXmlObjectArray(PROPERTY_QNAME[26], new com.microsoft.schemas.vml.CTArc[0]);
    }

    /**
     * Gets ith "arc" element
     */
    @Override
    public com.microsoft.schemas.vml.CTArc getArcArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTArc target = null;
            target = (com.microsoft.schemas.vml.CTArc)get_store().find_element_user(PROPERTY_QNAME[26], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "arc" element
     */
    @Override
    public int sizeOfArcArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[26]);
        }
    }

    /**
     * Sets array of all "arc" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setArcArray(com.microsoft.schemas.vml.CTArc[] arcArray) {
        check_orphaned();
        arraySetterHelper(arcArray, PROPERTY_QNAME[26]);
    }

    /**
     * Sets ith "arc" element
     */
    @Override
    public void setArcArray(int i, com.microsoft.schemas.vml.CTArc arc) {
        generatedSetterHelperImpl(arc, PROPERTY_QNAME[26], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "arc" element
     */
    @Override
    public com.microsoft.schemas.vml.CTArc insertNewArc(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTArc target = null;
            target = (com.microsoft.schemas.vml.CTArc)get_store().insert_element_user(PROPERTY_QNAME[26], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "arc" element
     */
    @Override
    public com.microsoft.schemas.vml.CTArc addNewArc() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTArc target = null;
            target = (com.microsoft.schemas.vml.CTArc)get_store().add_element_user(PROPERTY_QNAME[26]);
            return target;
        }
    }

    /**
     * Removes the ith "arc" element
     */
    @Override
    public void removeArc(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[26], i);
        }
    }

    /**
     * Gets a List of "curve" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTCurve> getCurveList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCurveArray,
                this::setCurveArray,
                this::insertNewCurve,
                this::removeCurve,
                this::sizeOfCurveArray
            );
        }
    }

    /**
     * Gets array of all "curve" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTCurve[] getCurveArray() {
        return getXmlObjectArray(PROPERTY_QNAME[27], new com.microsoft.schemas.vml.CTCurve[0]);
    }

    /**
     * Gets ith "curve" element
     */
    @Override
    public com.microsoft.schemas.vml.CTCurve getCurveArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTCurve target = null;
            target = (com.microsoft.schemas.vml.CTCurve)get_store().find_element_user(PROPERTY_QNAME[27], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "curve" element
     */
    @Override
    public int sizeOfCurveArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[27]);
        }
    }

    /**
     * Sets array of all "curve" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCurveArray(com.microsoft.schemas.vml.CTCurve[] curveArray) {
        check_orphaned();
        arraySetterHelper(curveArray, PROPERTY_QNAME[27]);
    }

    /**
     * Sets ith "curve" element
     */
    @Override
    public void setCurveArray(int i, com.microsoft.schemas.vml.CTCurve curve) {
        generatedSetterHelperImpl(curve, PROPERTY_QNAME[27], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "curve" element
     */
    @Override
    public com.microsoft.schemas.vml.CTCurve insertNewCurve(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTCurve target = null;
            target = (com.microsoft.schemas.vml.CTCurve)get_store().insert_element_user(PROPERTY_QNAME[27], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "curve" element
     */
    @Override
    public com.microsoft.schemas.vml.CTCurve addNewCurve() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTCurve target = null;
            target = (com.microsoft.schemas.vml.CTCurve)get_store().add_element_user(PROPERTY_QNAME[27]);
            return target;
        }
    }

    /**
     * Removes the ith "curve" element
     */
    @Override
    public void removeCurve(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[27], i);
        }
    }

    /**
     * Gets a List of "image" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTImage> getImageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getImageArray,
                this::setImageArray,
                this::insertNewImage,
                this::removeImage,
                this::sizeOfImageArray
            );
        }
    }

    /**
     * Gets array of all "image" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTImage[] getImageArray() {
        return getXmlObjectArray(PROPERTY_QNAME[28], new com.microsoft.schemas.vml.CTImage[0]);
    }

    /**
     * Gets ith "image" element
     */
    @Override
    public com.microsoft.schemas.vml.CTImage getImageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTImage target = null;
            target = (com.microsoft.schemas.vml.CTImage)get_store().find_element_user(PROPERTY_QNAME[28], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "image" element
     */
    @Override
    public int sizeOfImageArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[28]);
        }
    }

    /**
     * Sets array of all "image" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setImageArray(com.microsoft.schemas.vml.CTImage[] imageArray) {
        check_orphaned();
        arraySetterHelper(imageArray, PROPERTY_QNAME[28]);
    }

    /**
     * Sets ith "image" element
     */
    @Override
    public void setImageArray(int i, com.microsoft.schemas.vml.CTImage image) {
        generatedSetterHelperImpl(image, PROPERTY_QNAME[28], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "image" element
     */
    @Override
    public com.microsoft.schemas.vml.CTImage insertNewImage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTImage target = null;
            target = (com.microsoft.schemas.vml.CTImage)get_store().insert_element_user(PROPERTY_QNAME[28], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "image" element
     */
    @Override
    public com.microsoft.schemas.vml.CTImage addNewImage() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTImage target = null;
            target = (com.microsoft.schemas.vml.CTImage)get_store().add_element_user(PROPERTY_QNAME[28]);
            return target;
        }
    }

    /**
     * Removes the ith "image" element
     */
    @Override
    public void removeImage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[28], i);
        }
    }

    /**
     * Gets a List of "line" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTLine> getLineList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLineArray,
                this::setLineArray,
                this::insertNewLine,
                this::removeLine,
                this::sizeOfLineArray
            );
        }
    }

    /**
     * Gets array of all "line" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTLine[] getLineArray() {
        return getXmlObjectArray(PROPERTY_QNAME[29], new com.microsoft.schemas.vml.CTLine[0]);
    }

    /**
     * Gets ith "line" element
     */
    @Override
    public com.microsoft.schemas.vml.CTLine getLineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTLine target = null;
            target = (com.microsoft.schemas.vml.CTLine)get_store().find_element_user(PROPERTY_QNAME[29], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "line" element
     */
    @Override
    public int sizeOfLineArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[29]);
        }
    }

    /**
     * Sets array of all "line" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLineArray(com.microsoft.schemas.vml.CTLine[] lineArray) {
        check_orphaned();
        arraySetterHelper(lineArray, PROPERTY_QNAME[29]);
    }

    /**
     * Sets ith "line" element
     */
    @Override
    public void setLineArray(int i, com.microsoft.schemas.vml.CTLine line) {
        generatedSetterHelperImpl(line, PROPERTY_QNAME[29], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "line" element
     */
    @Override
    public com.microsoft.schemas.vml.CTLine insertNewLine(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTLine target = null;
            target = (com.microsoft.schemas.vml.CTLine)get_store().insert_element_user(PROPERTY_QNAME[29], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "line" element
     */
    @Override
    public com.microsoft.schemas.vml.CTLine addNewLine() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTLine target = null;
            target = (com.microsoft.schemas.vml.CTLine)get_store().add_element_user(PROPERTY_QNAME[29]);
            return target;
        }
    }

    /**
     * Removes the ith "line" element
     */
    @Override
    public void removeLine(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[29], i);
        }
    }

    /**
     * Gets a List of "oval" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTOval> getOvalList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getOvalArray,
                this::setOvalArray,
                this::insertNewOval,
                this::removeOval,
                this::sizeOfOvalArray
            );
        }
    }

    /**
     * Gets array of all "oval" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTOval[] getOvalArray() {
        return getXmlObjectArray(PROPERTY_QNAME[30], new com.microsoft.schemas.vml.CTOval[0]);
    }

    /**
     * Gets ith "oval" element
     */
    @Override
    public com.microsoft.schemas.vml.CTOval getOvalArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTOval target = null;
            target = (com.microsoft.schemas.vml.CTOval)get_store().find_element_user(PROPERTY_QNAME[30], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "oval" element
     */
    @Override
    public int sizeOfOvalArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[30]);
        }
    }

    /**
     * Sets array of all "oval" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setOvalArray(com.microsoft.schemas.vml.CTOval[] ovalArray) {
        check_orphaned();
        arraySetterHelper(ovalArray, PROPERTY_QNAME[30]);
    }

    /**
     * Sets ith "oval" element
     */
    @Override
    public void setOvalArray(int i, com.microsoft.schemas.vml.CTOval oval) {
        generatedSetterHelperImpl(oval, PROPERTY_QNAME[30], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "oval" element
     */
    @Override
    public com.microsoft.schemas.vml.CTOval insertNewOval(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTOval target = null;
            target = (com.microsoft.schemas.vml.CTOval)get_store().insert_element_user(PROPERTY_QNAME[30], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "oval" element
     */
    @Override
    public com.microsoft.schemas.vml.CTOval addNewOval() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTOval target = null;
            target = (com.microsoft.schemas.vml.CTOval)get_store().add_element_user(PROPERTY_QNAME[30]);
            return target;
        }
    }

    /**
     * Removes the ith "oval" element
     */
    @Override
    public void removeOval(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[30], i);
        }
    }

    /**
     * Gets a List of "polyline" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTPolyLine> getPolylineList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPolylineArray,
                this::setPolylineArray,
                this::insertNewPolyline,
                this::removePolyline,
                this::sizeOfPolylineArray
            );
        }
    }

    /**
     * Gets array of all "polyline" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTPolyLine[] getPolylineArray() {
        return getXmlObjectArray(PROPERTY_QNAME[31], new com.microsoft.schemas.vml.CTPolyLine[0]);
    }

    /**
     * Gets ith "polyline" element
     */
    @Override
    public com.microsoft.schemas.vml.CTPolyLine getPolylineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTPolyLine target = null;
            target = (com.microsoft.schemas.vml.CTPolyLine)get_store().find_element_user(PROPERTY_QNAME[31], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "polyline" element
     */
    @Override
    public int sizeOfPolylineArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[31]);
        }
    }

    /**
     * Sets array of all "polyline" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPolylineArray(com.microsoft.schemas.vml.CTPolyLine[] polylineArray) {
        check_orphaned();
        arraySetterHelper(polylineArray, PROPERTY_QNAME[31]);
    }

    /**
     * Sets ith "polyline" element
     */
    @Override
    public void setPolylineArray(int i, com.microsoft.schemas.vml.CTPolyLine polyline) {
        generatedSetterHelperImpl(polyline, PROPERTY_QNAME[31], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "polyline" element
     */
    @Override
    public com.microsoft.schemas.vml.CTPolyLine insertNewPolyline(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTPolyLine target = null;
            target = (com.microsoft.schemas.vml.CTPolyLine)get_store().insert_element_user(PROPERTY_QNAME[31], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "polyline" element
     */
    @Override
    public com.microsoft.schemas.vml.CTPolyLine addNewPolyline() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTPolyLine target = null;
            target = (com.microsoft.schemas.vml.CTPolyLine)get_store().add_element_user(PROPERTY_QNAME[31]);
            return target;
        }
    }

    /**
     * Removes the ith "polyline" element
     */
    @Override
    public void removePolyline(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[31], i);
        }
    }

    /**
     * Gets a List of "rect" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTRect> getRectList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRectArray,
                this::setRectArray,
                this::insertNewRect,
                this::removeRect,
                this::sizeOfRectArray
            );
        }
    }

    /**
     * Gets array of all "rect" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTRect[] getRectArray() {
        return getXmlObjectArray(PROPERTY_QNAME[32], new com.microsoft.schemas.vml.CTRect[0]);
    }

    /**
     * Gets ith "rect" element
     */
    @Override
    public com.microsoft.schemas.vml.CTRect getRectArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTRect target = null;
            target = (com.microsoft.schemas.vml.CTRect)get_store().find_element_user(PROPERTY_QNAME[32], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "rect" element
     */
    @Override
    public int sizeOfRectArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[32]);
        }
    }

    /**
     * Sets array of all "rect" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRectArray(com.microsoft.schemas.vml.CTRect[] rectArray) {
        check_orphaned();
        arraySetterHelper(rectArray, PROPERTY_QNAME[32]);
    }

    /**
     * Sets ith "rect" element
     */
    @Override
    public void setRectArray(int i, com.microsoft.schemas.vml.CTRect rect) {
        generatedSetterHelperImpl(rect, PROPERTY_QNAME[32], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "rect" element
     */
    @Override
    public com.microsoft.schemas.vml.CTRect insertNewRect(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTRect target = null;
            target = (com.microsoft.schemas.vml.CTRect)get_store().insert_element_user(PROPERTY_QNAME[32], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "rect" element
     */
    @Override
    public com.microsoft.schemas.vml.CTRect addNewRect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTRect target = null;
            target = (com.microsoft.schemas.vml.CTRect)get_store().add_element_user(PROPERTY_QNAME[32]);
            return target;
        }
    }

    /**
     * Removes the ith "rect" element
     */
    @Override
    public void removeRect(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[32], i);
        }
    }

    /**
     * Gets a List of "roundrect" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTRoundRect> getRoundrectList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRoundrectArray,
                this::setRoundrectArray,
                this::insertNewRoundrect,
                this::removeRoundrect,
                this::sizeOfRoundrectArray
            );
        }
    }

    /**
     * Gets array of all "roundrect" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTRoundRect[] getRoundrectArray() {
        return getXmlObjectArray(PROPERTY_QNAME[33], new com.microsoft.schemas.vml.CTRoundRect[0]);
    }

    /**
     * Gets ith "roundrect" element
     */
    @Override
    public com.microsoft.schemas.vml.CTRoundRect getRoundrectArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTRoundRect target = null;
            target = (com.microsoft.schemas.vml.CTRoundRect)get_store().find_element_user(PROPERTY_QNAME[33], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "roundrect" element
     */
    @Override
    public int sizeOfRoundrectArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[33]);
        }
    }

    /**
     * Sets array of all "roundrect" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRoundrectArray(com.microsoft.schemas.vml.CTRoundRect[] roundrectArray) {
        check_orphaned();
        arraySetterHelper(roundrectArray, PROPERTY_QNAME[33]);
    }

    /**
     * Sets ith "roundrect" element
     */
    @Override
    public void setRoundrectArray(int i, com.microsoft.schemas.vml.CTRoundRect roundrect) {
        generatedSetterHelperImpl(roundrect, PROPERTY_QNAME[33], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "roundrect" element
     */
    @Override
    public com.microsoft.schemas.vml.CTRoundRect insertNewRoundrect(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTRoundRect target = null;
            target = (com.microsoft.schemas.vml.CTRoundRect)get_store().insert_element_user(PROPERTY_QNAME[33], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "roundrect" element
     */
    @Override
    public com.microsoft.schemas.vml.CTRoundRect addNewRoundrect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTRoundRect target = null;
            target = (com.microsoft.schemas.vml.CTRoundRect)get_store().add_element_user(PROPERTY_QNAME[33]);
            return target;
        }
    }

    /**
     * Removes the ith "roundrect" element
     */
    @Override
    public void removeRoundrect(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[33], i);
        }
    }

    /**
     * Gets a List of "diagram" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.office.CTDiagram> getDiagramList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDiagramArray,
                this::setDiagramArray,
                this::insertNewDiagram,
                this::removeDiagram,
                this::sizeOfDiagramArray
            );
        }
    }

    /**
     * Gets array of all "diagram" elements
     */
    @Override
    public com.microsoft.schemas.office.office.CTDiagram[] getDiagramArray() {
        return getXmlObjectArray(PROPERTY_QNAME[34], new com.microsoft.schemas.office.office.CTDiagram[0]);
    }

    /**
     * Gets ith "diagram" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTDiagram getDiagramArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTDiagram target = null;
            target = (com.microsoft.schemas.office.office.CTDiagram)get_store().find_element_user(PROPERTY_QNAME[34], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "diagram" element
     */
    @Override
    public int sizeOfDiagramArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[34]);
        }
    }

    /**
     * Sets array of all "diagram" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDiagramArray(com.microsoft.schemas.office.office.CTDiagram[] diagramArray) {
        check_orphaned();
        arraySetterHelper(diagramArray, PROPERTY_QNAME[34]);
    }

    /**
     * Sets ith "diagram" element
     */
    @Override
    public void setDiagramArray(int i, com.microsoft.schemas.office.office.CTDiagram diagram) {
        generatedSetterHelperImpl(diagram, PROPERTY_QNAME[34], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "diagram" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTDiagram insertNewDiagram(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTDiagram target = null;
            target = (com.microsoft.schemas.office.office.CTDiagram)get_store().insert_element_user(PROPERTY_QNAME[34], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "diagram" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTDiagram addNewDiagram() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTDiagram target = null;
            target = (com.microsoft.schemas.office.office.CTDiagram)get_store().add_element_user(PROPERTY_QNAME[34]);
            return target;
        }
    }

    /**
     * Removes the ith "diagram" element
     */
    @Override
    public void removeDiagram(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[34], i);
        }
    }

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[35]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[35]);
            return target;
        }
    }

    /**
     * True if has "id" attribute
     */
    @Override
    public boolean isSetId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[35]) != null;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[35]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[35]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.apache.xmlbeans.XmlString id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[35]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[35]);
            }
            target.set(id);
        }
    }

    /**
     * Unsets the "id" attribute
     */
    @Override
    public void unsetId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[35]);
        }
    }

    /**
     * Gets the "style" attribute
     */
    @Override
    public java.lang.String getStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[36]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "style" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[36]);
            return target;
        }
    }

    /**
     * True if has "style" attribute
     */
    @Override
    public boolean isSetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[36]) != null;
        }
    }

    /**
     * Sets the "style" attribute
     */
    @Override
    public void setStyle(java.lang.String style) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[36]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[36]);
            }
            target.setStringValue(style);
        }
    }

    /**
     * Sets (as xml) the "style" attribute
     */
    @Override
    public void xsetStyle(org.apache.xmlbeans.XmlString style) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[36]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[36]);
            }
            target.set(style);
        }
    }

    /**
     * Unsets the "style" attribute
     */
    @Override
    public void unsetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[36]);
        }
    }

    /**
     * Gets the "href" attribute
     */
    @Override
    public java.lang.String getHref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[37]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "href" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetHref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[37]);
            return target;
        }
    }

    /**
     * True if has "href" attribute
     */
    @Override
    public boolean isSetHref() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[37]) != null;
        }
    }

    /**
     * Sets the "href" attribute
     */
    @Override
    public void setHref(java.lang.String href) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[37]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[37]);
            }
            target.setStringValue(href);
        }
    }

    /**
     * Sets (as xml) the "href" attribute
     */
    @Override
    public void xsetHref(org.apache.xmlbeans.XmlString href) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[37]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[37]);
            }
            target.set(href);
        }
    }

    /**
     * Unsets the "href" attribute
     */
    @Override
    public void unsetHref() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[37]);
        }
    }

    /**
     * Gets the "target" attribute
     */
    @Override
    public java.lang.String getTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[38]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "target" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[38]);
            return target;
        }
    }

    /**
     * True if has "target" attribute
     */
    @Override
    public boolean isSetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[38]) != null;
        }
    }

    /**
     * Sets the "target" attribute
     */
    @Override
    public void setTarget(java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[38]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[38]);
            }
            target.setStringValue(targetValue);
        }
    }

    /**
     * Sets (as xml) the "target" attribute
     */
    @Override
    public void xsetTarget(org.apache.xmlbeans.XmlString targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[38]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[38]);
            }
            target.set(targetValue);
        }
    }

    /**
     * Unsets the "target" attribute
     */
    @Override
    public void unsetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[38]);
        }
    }

    /**
     * Gets the "class" attribute
     */
    @Override
    public java.lang.String getClass1() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[39]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "class" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetClass1() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[39]);
            return target;
        }
    }

    /**
     * True if has "class" attribute
     */
    @Override
    public boolean isSetClass1() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[39]) != null;
        }
    }

    /**
     * Sets the "class" attribute
     */
    @Override
    public void setClass1(java.lang.String class1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[39]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[39]);
            }
            target.setStringValue(class1);
        }
    }

    /**
     * Sets (as xml) the "class" attribute
     */
    @Override
    public void xsetClass1(org.apache.xmlbeans.XmlString class1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[39]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[39]);
            }
            target.set(class1);
        }
    }

    /**
     * Unsets the "class" attribute
     */
    @Override
    public void unsetClass1() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[39]);
        }
    }

    /**
     * Gets the "title" attribute
     */
    @Override
    public java.lang.String getTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[40]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "title" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[40]);
            return target;
        }
    }

    /**
     * True if has "title" attribute
     */
    @Override
    public boolean isSetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[40]) != null;
        }
    }

    /**
     * Sets the "title" attribute
     */
    @Override
    public void setTitle(java.lang.String title) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[40]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[40]);
            }
            target.setStringValue(title);
        }
    }

    /**
     * Sets (as xml) the "title" attribute
     */
    @Override
    public void xsetTitle(org.apache.xmlbeans.XmlString title) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[40]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[40]);
            }
            target.set(title);
        }
    }

    /**
     * Unsets the "title" attribute
     */
    @Override
    public void unsetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[40]);
        }
    }

    /**
     * Gets the "alt" attribute
     */
    @Override
    public java.lang.String getAlt() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[41]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "alt" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAlt() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[41]);
            return target;
        }
    }

    /**
     * True if has "alt" attribute
     */
    @Override
    public boolean isSetAlt() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[41]) != null;
        }
    }

    /**
     * Sets the "alt" attribute
     */
    @Override
    public void setAlt(java.lang.String alt) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[41]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[41]);
            }
            target.setStringValue(alt);
        }
    }

    /**
     * Sets (as xml) the "alt" attribute
     */
    @Override
    public void xsetAlt(org.apache.xmlbeans.XmlString alt) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[41]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[41]);
            }
            target.set(alt);
        }
    }

    /**
     * Unsets the "alt" attribute
     */
    @Override
    public void unsetAlt() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[41]);
        }
    }

    /**
     * Gets the "coordsize" attribute
     */
    @Override
    public java.lang.String getCoordsize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[42]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "coordsize" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetCoordsize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[42]);
            return target;
        }
    }

    /**
     * True if has "coordsize" attribute
     */
    @Override
    public boolean isSetCoordsize() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[42]) != null;
        }
    }

    /**
     * Sets the "coordsize" attribute
     */
    @Override
    public void setCoordsize(java.lang.String coordsize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[42]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[42]);
            }
            target.setStringValue(coordsize);
        }
    }

    /**
     * Sets (as xml) the "coordsize" attribute
     */
    @Override
    public void xsetCoordsize(org.apache.xmlbeans.XmlString coordsize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[42]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[42]);
            }
            target.set(coordsize);
        }
    }

    /**
     * Unsets the "coordsize" attribute
     */
    @Override
    public void unsetCoordsize() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[42]);
        }
    }

    /**
     * Gets the "coordorigin" attribute
     */
    @Override
    public java.lang.String getCoordorigin() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[43]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "coordorigin" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetCoordorigin() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[43]);
            return target;
        }
    }

    /**
     * True if has "coordorigin" attribute
     */
    @Override
    public boolean isSetCoordorigin() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[43]) != null;
        }
    }

    /**
     * Sets the "coordorigin" attribute
     */
    @Override
    public void setCoordorigin(java.lang.String coordorigin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[43]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[43]);
            }
            target.setStringValue(coordorigin);
        }
    }

    /**
     * Sets (as xml) the "coordorigin" attribute
     */
    @Override
    public void xsetCoordorigin(org.apache.xmlbeans.XmlString coordorigin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[43]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[43]);
            }
            target.set(coordorigin);
        }
    }

    /**
     * Unsets the "coordorigin" attribute
     */
    @Override
    public void unsetCoordorigin() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[43]);
        }
    }

    /**
     * Gets the "wrapcoords" attribute
     */
    @Override
    public java.lang.String getWrapcoords() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[44]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "wrapcoords" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetWrapcoords() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[44]);
            return target;
        }
    }

    /**
     * True if has "wrapcoords" attribute
     */
    @Override
    public boolean isSetWrapcoords() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[44]) != null;
        }
    }

    /**
     * Sets the "wrapcoords" attribute
     */
    @Override
    public void setWrapcoords(java.lang.String wrapcoords) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[44]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[44]);
            }
            target.setStringValue(wrapcoords);
        }
    }

    /**
     * Sets (as xml) the "wrapcoords" attribute
     */
    @Override
    public void xsetWrapcoords(org.apache.xmlbeans.XmlString wrapcoords) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[44]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[44]);
            }
            target.set(wrapcoords);
        }
    }

    /**
     * Unsets the "wrapcoords" attribute
     */
    @Override
    public void unsetWrapcoords() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[44]);
        }
    }

    /**
     * Gets the "print" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getPrint() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[45]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "print" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetPrint() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[45]);
            return target;
        }
    }

    /**
     * True if has "print" attribute
     */
    @Override
    public boolean isSetPrint() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[45]) != null;
        }
    }

    /**
     * Sets the "print" attribute
     */
    @Override
    public void setPrint(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum print) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[45]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[45]);
            }
            target.setEnumValue(print);
        }
    }

    /**
     * Sets (as xml) the "print" attribute
     */
    @Override
    public void xsetPrint(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse print) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[45]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[45]);
            }
            target.set(print);
        }
    }

    /**
     * Unsets the "print" attribute
     */
    @Override
    public void unsetPrint() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[45]);
        }
    }

    /**
     * Gets the "spid" attribute
     */
    @Override
    public java.lang.String getSpid() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[46]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "spid" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSpid() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[46]);
            return target;
        }
    }

    /**
     * True if has "spid" attribute
     */
    @Override
    public boolean isSetSpid() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[46]) != null;
        }
    }

    /**
     * Sets the "spid" attribute
     */
    @Override
    public void setSpid(java.lang.String spid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[46]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[46]);
            }
            target.setStringValue(spid);
        }
    }

    /**
     * Sets (as xml) the "spid" attribute
     */
    @Override
    public void xsetSpid(org.apache.xmlbeans.XmlString spid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[46]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[46]);
            }
            target.set(spid);
        }
    }

    /**
     * Unsets the "spid" attribute
     */
    @Override
    public void unsetSpid() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[46]);
        }
    }

    /**
     * Gets the "oned" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOned() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[47]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "oned" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOned() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[47]);
            return target;
        }
    }

    /**
     * True if has "oned" attribute
     */
    @Override
    public boolean isSetOned() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[47]) != null;
        }
    }

    /**
     * Sets the "oned" attribute
     */
    @Override
    public void setOned(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum oned) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[47]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[47]);
            }
            target.setEnumValue(oned);
        }
    }

    /**
     * Sets (as xml) the "oned" attribute
     */
    @Override
    public void xsetOned(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse oned) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[47]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[47]);
            }
            target.set(oned);
        }
    }

    /**
     * Unsets the "oned" attribute
     */
    @Override
    public void unsetOned() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[47]);
        }
    }

    /**
     * Gets the "regroupid" attribute
     */
    @Override
    public java.math.BigInteger getRegroupid() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[48]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "regroupid" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetRegroupid() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PROPERTY_QNAME[48]);
            return target;
        }
    }

    /**
     * True if has "regroupid" attribute
     */
    @Override
    public boolean isSetRegroupid() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[48]) != null;
        }
    }

    /**
     * Sets the "regroupid" attribute
     */
    @Override
    public void setRegroupid(java.math.BigInteger regroupid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[48]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[48]);
            }
            target.setBigIntegerValue(regroupid);
        }
    }

    /**
     * Sets (as xml) the "regroupid" attribute
     */
    @Override
    public void xsetRegroupid(org.apache.xmlbeans.XmlInteger regroupid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PROPERTY_QNAME[48]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PROPERTY_QNAME[48]);
            }
            target.set(regroupid);
        }
    }

    /**
     * Unsets the "regroupid" attribute
     */
    @Override
    public void unsetRegroupid() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[48]);
        }
    }

    /**
     * Gets the "doubleclicknotify" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getDoubleclicknotify() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[49]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "doubleclicknotify" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetDoubleclicknotify() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[49]);
            return target;
        }
    }

    /**
     * True if has "doubleclicknotify" attribute
     */
    @Override
    public boolean isSetDoubleclicknotify() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[49]) != null;
        }
    }

    /**
     * Sets the "doubleclicknotify" attribute
     */
    @Override
    public void setDoubleclicknotify(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum doubleclicknotify) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[49]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[49]);
            }
            target.setEnumValue(doubleclicknotify);
        }
    }

    /**
     * Sets (as xml) the "doubleclicknotify" attribute
     */
    @Override
    public void xsetDoubleclicknotify(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse doubleclicknotify) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[49]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[49]);
            }
            target.set(doubleclicknotify);
        }
    }

    /**
     * Unsets the "doubleclicknotify" attribute
     */
    @Override
    public void unsetDoubleclicknotify() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[49]);
        }
    }

    /**
     * Gets the "button" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getButton() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[50]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "button" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetButton() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[50]);
            return target;
        }
    }

    /**
     * True if has "button" attribute
     */
    @Override
    public boolean isSetButton() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[50]) != null;
        }
    }

    /**
     * Sets the "button" attribute
     */
    @Override
    public void setButton(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum button) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[50]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[50]);
            }
            target.setEnumValue(button);
        }
    }

    /**
     * Sets (as xml) the "button" attribute
     */
    @Override
    public void xsetButton(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse button) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[50]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[50]);
            }
            target.set(button);
        }
    }

    /**
     * Unsets the "button" attribute
     */
    @Override
    public void unsetButton() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[50]);
        }
    }

    /**
     * Gets the "userhidden" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getUserhidden() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[51]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "userhidden" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetUserhidden() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[51]);
            return target;
        }
    }

    /**
     * True if has "userhidden" attribute
     */
    @Override
    public boolean isSetUserhidden() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[51]) != null;
        }
    }

    /**
     * Sets the "userhidden" attribute
     */
    @Override
    public void setUserhidden(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum userhidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[51]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[51]);
            }
            target.setEnumValue(userhidden);
        }
    }

    /**
     * Sets (as xml) the "userhidden" attribute
     */
    @Override
    public void xsetUserhidden(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse userhidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[51]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[51]);
            }
            target.set(userhidden);
        }
    }

    /**
     * Unsets the "userhidden" attribute
     */
    @Override
    public void unsetUserhidden() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[51]);
        }
    }

    /**
     * Gets the "bullet" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getBullet() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[52]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "bullet" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetBullet() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[52]);
            return target;
        }
    }

    /**
     * True if has "bullet" attribute
     */
    @Override
    public boolean isSetBullet() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[52]) != null;
        }
    }

    /**
     * Sets the "bullet" attribute
     */
    @Override
    public void setBullet(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum bullet) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[52]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[52]);
            }
            target.setEnumValue(bullet);
        }
    }

    /**
     * Sets (as xml) the "bullet" attribute
     */
    @Override
    public void xsetBullet(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse bullet) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[52]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[52]);
            }
            target.set(bullet);
        }
    }

    /**
     * Unsets the "bullet" attribute
     */
    @Override
    public void unsetBullet() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[52]);
        }
    }

    /**
     * Gets the "hr" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getHr() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[53]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "hr" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetHr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[53]);
            return target;
        }
    }

    /**
     * True if has "hr" attribute
     */
    @Override
    public boolean isSetHr() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[53]) != null;
        }
    }

    /**
     * Sets the "hr" attribute
     */
    @Override
    public void setHr(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum hr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[53]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[53]);
            }
            target.setEnumValue(hr);
        }
    }

    /**
     * Sets (as xml) the "hr" attribute
     */
    @Override
    public void xsetHr(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse hr) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[53]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[53]);
            }
            target.set(hr);
        }
    }

    /**
     * Unsets the "hr" attribute
     */
    @Override
    public void unsetHr() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[53]);
        }
    }

    /**
     * Gets the "hrstd" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getHrstd() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[54]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "hrstd" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetHrstd() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[54]);
            return target;
        }
    }

    /**
     * True if has "hrstd" attribute
     */
    @Override
    public boolean isSetHrstd() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[54]) != null;
        }
    }

    /**
     * Sets the "hrstd" attribute
     */
    @Override
    public void setHrstd(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum hrstd) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[54]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[54]);
            }
            target.setEnumValue(hrstd);
        }
    }

    /**
     * Sets (as xml) the "hrstd" attribute
     */
    @Override
    public void xsetHrstd(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse hrstd) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[54]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[54]);
            }
            target.set(hrstd);
        }
    }

    /**
     * Unsets the "hrstd" attribute
     */
    @Override
    public void unsetHrstd() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[54]);
        }
    }

    /**
     * Gets the "hrnoshade" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getHrnoshade() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[55]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "hrnoshade" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetHrnoshade() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[55]);
            return target;
        }
    }

    /**
     * True if has "hrnoshade" attribute
     */
    @Override
    public boolean isSetHrnoshade() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[55]) != null;
        }
    }

    /**
     * Sets the "hrnoshade" attribute
     */
    @Override
    public void setHrnoshade(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum hrnoshade) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[55]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[55]);
            }
            target.setEnumValue(hrnoshade);
        }
    }

    /**
     * Sets (as xml) the "hrnoshade" attribute
     */
    @Override
    public void xsetHrnoshade(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse hrnoshade) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[55]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[55]);
            }
            target.set(hrnoshade);
        }
    }

    /**
     * Unsets the "hrnoshade" attribute
     */
    @Override
    public void unsetHrnoshade() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[55]);
        }
    }

    /**
     * Gets the "hrpct" attribute
     */
    @Override
    public float getHrpct() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[56]);
            return (target == null) ? 0.0f : target.getFloatValue();
        }
    }

    /**
     * Gets (as xml) the "hrpct" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlFloat xgetHrpct() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(PROPERTY_QNAME[56]);
            return target;
        }
    }

    /**
     * True if has "hrpct" attribute
     */
    @Override
    public boolean isSetHrpct() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[56]) != null;
        }
    }

    /**
     * Sets the "hrpct" attribute
     */
    @Override
    public void setHrpct(float hrpct) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[56]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[56]);
            }
            target.setFloatValue(hrpct);
        }
    }

    /**
     * Sets (as xml) the "hrpct" attribute
     */
    @Override
    public void xsetHrpct(org.apache.xmlbeans.XmlFloat hrpct) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(PROPERTY_QNAME[56]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(PROPERTY_QNAME[56]);
            }
            target.set(hrpct);
        }
    }

    /**
     * Unsets the "hrpct" attribute
     */
    @Override
    public void unsetHrpct() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[56]);
        }
    }

    /**
     * Gets the "hralign" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STHrAlign.Enum getHralign() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[57]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[57]);
            }
            return (target == null) ? null : (com.microsoft.schemas.office.office.STHrAlign.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "hralign" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STHrAlign xgetHralign() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STHrAlign target = null;
            target = (com.microsoft.schemas.office.office.STHrAlign)get_store().find_attribute_user(PROPERTY_QNAME[57]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STHrAlign)get_default_attribute_value(PROPERTY_QNAME[57]);
            }
            return target;
        }
    }

    /**
     * True if has "hralign" attribute
     */
    @Override
    public boolean isSetHralign() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[57]) != null;
        }
    }

    /**
     * Sets the "hralign" attribute
     */
    @Override
    public void setHralign(com.microsoft.schemas.office.office.STHrAlign.Enum hralign) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[57]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[57]);
            }
            target.setEnumValue(hralign);
        }
    }

    /**
     * Sets (as xml) the "hralign" attribute
     */
    @Override
    public void xsetHralign(com.microsoft.schemas.office.office.STHrAlign hralign) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STHrAlign target = null;
            target = (com.microsoft.schemas.office.office.STHrAlign)get_store().find_attribute_user(PROPERTY_QNAME[57]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STHrAlign)get_store().add_attribute_user(PROPERTY_QNAME[57]);
            }
            target.set(hralign);
        }
    }

    /**
     * Unsets the "hralign" attribute
     */
    @Override
    public void unsetHralign() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[57]);
        }
    }

    /**
     * Gets the "allowincell" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAllowincell() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[58]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "allowincell" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAllowincell() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[58]);
            return target;
        }
    }

    /**
     * True if has "allowincell" attribute
     */
    @Override
    public boolean isSetAllowincell() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[58]) != null;
        }
    }

    /**
     * Sets the "allowincell" attribute
     */
    @Override
    public void setAllowincell(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum allowincell) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[58]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[58]);
            }
            target.setEnumValue(allowincell);
        }
    }

    /**
     * Sets (as xml) the "allowincell" attribute
     */
    @Override
    public void xsetAllowincell(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse allowincell) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[58]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[58]);
            }
            target.set(allowincell);
        }
    }

    /**
     * Unsets the "allowincell" attribute
     */
    @Override
    public void unsetAllowincell() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[58]);
        }
    }

    /**
     * Gets the "allowoverlap" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAllowoverlap() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[59]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "allowoverlap" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAllowoverlap() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[59]);
            return target;
        }
    }

    /**
     * True if has "allowoverlap" attribute
     */
    @Override
    public boolean isSetAllowoverlap() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[59]) != null;
        }
    }

    /**
     * Sets the "allowoverlap" attribute
     */
    @Override
    public void setAllowoverlap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum allowoverlap) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[59]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[59]);
            }
            target.setEnumValue(allowoverlap);
        }
    }

    /**
     * Sets (as xml) the "allowoverlap" attribute
     */
    @Override
    public void xsetAllowoverlap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse allowoverlap) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[59]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[59]);
            }
            target.set(allowoverlap);
        }
    }

    /**
     * Unsets the "allowoverlap" attribute
     */
    @Override
    public void unsetAllowoverlap() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[59]);
        }
    }

    /**
     * Gets the "userdrawn" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getUserdrawn() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[60]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "userdrawn" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetUserdrawn() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[60]);
            return target;
        }
    }

    /**
     * True if has "userdrawn" attribute
     */
    @Override
    public boolean isSetUserdrawn() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[60]) != null;
        }
    }

    /**
     * Sets the "userdrawn" attribute
     */
    @Override
    public void setUserdrawn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum userdrawn) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[60]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[60]);
            }
            target.setEnumValue(userdrawn);
        }
    }

    /**
     * Sets (as xml) the "userdrawn" attribute
     */
    @Override
    public void xsetUserdrawn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse userdrawn) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[60]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[60]);
            }
            target.set(userdrawn);
        }
    }

    /**
     * Unsets the "userdrawn" attribute
     */
    @Override
    public void unsetUserdrawn() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[60]);
        }
    }

    /**
     * Gets the "bordertopcolor" attribute
     */
    @Override
    public java.lang.String getBordertopcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[61]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "bordertopcolor" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetBordertopcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[61]);
            return target;
        }
    }

    /**
     * True if has "bordertopcolor" attribute
     */
    @Override
    public boolean isSetBordertopcolor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[61]) != null;
        }
    }

    /**
     * Sets the "bordertopcolor" attribute
     */
    @Override
    public void setBordertopcolor(java.lang.String bordertopcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[61]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[61]);
            }
            target.setStringValue(bordertopcolor);
        }
    }

    /**
     * Sets (as xml) the "bordertopcolor" attribute
     */
    @Override
    public void xsetBordertopcolor(org.apache.xmlbeans.XmlString bordertopcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[61]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[61]);
            }
            target.set(bordertopcolor);
        }
    }

    /**
     * Unsets the "bordertopcolor" attribute
     */
    @Override
    public void unsetBordertopcolor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[61]);
        }
    }

    /**
     * Gets the "borderleftcolor" attribute
     */
    @Override
    public java.lang.String getBorderleftcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[62]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "borderleftcolor" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetBorderleftcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[62]);
            return target;
        }
    }

    /**
     * True if has "borderleftcolor" attribute
     */
    @Override
    public boolean isSetBorderleftcolor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[62]) != null;
        }
    }

    /**
     * Sets the "borderleftcolor" attribute
     */
    @Override
    public void setBorderleftcolor(java.lang.String borderleftcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[62]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[62]);
            }
            target.setStringValue(borderleftcolor);
        }
    }

    /**
     * Sets (as xml) the "borderleftcolor" attribute
     */
    @Override
    public void xsetBorderleftcolor(org.apache.xmlbeans.XmlString borderleftcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[62]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[62]);
            }
            target.set(borderleftcolor);
        }
    }

    /**
     * Unsets the "borderleftcolor" attribute
     */
    @Override
    public void unsetBorderleftcolor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[62]);
        }
    }

    /**
     * Gets the "borderbottomcolor" attribute
     */
    @Override
    public java.lang.String getBorderbottomcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[63]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "borderbottomcolor" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetBorderbottomcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[63]);
            return target;
        }
    }

    /**
     * True if has "borderbottomcolor" attribute
     */
    @Override
    public boolean isSetBorderbottomcolor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[63]) != null;
        }
    }

    /**
     * Sets the "borderbottomcolor" attribute
     */
    @Override
    public void setBorderbottomcolor(java.lang.String borderbottomcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[63]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[63]);
            }
            target.setStringValue(borderbottomcolor);
        }
    }

    /**
     * Sets (as xml) the "borderbottomcolor" attribute
     */
    @Override
    public void xsetBorderbottomcolor(org.apache.xmlbeans.XmlString borderbottomcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[63]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[63]);
            }
            target.set(borderbottomcolor);
        }
    }

    /**
     * Unsets the "borderbottomcolor" attribute
     */
    @Override
    public void unsetBorderbottomcolor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[63]);
        }
    }

    /**
     * Gets the "borderrightcolor" attribute
     */
    @Override
    public java.lang.String getBorderrightcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[64]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "borderrightcolor" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetBorderrightcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[64]);
            return target;
        }
    }

    /**
     * True if has "borderrightcolor" attribute
     */
    @Override
    public boolean isSetBorderrightcolor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[64]) != null;
        }
    }

    /**
     * Sets the "borderrightcolor" attribute
     */
    @Override
    public void setBorderrightcolor(java.lang.String borderrightcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[64]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[64]);
            }
            target.setStringValue(borderrightcolor);
        }
    }

    /**
     * Sets (as xml) the "borderrightcolor" attribute
     */
    @Override
    public void xsetBorderrightcolor(org.apache.xmlbeans.XmlString borderrightcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[64]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[64]);
            }
            target.set(borderrightcolor);
        }
    }

    /**
     * Unsets the "borderrightcolor" attribute
     */
    @Override
    public void unsetBorderrightcolor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[64]);
        }
    }

    /**
     * Gets the "dgmlayout" attribute
     */
    @Override
    public java.math.BigInteger getDgmlayout() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[65]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "dgmlayout" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STDiagramLayout xgetDgmlayout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STDiagramLayout target = null;
            target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().find_attribute_user(PROPERTY_QNAME[65]);
            return target;
        }
    }

    /**
     * True if has "dgmlayout" attribute
     */
    @Override
    public boolean isSetDgmlayout() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[65]) != null;
        }
    }

    /**
     * Sets the "dgmlayout" attribute
     */
    @Override
    public void setDgmlayout(java.math.BigInteger dgmlayout) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[65]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[65]);
            }
            target.setBigIntegerValue(dgmlayout);
        }
    }

    /**
     * Sets (as xml) the "dgmlayout" attribute
     */
    @Override
    public void xsetDgmlayout(com.microsoft.schemas.office.office.STDiagramLayout dgmlayout) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STDiagramLayout target = null;
            target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().find_attribute_user(PROPERTY_QNAME[65]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().add_attribute_user(PROPERTY_QNAME[65]);
            }
            target.set(dgmlayout);
        }
    }

    /**
     * Unsets the "dgmlayout" attribute
     */
    @Override
    public void unsetDgmlayout() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[65]);
        }
    }

    /**
     * Gets the "dgmnodekind" attribute
     */
    @Override
    public java.math.BigInteger getDgmnodekind() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[66]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "dgmnodekind" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetDgmnodekind() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PROPERTY_QNAME[66]);
            return target;
        }
    }

    /**
     * True if has "dgmnodekind" attribute
     */
    @Override
    public boolean isSetDgmnodekind() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[66]) != null;
        }
    }

    /**
     * Sets the "dgmnodekind" attribute
     */
    @Override
    public void setDgmnodekind(java.math.BigInteger dgmnodekind) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[66]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[66]);
            }
            target.setBigIntegerValue(dgmnodekind);
        }
    }

    /**
     * Sets (as xml) the "dgmnodekind" attribute
     */
    @Override
    public void xsetDgmnodekind(org.apache.xmlbeans.XmlInteger dgmnodekind) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PROPERTY_QNAME[66]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PROPERTY_QNAME[66]);
            }
            target.set(dgmnodekind);
        }
    }

    /**
     * Unsets the "dgmnodekind" attribute
     */
    @Override
    public void unsetDgmnodekind() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[66]);
        }
    }

    /**
     * Gets the "dgmlayoutmru" attribute
     */
    @Override
    public java.math.BigInteger getDgmlayoutmru() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[67]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "dgmlayoutmru" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STDiagramLayout xgetDgmlayoutmru() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STDiagramLayout target = null;
            target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().find_attribute_user(PROPERTY_QNAME[67]);
            return target;
        }
    }

    /**
     * True if has "dgmlayoutmru" attribute
     */
    @Override
    public boolean isSetDgmlayoutmru() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[67]) != null;
        }
    }

    /**
     * Sets the "dgmlayoutmru" attribute
     */
    @Override
    public void setDgmlayoutmru(java.math.BigInteger dgmlayoutmru) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[67]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[67]);
            }
            target.setBigIntegerValue(dgmlayoutmru);
        }
    }

    /**
     * Sets (as xml) the "dgmlayoutmru" attribute
     */
    @Override
    public void xsetDgmlayoutmru(com.microsoft.schemas.office.office.STDiagramLayout dgmlayoutmru) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STDiagramLayout target = null;
            target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().find_attribute_user(PROPERTY_QNAME[67]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STDiagramLayout)get_store().add_attribute_user(PROPERTY_QNAME[67]);
            }
            target.set(dgmlayoutmru);
        }
    }

    /**
     * Unsets the "dgmlayoutmru" attribute
     */
    @Override
    public void unsetDgmlayoutmru() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[67]);
        }
    }

    /**
     * Gets the "insetmode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STInsetMode.Enum getInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[68]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[68]);
            }
            return (target == null) ? null : (com.microsoft.schemas.office.office.STInsetMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "insetmode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STInsetMode xgetInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STInsetMode target = null;
            target = (com.microsoft.schemas.office.office.STInsetMode)get_store().find_attribute_user(PROPERTY_QNAME[68]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STInsetMode)get_default_attribute_value(PROPERTY_QNAME[68]);
            }
            return target;
        }
    }

    /**
     * True if has "insetmode" attribute
     */
    @Override
    public boolean isSetInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[68]) != null;
        }
    }

    /**
     * Sets the "insetmode" attribute
     */
    @Override
    public void setInsetmode(com.microsoft.schemas.office.office.STInsetMode.Enum insetmode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[68]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[68]);
            }
            target.setEnumValue(insetmode);
        }
    }

    /**
     * Sets (as xml) the "insetmode" attribute
     */
    @Override
    public void xsetInsetmode(com.microsoft.schemas.office.office.STInsetMode insetmode) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STInsetMode target = null;
            target = (com.microsoft.schemas.office.office.STInsetMode)get_store().find_attribute_user(PROPERTY_QNAME[68]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STInsetMode)get_store().add_attribute_user(PROPERTY_QNAME[68]);
            }
            target.set(insetmode);
        }
    }

    /**
     * Unsets the "insetmode" attribute
     */
    @Override
    public void unsetInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[68]);
        }
    }

    /**
     * Gets the "filled" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getFilled() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[69]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "filled" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetFilled() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[69]);
            return target;
        }
    }

    /**
     * True if has "filled" attribute
     */
    @Override
    public boolean isSetFilled() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[69]) != null;
        }
    }

    /**
     * Sets the "filled" attribute
     */
    @Override
    public void setFilled(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum filled) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[69]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[69]);
            }
            target.setEnumValue(filled);
        }
    }

    /**
     * Sets (as xml) the "filled" attribute
     */
    @Override
    public void xsetFilled(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse filled) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[69]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[69]);
            }
            target.set(filled);
        }
    }

    /**
     * Unsets the "filled" attribute
     */
    @Override
    public void unsetFilled() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[69]);
        }
    }

    /**
     * Gets the "fillcolor" attribute
     */
    @Override
    public java.lang.String getFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[70]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "fillcolor" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[70]);
            return target;
        }
    }

    /**
     * True if has "fillcolor" attribute
     */
    @Override
    public boolean isSetFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[70]) != null;
        }
    }

    /**
     * Sets the "fillcolor" attribute
     */
    @Override
    public void setFillcolor(java.lang.String fillcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[70]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[70]);
            }
            target.setStringValue(fillcolor);
        }
    }

    /**
     * Sets (as xml) the "fillcolor" attribute
     */
    @Override
    public void xsetFillcolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType fillcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[70]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().add_attribute_user(PROPERTY_QNAME[70]);
            }
            target.set(fillcolor);
        }
    }

    /**
     * Unsets the "fillcolor" attribute
     */
    @Override
    public void unsetFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[70]);
        }
    }

    /**
     * Gets the "editas" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STEditAs.Enum getEditas() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[71]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STEditAs.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "editas" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STEditAs xgetEditas() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STEditAs target = null;
            target = (com.microsoft.schemas.vml.STEditAs)get_store().find_attribute_user(PROPERTY_QNAME[71]);
            return target;
        }
    }

    /**
     * True if has "editas" attribute
     */
    @Override
    public boolean isSetEditas() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[71]) != null;
        }
    }

    /**
     * Sets the "editas" attribute
     */
    @Override
    public void setEditas(com.microsoft.schemas.vml.STEditAs.Enum editas) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[71]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[71]);
            }
            target.setEnumValue(editas);
        }
    }

    /**
     * Sets (as xml) the "editas" attribute
     */
    @Override
    public void xsetEditas(com.microsoft.schemas.vml.STEditAs editas) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STEditAs target = null;
            target = (com.microsoft.schemas.vml.STEditAs)get_store().find_attribute_user(PROPERTY_QNAME[71]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STEditAs)get_store().add_attribute_user(PROPERTY_QNAME[71]);
            }
            target.set(editas);
        }
    }

    /**
     * Unsets the "editas" attribute
     */
    @Override
    public void unsetEditas() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[71]);
        }
    }

    /**
     * Gets the "tableproperties" attribute
     */
    @Override
    public java.lang.String getTableproperties() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[72]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "tableproperties" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTableproperties() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[72]);
            return target;
        }
    }

    /**
     * True if has "tableproperties" attribute
     */
    @Override
    public boolean isSetTableproperties() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[72]) != null;
        }
    }

    /**
     * Sets the "tableproperties" attribute
     */
    @Override
    public void setTableproperties(java.lang.String tableproperties) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[72]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[72]);
            }
            target.setStringValue(tableproperties);
        }
    }

    /**
     * Sets (as xml) the "tableproperties" attribute
     */
    @Override
    public void xsetTableproperties(org.apache.xmlbeans.XmlString tableproperties) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[72]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[72]);
            }
            target.set(tableproperties);
        }
    }

    /**
     * Unsets the "tableproperties" attribute
     */
    @Override
    public void unsetTableproperties() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[72]);
        }
    }

    /**
     * Gets the "tablelimits" attribute
     */
    @Override
    public java.lang.String getTablelimits() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[73]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "tablelimits" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTablelimits() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[73]);
            return target;
        }
    }

    /**
     * True if has "tablelimits" attribute
     */
    @Override
    public boolean isSetTablelimits() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[73]) != null;
        }
    }

    /**
     * Sets the "tablelimits" attribute
     */
    @Override
    public void setTablelimits(java.lang.String tablelimits) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[73]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[73]);
            }
            target.setStringValue(tablelimits);
        }
    }

    /**
     * Sets (as xml) the "tablelimits" attribute
     */
    @Override
    public void xsetTablelimits(org.apache.xmlbeans.XmlString tablelimits) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[73]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[73]);
            }
            target.set(tablelimits);
        }
    }

    /**
     * Unsets the "tablelimits" attribute
     */
    @Override
    public void unsetTablelimits() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[73]);
        }
    }
}
