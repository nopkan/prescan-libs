/*
 * XML Type:  CT_Rect
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTRect
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Rect(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTRect extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.CTRect> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctrectf6e2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "path" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTPath> getPathList();

    /**
     * Gets array of all "path" elements
     */
    com.microsoft.schemas.vml.CTPath[] getPathArray();

    /**
     * Gets ith "path" element
     */
    com.microsoft.schemas.vml.CTPath getPathArray(int i);

    /**
     * Returns number of "path" element
     */
    int sizeOfPathArray();

    /**
     * Sets array of all "path" element
     */
    void setPathArray(com.microsoft.schemas.vml.CTPath[] pathArray);

    /**
     * Sets ith "path" element
     */
    void setPathArray(int i, com.microsoft.schemas.vml.CTPath path);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "path" element
     */
    com.microsoft.schemas.vml.CTPath insertNewPath(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "path" element
     */
    com.microsoft.schemas.vml.CTPath addNewPath();

    /**
     * Removes the ith "path" element
     */
    void removePath(int i);

    /**
     * Gets a List of "formulas" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTFormulas> getFormulasList();

    /**
     * Gets array of all "formulas" elements
     */
    com.microsoft.schemas.vml.CTFormulas[] getFormulasArray();

    /**
     * Gets ith "formulas" element
     */
    com.microsoft.schemas.vml.CTFormulas getFormulasArray(int i);

    /**
     * Returns number of "formulas" element
     */
    int sizeOfFormulasArray();

    /**
     * Sets array of all "formulas" element
     */
    void setFormulasArray(com.microsoft.schemas.vml.CTFormulas[] formulasArray);

    /**
     * Sets ith "formulas" element
     */
    void setFormulasArray(int i, com.microsoft.schemas.vml.CTFormulas formulas);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "formulas" element
     */
    com.microsoft.schemas.vml.CTFormulas insertNewFormulas(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "formulas" element
     */
    com.microsoft.schemas.vml.CTFormulas addNewFormulas();

    /**
     * Removes the ith "formulas" element
     */
    void removeFormulas(int i);

    /**
     * Gets a List of "handles" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTHandles> getHandlesList();

    /**
     * Gets array of all "handles" elements
     */
    com.microsoft.schemas.vml.CTHandles[] getHandlesArray();

    /**
     * Gets ith "handles" element
     */
    com.microsoft.schemas.vml.CTHandles getHandlesArray(int i);

    /**
     * Returns number of "handles" element
     */
    int sizeOfHandlesArray();

    /**
     * Sets array of all "handles" element
     */
    void setHandlesArray(com.microsoft.schemas.vml.CTHandles[] handlesArray);

    /**
     * Sets ith "handles" element
     */
    void setHandlesArray(int i, com.microsoft.schemas.vml.CTHandles handles);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "handles" element
     */
    com.microsoft.schemas.vml.CTHandles insertNewHandles(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "handles" element
     */
    com.microsoft.schemas.vml.CTHandles addNewHandles();

    /**
     * Removes the ith "handles" element
     */
    void removeHandles(int i);

    /**
     * Gets a List of "fill" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTFill> getFillList();

    /**
     * Gets array of all "fill" elements
     */
    com.microsoft.schemas.vml.CTFill[] getFillArray();

    /**
     * Gets ith "fill" element
     */
    com.microsoft.schemas.vml.CTFill getFillArray(int i);

    /**
     * Returns number of "fill" element
     */
    int sizeOfFillArray();

    /**
     * Sets array of all "fill" element
     */
    void setFillArray(com.microsoft.schemas.vml.CTFill[] fillArray);

    /**
     * Sets ith "fill" element
     */
    void setFillArray(int i, com.microsoft.schemas.vml.CTFill fill);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fill" element
     */
    com.microsoft.schemas.vml.CTFill insertNewFill(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "fill" element
     */
    com.microsoft.schemas.vml.CTFill addNewFill();

    /**
     * Removes the ith "fill" element
     */
    void removeFill(int i);

    /**
     * Gets a List of "stroke" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTStroke> getStrokeList();

    /**
     * Gets array of all "stroke" elements
     */
    com.microsoft.schemas.vml.CTStroke[] getStrokeArray();

    /**
     * Gets ith "stroke" element
     */
    com.microsoft.schemas.vml.CTStroke getStrokeArray(int i);

    /**
     * Returns number of "stroke" element
     */
    int sizeOfStrokeArray();

    /**
     * Sets array of all "stroke" element
     */
    void setStrokeArray(com.microsoft.schemas.vml.CTStroke[] strokeArray);

    /**
     * Sets ith "stroke" element
     */
    void setStrokeArray(int i, com.microsoft.schemas.vml.CTStroke stroke);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "stroke" element
     */
    com.microsoft.schemas.vml.CTStroke insertNewStroke(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "stroke" element
     */
    com.microsoft.schemas.vml.CTStroke addNewStroke();

    /**
     * Removes the ith "stroke" element
     */
    void removeStroke(int i);

    /**
     * Gets a List of "shadow" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTShadow> getShadowList();

    /**
     * Gets array of all "shadow" elements
     */
    com.microsoft.schemas.vml.CTShadow[] getShadowArray();

    /**
     * Gets ith "shadow" element
     */
    com.microsoft.schemas.vml.CTShadow getShadowArray(int i);

    /**
     * Returns number of "shadow" element
     */
    int sizeOfShadowArray();

    /**
     * Sets array of all "shadow" element
     */
    void setShadowArray(com.microsoft.schemas.vml.CTShadow[] shadowArray);

    /**
     * Sets ith "shadow" element
     */
    void setShadowArray(int i, com.microsoft.schemas.vml.CTShadow shadow);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "shadow" element
     */
    com.microsoft.schemas.vml.CTShadow insertNewShadow(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "shadow" element
     */
    com.microsoft.schemas.vml.CTShadow addNewShadow();

    /**
     * Removes the ith "shadow" element
     */
    void removeShadow(int i);

    /**
     * Gets a List of "textbox" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTTextbox> getTextboxList();

    /**
     * Gets array of all "textbox" elements
     */
    com.microsoft.schemas.vml.CTTextbox[] getTextboxArray();

    /**
     * Gets ith "textbox" element
     */
    com.microsoft.schemas.vml.CTTextbox getTextboxArray(int i);

    /**
     * Returns number of "textbox" element
     */
    int sizeOfTextboxArray();

    /**
     * Sets array of all "textbox" element
     */
    void setTextboxArray(com.microsoft.schemas.vml.CTTextbox[] textboxArray);

    /**
     * Sets ith "textbox" element
     */
    void setTextboxArray(int i, com.microsoft.schemas.vml.CTTextbox textbox);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "textbox" element
     */
    com.microsoft.schemas.vml.CTTextbox insertNewTextbox(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "textbox" element
     */
    com.microsoft.schemas.vml.CTTextbox addNewTextbox();

    /**
     * Removes the ith "textbox" element
     */
    void removeTextbox(int i);

    /**
     * Gets a List of "textpath" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTTextPath> getTextpathList();

    /**
     * Gets array of all "textpath" elements
     */
    com.microsoft.schemas.vml.CTTextPath[] getTextpathArray();

    /**
     * Gets ith "textpath" element
     */
    com.microsoft.schemas.vml.CTTextPath getTextpathArray(int i);

    /**
     * Returns number of "textpath" element
     */
    int sizeOfTextpathArray();

    /**
     * Sets array of all "textpath" element
     */
    void setTextpathArray(com.microsoft.schemas.vml.CTTextPath[] textpathArray);

    /**
     * Sets ith "textpath" element
     */
    void setTextpathArray(int i, com.microsoft.schemas.vml.CTTextPath textpath);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "textpath" element
     */
    com.microsoft.schemas.vml.CTTextPath insertNewTextpath(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "textpath" element
     */
    com.microsoft.schemas.vml.CTTextPath addNewTextpath();

    /**
     * Removes the ith "textpath" element
     */
    void removeTextpath(int i);

    /**
     * Gets a List of "imagedata" elements
     */
    java.util.List<com.microsoft.schemas.vml.CTImageData> getImagedataList();

    /**
     * Gets array of all "imagedata" elements
     */
    com.microsoft.schemas.vml.CTImageData[] getImagedataArray();

    /**
     * Gets ith "imagedata" element
     */
    com.microsoft.schemas.vml.CTImageData getImagedataArray(int i);

    /**
     * Returns number of "imagedata" element
     */
    int sizeOfImagedataArray();

    /**
     * Sets array of all "imagedata" element
     */
    void setImagedataArray(com.microsoft.schemas.vml.CTImageData[] imagedataArray);

    /**
     * Sets ith "imagedata" element
     */
    void setImagedataArray(int i, com.microsoft.schemas.vml.CTImageData imagedata);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "imagedata" element
     */
    com.microsoft.schemas.vml.CTImageData insertNewImagedata(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "imagedata" element
     */
    com.microsoft.schemas.vml.CTImageData addNewImagedata();

    /**
     * Removes the ith "imagedata" element
     */
    void removeImagedata(int i);

    /**
     * Gets a List of "skew" elements
     */
    java.util.List<com.microsoft.schemas.office.office.CTSkew> getSkewList();

    /**
     * Gets array of all "skew" elements
     */
    com.microsoft.schemas.office.office.CTSkew[] getSkewArray();

    /**
     * Gets ith "skew" element
     */
    com.microsoft.schemas.office.office.CTSkew getSkewArray(int i);

    /**
     * Returns number of "skew" element
     */
    int sizeOfSkewArray();

    /**
     * Sets array of all "skew" element
     */
    void setSkewArray(com.microsoft.schemas.office.office.CTSkew[] skewArray);

    /**
     * Sets ith "skew" element
     */
    void setSkewArray(int i, com.microsoft.schemas.office.office.CTSkew skew);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "skew" element
     */
    com.microsoft.schemas.office.office.CTSkew insertNewSkew(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "skew" element
     */
    com.microsoft.schemas.office.office.CTSkew addNewSkew();

    /**
     * Removes the ith "skew" element
     */
    void removeSkew(int i);

    /**
     * Gets a List of "extrusion" elements
     */
    java.util.List<com.microsoft.schemas.office.office.CTExtrusion> getExtrusionList();

    /**
     * Gets array of all "extrusion" elements
     */
    com.microsoft.schemas.office.office.CTExtrusion[] getExtrusionArray();

    /**
     * Gets ith "extrusion" element
     */
    com.microsoft.schemas.office.office.CTExtrusion getExtrusionArray(int i);

    /**
     * Returns number of "extrusion" element
     */
    int sizeOfExtrusionArray();

    /**
     * Sets array of all "extrusion" element
     */
    void setExtrusionArray(com.microsoft.schemas.office.office.CTExtrusion[] extrusionArray);

    /**
     * Sets ith "extrusion" element
     */
    void setExtrusionArray(int i, com.microsoft.schemas.office.office.CTExtrusion extrusion);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "extrusion" element
     */
    com.microsoft.schemas.office.office.CTExtrusion insertNewExtrusion(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "extrusion" element
     */
    com.microsoft.schemas.office.office.CTExtrusion addNewExtrusion();

    /**
     * Removes the ith "extrusion" element
     */
    void removeExtrusion(int i);

    /**
     * Gets a List of "callout" elements
     */
    java.util.List<com.microsoft.schemas.office.office.CTCallout> getCalloutList();

    /**
     * Gets array of all "callout" elements
     */
    com.microsoft.schemas.office.office.CTCallout[] getCalloutArray();

    /**
     * Gets ith "callout" element
     */
    com.microsoft.schemas.office.office.CTCallout getCalloutArray(int i);

    /**
     * Returns number of "callout" element
     */
    int sizeOfCalloutArray();

    /**
     * Sets array of all "callout" element
     */
    void setCalloutArray(com.microsoft.schemas.office.office.CTCallout[] calloutArray);

    /**
     * Sets ith "callout" element
     */
    void setCalloutArray(int i, com.microsoft.schemas.office.office.CTCallout callout);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "callout" element
     */
    com.microsoft.schemas.office.office.CTCallout insertNewCallout(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "callout" element
     */
    com.microsoft.schemas.office.office.CTCallout addNewCallout();

    /**
     * Removes the ith "callout" element
     */
    void removeCallout(int i);

    /**
     * Gets a List of "lock" elements
     */
    java.util.List<com.microsoft.schemas.office.office.CTLock> getLockList();

    /**
     * Gets array of all "lock" elements
     */
    com.microsoft.schemas.office.office.CTLock[] getLockArray();

    /**
     * Gets ith "lock" element
     */
    com.microsoft.schemas.office.office.CTLock getLockArray(int i);

    /**
     * Returns number of "lock" element
     */
    int sizeOfLockArray();

    /**
     * Sets array of all "lock" element
     */
    void setLockArray(com.microsoft.schemas.office.office.CTLock[] lockArray);

    /**
     * Sets ith "lock" element
     */
    void setLockArray(int i, com.microsoft.schemas.office.office.CTLock lock);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lock" element
     */
    com.microsoft.schemas.office.office.CTLock insertNewLock(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "lock" element
     */
    com.microsoft.schemas.office.office.CTLock addNewLock();

    /**
     * Removes the ith "lock" element
     */
    void removeLock(int i);

    /**
     * Gets a List of "clippath" elements
     */
    java.util.List<com.microsoft.schemas.office.office.CTClipPath> getClippathList();

    /**
     * Gets array of all "clippath" elements
     */
    com.microsoft.schemas.office.office.CTClipPath[] getClippathArray();

    /**
     * Gets ith "clippath" element
     */
    com.microsoft.schemas.office.office.CTClipPath getClippathArray(int i);

    /**
     * Returns number of "clippath" element
     */
    int sizeOfClippathArray();

    /**
     * Sets array of all "clippath" element
     */
    void setClippathArray(com.microsoft.schemas.office.office.CTClipPath[] clippathArray);

    /**
     * Sets ith "clippath" element
     */
    void setClippathArray(int i, com.microsoft.schemas.office.office.CTClipPath clippath);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "clippath" element
     */
    com.microsoft.schemas.office.office.CTClipPath insertNewClippath(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "clippath" element
     */
    com.microsoft.schemas.office.office.CTClipPath addNewClippath();

    /**
     * Removes the ith "clippath" element
     */
    void removeClippath(int i);

    /**
     * Gets a List of "signatureline" elements
     */
    java.util.List<com.microsoft.schemas.office.office.CTSignatureLine> getSignaturelineList();

    /**
     * Gets array of all "signatureline" elements
     */
    com.microsoft.schemas.office.office.CTSignatureLine[] getSignaturelineArray();

    /**
     * Gets ith "signatureline" element
     */
    com.microsoft.schemas.office.office.CTSignatureLine getSignaturelineArray(int i);

    /**
     * Returns number of "signatureline" element
     */
    int sizeOfSignaturelineArray();

    /**
     * Sets array of all "signatureline" element
     */
    void setSignaturelineArray(com.microsoft.schemas.office.office.CTSignatureLine[] signaturelineArray);

    /**
     * Sets ith "signatureline" element
     */
    void setSignaturelineArray(int i, com.microsoft.schemas.office.office.CTSignatureLine signatureline);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "signatureline" element
     */
    com.microsoft.schemas.office.office.CTSignatureLine insertNewSignatureline(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "signatureline" element
     */
    com.microsoft.schemas.office.office.CTSignatureLine addNewSignatureline();

    /**
     * Removes the ith "signatureline" element
     */
    void removeSignatureline(int i);

    /**
     * Gets a List of "wrap" elements
     */
    java.util.List<com.microsoft.schemas.office.word.CTWrap> getWrapList();

    /**
     * Gets array of all "wrap" elements
     */
    com.microsoft.schemas.office.word.CTWrap[] getWrapArray();

    /**
     * Gets ith "wrap" element
     */
    com.microsoft.schemas.office.word.CTWrap getWrapArray(int i);

    /**
     * Returns number of "wrap" element
     */
    int sizeOfWrapArray();

    /**
     * Sets array of all "wrap" element
     */
    void setWrapArray(com.microsoft.schemas.office.word.CTWrap[] wrapArray);

    /**
     * Sets ith "wrap" element
     */
    void setWrapArray(int i, com.microsoft.schemas.office.word.CTWrap wrap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "wrap" element
     */
    com.microsoft.schemas.office.word.CTWrap insertNewWrap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "wrap" element
     */
    com.microsoft.schemas.office.word.CTWrap addNewWrap();

    /**
     * Removes the ith "wrap" element
     */
    void removeWrap(int i);

    /**
     * Gets a List of "anchorlock" elements
     */
    java.util.List<com.microsoft.schemas.office.word.CTAnchorLock> getAnchorlockList();

    /**
     * Gets array of all "anchorlock" elements
     */
    com.microsoft.schemas.office.word.CTAnchorLock[] getAnchorlockArray();

    /**
     * Gets ith "anchorlock" element
     */
    com.microsoft.schemas.office.word.CTAnchorLock getAnchorlockArray(int i);

    /**
     * Returns number of "anchorlock" element
     */
    int sizeOfAnchorlockArray();

    /**
     * Sets array of all "anchorlock" element
     */
    void setAnchorlockArray(com.microsoft.schemas.office.word.CTAnchorLock[] anchorlockArray);

    /**
     * Sets ith "anchorlock" element
     */
    void setAnchorlockArray(int i, com.microsoft.schemas.office.word.CTAnchorLock anchorlock);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "anchorlock" element
     */
    com.microsoft.schemas.office.word.CTAnchorLock insertNewAnchorlock(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "anchorlock" element
     */
    com.microsoft.schemas.office.word.CTAnchorLock addNewAnchorlock();

    /**
     * Removes the ith "anchorlock" element
     */
    void removeAnchorlock(int i);

    /**
     * Gets a List of "bordertop" elements
     */
    java.util.List<com.microsoft.schemas.office.word.CTBorder> getBordertopList();

    /**
     * Gets array of all "bordertop" elements
     */
    com.microsoft.schemas.office.word.CTBorder[] getBordertopArray();

    /**
     * Gets ith "bordertop" element
     */
    com.microsoft.schemas.office.word.CTBorder getBordertopArray(int i);

    /**
     * Returns number of "bordertop" element
     */
    int sizeOfBordertopArray();

    /**
     * Sets array of all "bordertop" element
     */
    void setBordertopArray(com.microsoft.schemas.office.word.CTBorder[] bordertopArray);

    /**
     * Sets ith "bordertop" element
     */
    void setBordertopArray(int i, com.microsoft.schemas.office.word.CTBorder bordertop);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "bordertop" element
     */
    com.microsoft.schemas.office.word.CTBorder insertNewBordertop(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "bordertop" element
     */
    com.microsoft.schemas.office.word.CTBorder addNewBordertop();

    /**
     * Removes the ith "bordertop" element
     */
    void removeBordertop(int i);

    /**
     * Gets a List of "borderbottom" elements
     */
    java.util.List<com.microsoft.schemas.office.word.CTBorder> getBorderbottomList();

    /**
     * Gets array of all "borderbottom" elements
     */
    com.microsoft.schemas.office.word.CTBorder[] getBorderbottomArray();

    /**
     * Gets ith "borderbottom" element
     */
    com.microsoft.schemas.office.word.CTBorder getBorderbottomArray(int i);

    /**
     * Returns number of "borderbottom" element
     */
    int sizeOfBorderbottomArray();

    /**
     * Sets array of all "borderbottom" element
     */
    void setBorderbottomArray(com.microsoft.schemas.office.word.CTBorder[] borderbottomArray);

    /**
     * Sets ith "borderbottom" element
     */
    void setBorderbottomArray(int i, com.microsoft.schemas.office.word.CTBorder borderbottom);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "borderbottom" element
     */
    com.microsoft.schemas.office.word.CTBorder insertNewBorderbottom(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "borderbottom" element
     */
    com.microsoft.schemas.office.word.CTBorder addNewBorderbottom();

    /**
     * Removes the ith "borderbottom" element
     */
    void removeBorderbottom(int i);

    /**
     * Gets a List of "borderleft" elements
     */
    java.util.List<com.microsoft.schemas.office.word.CTBorder> getBorderleftList();

    /**
     * Gets array of all "borderleft" elements
     */
    com.microsoft.schemas.office.word.CTBorder[] getBorderleftArray();

    /**
     * Gets ith "borderleft" element
     */
    com.microsoft.schemas.office.word.CTBorder getBorderleftArray(int i);

    /**
     * Returns number of "borderleft" element
     */
    int sizeOfBorderleftArray();

    /**
     * Sets array of all "borderleft" element
     */
    void setBorderleftArray(com.microsoft.schemas.office.word.CTBorder[] borderleftArray);

    /**
     * Sets ith "borderleft" element
     */
    void setBorderleftArray(int i, com.microsoft.schemas.office.word.CTBorder borderleft);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "borderleft" element
     */
    com.microsoft.schemas.office.word.CTBorder insertNewBorderleft(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "borderleft" element
     */
    com.microsoft.schemas.office.word.CTBorder addNewBorderleft();

    /**
     * Removes the ith "borderleft" element
     */
    void removeBorderleft(int i);

    /**
     * Gets a List of "borderright" elements
     */
    java.util.List<com.microsoft.schemas.office.word.CTBorder> getBorderrightList();

    /**
     * Gets array of all "borderright" elements
     */
    com.microsoft.schemas.office.word.CTBorder[] getBorderrightArray();

    /**
     * Gets ith "borderright" element
     */
    com.microsoft.schemas.office.word.CTBorder getBorderrightArray(int i);

    /**
     * Returns number of "borderright" element
     */
    int sizeOfBorderrightArray();

    /**
     * Sets array of all "borderright" element
     */
    void setBorderrightArray(com.microsoft.schemas.office.word.CTBorder[] borderrightArray);

    /**
     * Sets ith "borderright" element
     */
    void setBorderrightArray(int i, com.microsoft.schemas.office.word.CTBorder borderright);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "borderright" element
     */
    com.microsoft.schemas.office.word.CTBorder insertNewBorderright(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "borderright" element
     */
    com.microsoft.schemas.office.word.CTBorder addNewBorderright();

    /**
     * Removes the ith "borderright" element
     */
    void removeBorderright(int i);

    /**
     * Gets a List of "ClientData" elements
     */
    java.util.List<com.microsoft.schemas.office.excel.CTClientData> getClientDataList();

    /**
     * Gets array of all "ClientData" elements
     */
    com.microsoft.schemas.office.excel.CTClientData[] getClientDataArray();

    /**
     * Gets ith "ClientData" element
     */
    com.microsoft.schemas.office.excel.CTClientData getClientDataArray(int i);

    /**
     * Returns number of "ClientData" element
     */
    int sizeOfClientDataArray();

    /**
     * Sets array of all "ClientData" element
     */
    void setClientDataArray(com.microsoft.schemas.office.excel.CTClientData[] clientDataArray);

    /**
     * Sets ith "ClientData" element
     */
    void setClientDataArray(int i, com.microsoft.schemas.office.excel.CTClientData clientData);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClientData" element
     */
    com.microsoft.schemas.office.excel.CTClientData insertNewClientData(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClientData" element
     */
    com.microsoft.schemas.office.excel.CTClientData addNewClientData();

    /**
     * Removes the ith "ClientData" element
     */
    void removeClientData(int i);

    /**
     * Gets a List of "textdata" elements
     */
    java.util.List<com.microsoft.schemas.office.powerpoint.CTRel> getTextdataList();

    /**
     * Gets array of all "textdata" elements
     */
    com.microsoft.schemas.office.powerpoint.CTRel[] getTextdataArray();

    /**
     * Gets ith "textdata" element
     */
    com.microsoft.schemas.office.powerpoint.CTRel getTextdataArray(int i);

    /**
     * Returns number of "textdata" element
     */
    int sizeOfTextdataArray();

    /**
     * Sets array of all "textdata" element
     */
    void setTextdataArray(com.microsoft.schemas.office.powerpoint.CTRel[] textdataArray);

    /**
     * Sets ith "textdata" element
     */
    void setTextdataArray(int i, com.microsoft.schemas.office.powerpoint.CTRel textdata);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "textdata" element
     */
    com.microsoft.schemas.office.powerpoint.CTRel insertNewTextdata(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "textdata" element
     */
    com.microsoft.schemas.office.powerpoint.CTRel addNewTextdata();

    /**
     * Removes the ith "textdata" element
     */
    void removeTextdata(int i);

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();

    /**
     * Gets the "style" attribute
     */
    java.lang.String getStyle();

    /**
     * Gets (as xml) the "style" attribute
     */
    org.apache.xmlbeans.XmlString xgetStyle();

    /**
     * True if has "style" attribute
     */
    boolean isSetStyle();

    /**
     * Sets the "style" attribute
     */
    void setStyle(java.lang.String style);

    /**
     * Sets (as xml) the "style" attribute
     */
    void xsetStyle(org.apache.xmlbeans.XmlString style);

    /**
     * Unsets the "style" attribute
     */
    void unsetStyle();

    /**
     * Gets the "href" attribute
     */
    java.lang.String getHref();

    /**
     * Gets (as xml) the "href" attribute
     */
    org.apache.xmlbeans.XmlString xgetHref();

    /**
     * True if has "href" attribute
     */
    boolean isSetHref();

    /**
     * Sets the "href" attribute
     */
    void setHref(java.lang.String href);

    /**
     * Sets (as xml) the "href" attribute
     */
    void xsetHref(org.apache.xmlbeans.XmlString href);

    /**
     * Unsets the "href" attribute
     */
    void unsetHref();

    /**
     * Gets the "target" attribute
     */
    java.lang.String getTarget();

    /**
     * Gets (as xml) the "target" attribute
     */
    org.apache.xmlbeans.XmlString xgetTarget();

    /**
     * True if has "target" attribute
     */
    boolean isSetTarget();

    /**
     * Sets the "target" attribute
     */
    void setTarget(java.lang.String target);

    /**
     * Sets (as xml) the "target" attribute
     */
    void xsetTarget(org.apache.xmlbeans.XmlString target);

    /**
     * Unsets the "target" attribute
     */
    void unsetTarget();

    /**
     * Gets the "class" attribute
     */
    java.lang.String getClass1();

    /**
     * Gets (as xml) the "class" attribute
     */
    org.apache.xmlbeans.XmlString xgetClass1();

    /**
     * True if has "class" attribute
     */
    boolean isSetClass1();

    /**
     * Sets the "class" attribute
     */
    void setClass1(java.lang.String class1);

    /**
     * Sets (as xml) the "class" attribute
     */
    void xsetClass1(org.apache.xmlbeans.XmlString class1);

    /**
     * Unsets the "class" attribute
     */
    void unsetClass1();

    /**
     * Gets the "title" attribute
     */
    java.lang.String getTitle();

    /**
     * Gets (as xml) the "title" attribute
     */
    org.apache.xmlbeans.XmlString xgetTitle();

    /**
     * True if has "title" attribute
     */
    boolean isSetTitle();

    /**
     * Sets the "title" attribute
     */
    void setTitle(java.lang.String title);

    /**
     * Sets (as xml) the "title" attribute
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);

    /**
     * Unsets the "title" attribute
     */
    void unsetTitle();

    /**
     * Gets the "alt" attribute
     */
    java.lang.String getAlt();

    /**
     * Gets (as xml) the "alt" attribute
     */
    org.apache.xmlbeans.XmlString xgetAlt();

    /**
     * True if has "alt" attribute
     */
    boolean isSetAlt();

    /**
     * Sets the "alt" attribute
     */
    void setAlt(java.lang.String alt);

    /**
     * Sets (as xml) the "alt" attribute
     */
    void xsetAlt(org.apache.xmlbeans.XmlString alt);

    /**
     * Unsets the "alt" attribute
     */
    void unsetAlt();

    /**
     * Gets the "coordsize" attribute
     */
    java.lang.String getCoordsize();

    /**
     * Gets (as xml) the "coordsize" attribute
     */
    org.apache.xmlbeans.XmlString xgetCoordsize();

    /**
     * True if has "coordsize" attribute
     */
    boolean isSetCoordsize();

    /**
     * Sets the "coordsize" attribute
     */
    void setCoordsize(java.lang.String coordsize);

    /**
     * Sets (as xml) the "coordsize" attribute
     */
    void xsetCoordsize(org.apache.xmlbeans.XmlString coordsize);

    /**
     * Unsets the "coordsize" attribute
     */
    void unsetCoordsize();

    /**
     * Gets the "coordorigin" attribute
     */
    java.lang.String getCoordorigin();

    /**
     * Gets (as xml) the "coordorigin" attribute
     */
    org.apache.xmlbeans.XmlString xgetCoordorigin();

    /**
     * True if has "coordorigin" attribute
     */
    boolean isSetCoordorigin();

    /**
     * Sets the "coordorigin" attribute
     */
    void setCoordorigin(java.lang.String coordorigin);

    /**
     * Sets (as xml) the "coordorigin" attribute
     */
    void xsetCoordorigin(org.apache.xmlbeans.XmlString coordorigin);

    /**
     * Unsets the "coordorigin" attribute
     */
    void unsetCoordorigin();

    /**
     * Gets the "wrapcoords" attribute
     */
    java.lang.String getWrapcoords();

    /**
     * Gets (as xml) the "wrapcoords" attribute
     */
    org.apache.xmlbeans.XmlString xgetWrapcoords();

    /**
     * True if has "wrapcoords" attribute
     */
    boolean isSetWrapcoords();

    /**
     * Sets the "wrapcoords" attribute
     */
    void setWrapcoords(java.lang.String wrapcoords);

    /**
     * Sets (as xml) the "wrapcoords" attribute
     */
    void xsetWrapcoords(org.apache.xmlbeans.XmlString wrapcoords);

    /**
     * Unsets the "wrapcoords" attribute
     */
    void unsetWrapcoords();

    /**
     * Gets the "print" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getPrint();

    /**
     * Gets (as xml) the "print" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetPrint();

    /**
     * True if has "print" attribute
     */
    boolean isSetPrint();

    /**
     * Sets the "print" attribute
     */
    void setPrint(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum print);

    /**
     * Sets (as xml) the "print" attribute
     */
    void xsetPrint(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse print);

    /**
     * Unsets the "print" attribute
     */
    void unsetPrint();

    /**
     * Gets the "spid" attribute
     */
    java.lang.String getSpid();

    /**
     * Gets (as xml) the "spid" attribute
     */
    org.apache.xmlbeans.XmlString xgetSpid();

    /**
     * True if has "spid" attribute
     */
    boolean isSetSpid();

    /**
     * Sets the "spid" attribute
     */
    void setSpid(java.lang.String spid);

    /**
     * Sets (as xml) the "spid" attribute
     */
    void xsetSpid(org.apache.xmlbeans.XmlString spid);

    /**
     * Unsets the "spid" attribute
     */
    void unsetSpid();

    /**
     * Gets the "oned" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOned();

    /**
     * Gets (as xml) the "oned" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOned();

    /**
     * True if has "oned" attribute
     */
    boolean isSetOned();

    /**
     * Sets the "oned" attribute
     */
    void setOned(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum oned);

    /**
     * Sets (as xml) the "oned" attribute
     */
    void xsetOned(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse oned);

    /**
     * Unsets the "oned" attribute
     */
    void unsetOned();

    /**
     * Gets the "regroupid" attribute
     */
    java.math.BigInteger getRegroupid();

    /**
     * Gets (as xml) the "regroupid" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetRegroupid();

    /**
     * True if has "regroupid" attribute
     */
    boolean isSetRegroupid();

    /**
     * Sets the "regroupid" attribute
     */
    void setRegroupid(java.math.BigInteger regroupid);

    /**
     * Sets (as xml) the "regroupid" attribute
     */
    void xsetRegroupid(org.apache.xmlbeans.XmlInteger regroupid);

    /**
     * Unsets the "regroupid" attribute
     */
    void unsetRegroupid();

    /**
     * Gets the "doubleclicknotify" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getDoubleclicknotify();

    /**
     * Gets (as xml) the "doubleclicknotify" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetDoubleclicknotify();

    /**
     * True if has "doubleclicknotify" attribute
     */
    boolean isSetDoubleclicknotify();

    /**
     * Sets the "doubleclicknotify" attribute
     */
    void setDoubleclicknotify(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum doubleclicknotify);

    /**
     * Sets (as xml) the "doubleclicknotify" attribute
     */
    void xsetDoubleclicknotify(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse doubleclicknotify);

    /**
     * Unsets the "doubleclicknotify" attribute
     */
    void unsetDoubleclicknotify();

    /**
     * Gets the "button" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getButton();

    /**
     * Gets (as xml) the "button" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetButton();

    /**
     * True if has "button" attribute
     */
    boolean isSetButton();

    /**
     * Sets the "button" attribute
     */
    void setButton(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum button);

    /**
     * Sets (as xml) the "button" attribute
     */
    void xsetButton(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse button);

    /**
     * Unsets the "button" attribute
     */
    void unsetButton();

    /**
     * Gets the "userhidden" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getUserhidden();

    /**
     * Gets (as xml) the "userhidden" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetUserhidden();

    /**
     * True if has "userhidden" attribute
     */
    boolean isSetUserhidden();

    /**
     * Sets the "userhidden" attribute
     */
    void setUserhidden(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum userhidden);

    /**
     * Sets (as xml) the "userhidden" attribute
     */
    void xsetUserhidden(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse userhidden);

    /**
     * Unsets the "userhidden" attribute
     */
    void unsetUserhidden();

    /**
     * Gets the "bullet" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getBullet();

    /**
     * Gets (as xml) the "bullet" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetBullet();

    /**
     * True if has "bullet" attribute
     */
    boolean isSetBullet();

    /**
     * Sets the "bullet" attribute
     */
    void setBullet(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum bullet);

    /**
     * Sets (as xml) the "bullet" attribute
     */
    void xsetBullet(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse bullet);

    /**
     * Unsets the "bullet" attribute
     */
    void unsetBullet();

    /**
     * Gets the "hr" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getHr();

    /**
     * Gets (as xml) the "hr" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetHr();

    /**
     * True if has "hr" attribute
     */
    boolean isSetHr();

    /**
     * Sets the "hr" attribute
     */
    void setHr(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum hr);

    /**
     * Sets (as xml) the "hr" attribute
     */
    void xsetHr(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse hr);

    /**
     * Unsets the "hr" attribute
     */
    void unsetHr();

    /**
     * Gets the "hrstd" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getHrstd();

    /**
     * Gets (as xml) the "hrstd" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetHrstd();

    /**
     * True if has "hrstd" attribute
     */
    boolean isSetHrstd();

    /**
     * Sets the "hrstd" attribute
     */
    void setHrstd(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum hrstd);

    /**
     * Sets (as xml) the "hrstd" attribute
     */
    void xsetHrstd(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse hrstd);

    /**
     * Unsets the "hrstd" attribute
     */
    void unsetHrstd();

    /**
     * Gets the "hrnoshade" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getHrnoshade();

    /**
     * Gets (as xml) the "hrnoshade" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetHrnoshade();

    /**
     * True if has "hrnoshade" attribute
     */
    boolean isSetHrnoshade();

    /**
     * Sets the "hrnoshade" attribute
     */
    void setHrnoshade(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum hrnoshade);

    /**
     * Sets (as xml) the "hrnoshade" attribute
     */
    void xsetHrnoshade(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse hrnoshade);

    /**
     * Unsets the "hrnoshade" attribute
     */
    void unsetHrnoshade();

    /**
     * Gets the "hrpct" attribute
     */
    float getHrpct();

    /**
     * Gets (as xml) the "hrpct" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetHrpct();

    /**
     * True if has "hrpct" attribute
     */
    boolean isSetHrpct();

    /**
     * Sets the "hrpct" attribute
     */
    void setHrpct(float hrpct);

    /**
     * Sets (as xml) the "hrpct" attribute
     */
    void xsetHrpct(org.apache.xmlbeans.XmlFloat hrpct);

    /**
     * Unsets the "hrpct" attribute
     */
    void unsetHrpct();

    /**
     * Gets the "hralign" attribute
     */
    com.microsoft.schemas.office.office.STHrAlign.Enum getHralign();

    /**
     * Gets (as xml) the "hralign" attribute
     */
    com.microsoft.schemas.office.office.STHrAlign xgetHralign();

    /**
     * True if has "hralign" attribute
     */
    boolean isSetHralign();

    /**
     * Sets the "hralign" attribute
     */
    void setHralign(com.microsoft.schemas.office.office.STHrAlign.Enum hralign);

    /**
     * Sets (as xml) the "hralign" attribute
     */
    void xsetHralign(com.microsoft.schemas.office.office.STHrAlign hralign);

    /**
     * Unsets the "hralign" attribute
     */
    void unsetHralign();

    /**
     * Gets the "allowincell" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAllowincell();

    /**
     * Gets (as xml) the "allowincell" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAllowincell();

    /**
     * True if has "allowincell" attribute
     */
    boolean isSetAllowincell();

    /**
     * Sets the "allowincell" attribute
     */
    void setAllowincell(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum allowincell);

    /**
     * Sets (as xml) the "allowincell" attribute
     */
    void xsetAllowincell(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse allowincell);

    /**
     * Unsets the "allowincell" attribute
     */
    void unsetAllowincell();

    /**
     * Gets the "allowoverlap" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAllowoverlap();

    /**
     * Gets (as xml) the "allowoverlap" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAllowoverlap();

    /**
     * True if has "allowoverlap" attribute
     */
    boolean isSetAllowoverlap();

    /**
     * Sets the "allowoverlap" attribute
     */
    void setAllowoverlap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum allowoverlap);

    /**
     * Sets (as xml) the "allowoverlap" attribute
     */
    void xsetAllowoverlap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse allowoverlap);

    /**
     * Unsets the "allowoverlap" attribute
     */
    void unsetAllowoverlap();

    /**
     * Gets the "userdrawn" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getUserdrawn();

    /**
     * Gets (as xml) the "userdrawn" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetUserdrawn();

    /**
     * True if has "userdrawn" attribute
     */
    boolean isSetUserdrawn();

    /**
     * Sets the "userdrawn" attribute
     */
    void setUserdrawn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum userdrawn);

    /**
     * Sets (as xml) the "userdrawn" attribute
     */
    void xsetUserdrawn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse userdrawn);

    /**
     * Unsets the "userdrawn" attribute
     */
    void unsetUserdrawn();

    /**
     * Gets the "bordertopcolor" attribute
     */
    java.lang.String getBordertopcolor();

    /**
     * Gets (as xml) the "bordertopcolor" attribute
     */
    org.apache.xmlbeans.XmlString xgetBordertopcolor();

    /**
     * True if has "bordertopcolor" attribute
     */
    boolean isSetBordertopcolor();

    /**
     * Sets the "bordertopcolor" attribute
     */
    void setBordertopcolor(java.lang.String bordertopcolor);

    /**
     * Sets (as xml) the "bordertopcolor" attribute
     */
    void xsetBordertopcolor(org.apache.xmlbeans.XmlString bordertopcolor);

    /**
     * Unsets the "bordertopcolor" attribute
     */
    void unsetBordertopcolor();

    /**
     * Gets the "borderleftcolor" attribute
     */
    java.lang.String getBorderleftcolor();

    /**
     * Gets (as xml) the "borderleftcolor" attribute
     */
    org.apache.xmlbeans.XmlString xgetBorderleftcolor();

    /**
     * True if has "borderleftcolor" attribute
     */
    boolean isSetBorderleftcolor();

    /**
     * Sets the "borderleftcolor" attribute
     */
    void setBorderleftcolor(java.lang.String borderleftcolor);

    /**
     * Sets (as xml) the "borderleftcolor" attribute
     */
    void xsetBorderleftcolor(org.apache.xmlbeans.XmlString borderleftcolor);

    /**
     * Unsets the "borderleftcolor" attribute
     */
    void unsetBorderleftcolor();

    /**
     * Gets the "borderbottomcolor" attribute
     */
    java.lang.String getBorderbottomcolor();

    /**
     * Gets (as xml) the "borderbottomcolor" attribute
     */
    org.apache.xmlbeans.XmlString xgetBorderbottomcolor();

    /**
     * True if has "borderbottomcolor" attribute
     */
    boolean isSetBorderbottomcolor();

    /**
     * Sets the "borderbottomcolor" attribute
     */
    void setBorderbottomcolor(java.lang.String borderbottomcolor);

    /**
     * Sets (as xml) the "borderbottomcolor" attribute
     */
    void xsetBorderbottomcolor(org.apache.xmlbeans.XmlString borderbottomcolor);

    /**
     * Unsets the "borderbottomcolor" attribute
     */
    void unsetBorderbottomcolor();

    /**
     * Gets the "borderrightcolor" attribute
     */
    java.lang.String getBorderrightcolor();

    /**
     * Gets (as xml) the "borderrightcolor" attribute
     */
    org.apache.xmlbeans.XmlString xgetBorderrightcolor();

    /**
     * True if has "borderrightcolor" attribute
     */
    boolean isSetBorderrightcolor();

    /**
     * Sets the "borderrightcolor" attribute
     */
    void setBorderrightcolor(java.lang.String borderrightcolor);

    /**
     * Sets (as xml) the "borderrightcolor" attribute
     */
    void xsetBorderrightcolor(org.apache.xmlbeans.XmlString borderrightcolor);

    /**
     * Unsets the "borderrightcolor" attribute
     */
    void unsetBorderrightcolor();

    /**
     * Gets the "dgmlayout" attribute
     */
    java.math.BigInteger getDgmlayout();

    /**
     * Gets (as xml) the "dgmlayout" attribute
     */
    com.microsoft.schemas.office.office.STDiagramLayout xgetDgmlayout();

    /**
     * True if has "dgmlayout" attribute
     */
    boolean isSetDgmlayout();

    /**
     * Sets the "dgmlayout" attribute
     */
    void setDgmlayout(java.math.BigInteger dgmlayout);

    /**
     * Sets (as xml) the "dgmlayout" attribute
     */
    void xsetDgmlayout(com.microsoft.schemas.office.office.STDiagramLayout dgmlayout);

    /**
     * Unsets the "dgmlayout" attribute
     */
    void unsetDgmlayout();

    /**
     * Gets the "dgmnodekind" attribute
     */
    java.math.BigInteger getDgmnodekind();

    /**
     * Gets (as xml) the "dgmnodekind" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetDgmnodekind();

    /**
     * True if has "dgmnodekind" attribute
     */
    boolean isSetDgmnodekind();

    /**
     * Sets the "dgmnodekind" attribute
     */
    void setDgmnodekind(java.math.BigInteger dgmnodekind);

    /**
     * Sets (as xml) the "dgmnodekind" attribute
     */
    void xsetDgmnodekind(org.apache.xmlbeans.XmlInteger dgmnodekind);

    /**
     * Unsets the "dgmnodekind" attribute
     */
    void unsetDgmnodekind();

    /**
     * Gets the "dgmlayoutmru" attribute
     */
    java.math.BigInteger getDgmlayoutmru();

    /**
     * Gets (as xml) the "dgmlayoutmru" attribute
     */
    com.microsoft.schemas.office.office.STDiagramLayout xgetDgmlayoutmru();

    /**
     * True if has "dgmlayoutmru" attribute
     */
    boolean isSetDgmlayoutmru();

    /**
     * Sets the "dgmlayoutmru" attribute
     */
    void setDgmlayoutmru(java.math.BigInteger dgmlayoutmru);

    /**
     * Sets (as xml) the "dgmlayoutmru" attribute
     */
    void xsetDgmlayoutmru(com.microsoft.schemas.office.office.STDiagramLayout dgmlayoutmru);

    /**
     * Unsets the "dgmlayoutmru" attribute
     */
    void unsetDgmlayoutmru();

    /**
     * Gets the "insetmode" attribute
     */
    com.microsoft.schemas.office.office.STInsetMode.Enum getInsetmode();

    /**
     * Gets (as xml) the "insetmode" attribute
     */
    com.microsoft.schemas.office.office.STInsetMode xgetInsetmode();

    /**
     * True if has "insetmode" attribute
     */
    boolean isSetInsetmode();

    /**
     * Sets the "insetmode" attribute
     */
    void setInsetmode(com.microsoft.schemas.office.office.STInsetMode.Enum insetmode);

    /**
     * Sets (as xml) the "insetmode" attribute
     */
    void xsetInsetmode(com.microsoft.schemas.office.office.STInsetMode insetmode);

    /**
     * Unsets the "insetmode" attribute
     */
    void unsetInsetmode();

    /**
     * Gets the "chromakey" attribute
     */
    java.lang.String getChromakey();

    /**
     * Gets (as xml) the "chromakey" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetChromakey();

    /**
     * True if has "chromakey" attribute
     */
    boolean isSetChromakey();

    /**
     * Sets the "chromakey" attribute
     */
    void setChromakey(java.lang.String chromakey);

    /**
     * Sets (as xml) the "chromakey" attribute
     */
    void xsetChromakey(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType chromakey);

    /**
     * Unsets the "chromakey" attribute
     */
    void unsetChromakey();

    /**
     * Gets the "filled" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getFilled();

    /**
     * Gets (as xml) the "filled" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetFilled();

    /**
     * True if has "filled" attribute
     */
    boolean isSetFilled();

    /**
     * Sets the "filled" attribute
     */
    void setFilled(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum filled);

    /**
     * Sets (as xml) the "filled" attribute
     */
    void xsetFilled(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse filled);

    /**
     * Unsets the "filled" attribute
     */
    void unsetFilled();

    /**
     * Gets the "fillcolor" attribute
     */
    java.lang.String getFillcolor();

    /**
     * Gets (as xml) the "fillcolor" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetFillcolor();

    /**
     * True if has "fillcolor" attribute
     */
    boolean isSetFillcolor();

    /**
     * Sets the "fillcolor" attribute
     */
    void setFillcolor(java.lang.String fillcolor);

    /**
     * Sets (as xml) the "fillcolor" attribute
     */
    void xsetFillcolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType fillcolor);

    /**
     * Unsets the "fillcolor" attribute
     */
    void unsetFillcolor();

    /**
     * Gets the "opacity" attribute
     */
    java.lang.String getOpacity();

    /**
     * Gets (as xml) the "opacity" attribute
     */
    org.apache.xmlbeans.XmlString xgetOpacity();

    /**
     * True if has "opacity" attribute
     */
    boolean isSetOpacity();

    /**
     * Sets the "opacity" attribute
     */
    void setOpacity(java.lang.String opacity);

    /**
     * Sets (as xml) the "opacity" attribute
     */
    void xsetOpacity(org.apache.xmlbeans.XmlString opacity);

    /**
     * Unsets the "opacity" attribute
     */
    void unsetOpacity();

    /**
     * Gets the "stroked" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getStroked();

    /**
     * Gets (as xml) the "stroked" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetStroked();

    /**
     * True if has "stroked" attribute
     */
    boolean isSetStroked();

    /**
     * Sets the "stroked" attribute
     */
    void setStroked(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum stroked);

    /**
     * Sets (as xml) the "stroked" attribute
     */
    void xsetStroked(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse stroked);

    /**
     * Unsets the "stroked" attribute
     */
    void unsetStroked();

    /**
     * Gets the "strokecolor" attribute
     */
    java.lang.String getStrokecolor();

    /**
     * Gets (as xml) the "strokecolor" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetStrokecolor();

    /**
     * True if has "strokecolor" attribute
     */
    boolean isSetStrokecolor();

    /**
     * Sets the "strokecolor" attribute
     */
    void setStrokecolor(java.lang.String strokecolor);

    /**
     * Sets (as xml) the "strokecolor" attribute
     */
    void xsetStrokecolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType strokecolor);

    /**
     * Unsets the "strokecolor" attribute
     */
    void unsetStrokecolor();

    /**
     * Gets the "strokeweight" attribute
     */
    java.lang.String getStrokeweight();

    /**
     * Gets (as xml) the "strokeweight" attribute
     */
    org.apache.xmlbeans.XmlString xgetStrokeweight();

    /**
     * True if has "strokeweight" attribute
     */
    boolean isSetStrokeweight();

    /**
     * Sets the "strokeweight" attribute
     */
    void setStrokeweight(java.lang.String strokeweight);

    /**
     * Sets (as xml) the "strokeweight" attribute
     */
    void xsetStrokeweight(org.apache.xmlbeans.XmlString strokeweight);

    /**
     * Unsets the "strokeweight" attribute
     */
    void unsetStrokeweight();

    /**
     * Gets the "insetpen" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getInsetpen();

    /**
     * Gets (as xml) the "insetpen" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetInsetpen();

    /**
     * True if has "insetpen" attribute
     */
    boolean isSetInsetpen();

    /**
     * Sets the "insetpen" attribute
     */
    void setInsetpen(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum insetpen);

    /**
     * Sets (as xml) the "insetpen" attribute
     */
    void xsetInsetpen(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse insetpen);

    /**
     * Unsets the "insetpen" attribute
     */
    void unsetInsetpen();

    /**
     * Gets the "spt" attribute
     */
    float getSpt();

    /**
     * Gets (as xml) the "spt" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetSpt();

    /**
     * True if has "spt" attribute
     */
    boolean isSetSpt();

    /**
     * Sets the "spt" attribute
     */
    void setSpt(float spt);

    /**
     * Sets (as xml) the "spt" attribute
     */
    void xsetSpt(org.apache.xmlbeans.XmlFloat spt);

    /**
     * Unsets the "spt" attribute
     */
    void unsetSpt();

    /**
     * Gets the "connectortype" attribute
     */
    com.microsoft.schemas.office.office.STConnectorType.Enum getConnectortype();

    /**
     * Gets (as xml) the "connectortype" attribute
     */
    com.microsoft.schemas.office.office.STConnectorType xgetConnectortype();

    /**
     * True if has "connectortype" attribute
     */
    boolean isSetConnectortype();

    /**
     * Sets the "connectortype" attribute
     */
    void setConnectortype(com.microsoft.schemas.office.office.STConnectorType.Enum connectortype);

    /**
     * Sets (as xml) the "connectortype" attribute
     */
    void xsetConnectortype(com.microsoft.schemas.office.office.STConnectorType connectortype);

    /**
     * Unsets the "connectortype" attribute
     */
    void unsetConnectortype();

    /**
     * Gets the "bwmode" attribute
     */
    com.microsoft.schemas.office.office.STBWMode.Enum getBwmode();

    /**
     * Gets (as xml) the "bwmode" attribute
     */
    com.microsoft.schemas.office.office.STBWMode xgetBwmode();

    /**
     * True if has "bwmode" attribute
     */
    boolean isSetBwmode();

    /**
     * Sets the "bwmode" attribute
     */
    void setBwmode(com.microsoft.schemas.office.office.STBWMode.Enum bwmode);

    /**
     * Sets (as xml) the "bwmode" attribute
     */
    void xsetBwmode(com.microsoft.schemas.office.office.STBWMode bwmode);

    /**
     * Unsets the "bwmode" attribute
     */
    void unsetBwmode();

    /**
     * Gets the "bwpure" attribute
     */
    com.microsoft.schemas.office.office.STBWMode.Enum getBwpure();

    /**
     * Gets (as xml) the "bwpure" attribute
     */
    com.microsoft.schemas.office.office.STBWMode xgetBwpure();

    /**
     * True if has "bwpure" attribute
     */
    boolean isSetBwpure();

    /**
     * Sets the "bwpure" attribute
     */
    void setBwpure(com.microsoft.schemas.office.office.STBWMode.Enum bwpure);

    /**
     * Sets (as xml) the "bwpure" attribute
     */
    void xsetBwpure(com.microsoft.schemas.office.office.STBWMode bwpure);

    /**
     * Unsets the "bwpure" attribute
     */
    void unsetBwpure();

    /**
     * Gets the "bwnormal" attribute
     */
    com.microsoft.schemas.office.office.STBWMode.Enum getBwnormal();

    /**
     * Gets (as xml) the "bwnormal" attribute
     */
    com.microsoft.schemas.office.office.STBWMode xgetBwnormal();

    /**
     * True if has "bwnormal" attribute
     */
    boolean isSetBwnormal();

    /**
     * Sets the "bwnormal" attribute
     */
    void setBwnormal(com.microsoft.schemas.office.office.STBWMode.Enum bwnormal);

    /**
     * Sets (as xml) the "bwnormal" attribute
     */
    void xsetBwnormal(com.microsoft.schemas.office.office.STBWMode bwnormal);

    /**
     * Unsets the "bwnormal" attribute
     */
    void unsetBwnormal();

    /**
     * Gets the "forcedash" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getForcedash();

    /**
     * Gets (as xml) the "forcedash" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetForcedash();

    /**
     * True if has "forcedash" attribute
     */
    boolean isSetForcedash();

    /**
     * Sets the "forcedash" attribute
     */
    void setForcedash(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum forcedash);

    /**
     * Sets (as xml) the "forcedash" attribute
     */
    void xsetForcedash(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse forcedash);

    /**
     * Unsets the "forcedash" attribute
     */
    void unsetForcedash();

    /**
     * Gets the "oleicon" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOleicon();

    /**
     * Gets (as xml) the "oleicon" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOleicon();

    /**
     * True if has "oleicon" attribute
     */
    boolean isSetOleicon();

    /**
     * Sets the "oleicon" attribute
     */
    void setOleicon(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum oleicon);

    /**
     * Sets (as xml) the "oleicon" attribute
     */
    void xsetOleicon(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse oleicon);

    /**
     * Unsets the "oleicon" attribute
     */
    void unsetOleicon();

    /**
     * Gets the "ole" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getOle();

    /**
     * Gets (as xml) the "ole" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetOle();

    /**
     * True if has "ole" attribute
     */
    boolean isSetOle();

    /**
     * Sets the "ole" attribute
     */
    void setOle(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum ole);

    /**
     * Sets (as xml) the "ole" attribute
     */
    void xsetOle(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank ole);

    /**
     * Unsets the "ole" attribute
     */
    void unsetOle();

    /**
     * Gets the "preferrelative" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getPreferrelative();

    /**
     * Gets (as xml) the "preferrelative" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetPreferrelative();

    /**
     * True if has "preferrelative" attribute
     */
    boolean isSetPreferrelative();

    /**
     * Sets the "preferrelative" attribute
     */
    void setPreferrelative(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum preferrelative);

    /**
     * Sets (as xml) the "preferrelative" attribute
     */
    void xsetPreferrelative(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse preferrelative);

    /**
     * Unsets the "preferrelative" attribute
     */
    void unsetPreferrelative();

    /**
     * Gets the "cliptowrap" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getCliptowrap();

    /**
     * Gets (as xml) the "cliptowrap" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetCliptowrap();

    /**
     * True if has "cliptowrap" attribute
     */
    boolean isSetCliptowrap();

    /**
     * Sets the "cliptowrap" attribute
     */
    void setCliptowrap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum cliptowrap);

    /**
     * Sets (as xml) the "cliptowrap" attribute
     */
    void xsetCliptowrap(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse cliptowrap);

    /**
     * Unsets the "cliptowrap" attribute
     */
    void unsetCliptowrap();

    /**
     * Gets the "clip" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getClip();

    /**
     * Gets (as xml) the "clip" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetClip();

    /**
     * True if has "clip" attribute
     */
    boolean isSetClip();

    /**
     * Sets the "clip" attribute
     */
    void setClip(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum clip);

    /**
     * Sets (as xml) the "clip" attribute
     */
    void xsetClip(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse clip);

    /**
     * Unsets the "clip" attribute
     */
    void unsetClip();
}
