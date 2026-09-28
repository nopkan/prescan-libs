/*
 * XML Type:  CT_SignatureLine
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTSignatureLine
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SignatureLine(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTSignatureLine extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTSignatureLine> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsignaturelineec85type");
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
     * Gets the "issignatureline" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getIssignatureline();

    /**
     * Gets (as xml) the "issignatureline" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetIssignatureline();

    /**
     * True if has "issignatureline" attribute
     */
    boolean isSetIssignatureline();

    /**
     * Sets the "issignatureline" attribute
     */
    void setIssignatureline(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum issignatureline);

    /**
     * Sets (as xml) the "issignatureline" attribute
     */
    void xsetIssignatureline(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse issignatureline);

    /**
     * Unsets the "issignatureline" attribute
     */
    void unsetIssignatureline();

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetId();

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
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();

    /**
     * Gets the "provid" attribute
     */
    java.lang.String getProvid();

    /**
     * Gets (as xml) the "provid" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetProvid();

    /**
     * True if has "provid" attribute
     */
    boolean isSetProvid();

    /**
     * Sets the "provid" attribute
     */
    void setProvid(java.lang.String provid);

    /**
     * Sets (as xml) the "provid" attribute
     */
    void xsetProvid(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid provid);

    /**
     * Unsets the "provid" attribute
     */
    void unsetProvid();

    /**
     * Gets the "signinginstructionsset" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getSigninginstructionsset();

    /**
     * Gets (as xml) the "signinginstructionsset" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetSigninginstructionsset();

    /**
     * True if has "signinginstructionsset" attribute
     */
    boolean isSetSigninginstructionsset();

    /**
     * Sets the "signinginstructionsset" attribute
     */
    void setSigninginstructionsset(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum signinginstructionsset);

    /**
     * Sets (as xml) the "signinginstructionsset" attribute
     */
    void xsetSigninginstructionsset(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse signinginstructionsset);

    /**
     * Unsets the "signinginstructionsset" attribute
     */
    void unsetSigninginstructionsset();

    /**
     * Gets the "allowcomments" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAllowcomments();

    /**
     * Gets (as xml) the "allowcomments" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAllowcomments();

    /**
     * True if has "allowcomments" attribute
     */
    boolean isSetAllowcomments();

    /**
     * Sets the "allowcomments" attribute
     */
    void setAllowcomments(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum allowcomments);

    /**
     * Sets (as xml) the "allowcomments" attribute
     */
    void xsetAllowcomments(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse allowcomments);

    /**
     * Unsets the "allowcomments" attribute
     */
    void unsetAllowcomments();

    /**
     * Gets the "showsigndate" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getShowsigndate();

    /**
     * Gets (as xml) the "showsigndate" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetShowsigndate();

    /**
     * True if has "showsigndate" attribute
     */
    boolean isSetShowsigndate();

    /**
     * Sets the "showsigndate" attribute
     */
    void setShowsigndate(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum showsigndate);

    /**
     * Sets (as xml) the "showsigndate" attribute
     */
    void xsetShowsigndate(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse showsigndate);

    /**
     * Unsets the "showsigndate" attribute
     */
    void unsetShowsigndate();

    /**
     * Gets the "suggestedsigner" attribute
     */
    java.lang.String getSuggestedsigner();

    /**
     * Gets (as xml) the "suggestedsigner" attribute
     */
    org.apache.xmlbeans.XmlString xgetSuggestedsigner();

    /**
     * True if has "suggestedsigner" attribute
     */
    boolean isSetSuggestedsigner();

    /**
     * Sets the "suggestedsigner" attribute
     */
    void setSuggestedsigner(java.lang.String suggestedsigner);

    /**
     * Sets (as xml) the "suggestedsigner" attribute
     */
    void xsetSuggestedsigner(org.apache.xmlbeans.XmlString suggestedsigner);

    /**
     * Unsets the "suggestedsigner" attribute
     */
    void unsetSuggestedsigner();

    /**
     * Gets the "suggestedsigner2" attribute
     */
    java.lang.String getSuggestedsigner2();

    /**
     * Gets (as xml) the "suggestedsigner2" attribute
     */
    org.apache.xmlbeans.XmlString xgetSuggestedsigner2();

    /**
     * True if has "suggestedsigner2" attribute
     */
    boolean isSetSuggestedsigner2();

    /**
     * Sets the "suggestedsigner2" attribute
     */
    void setSuggestedsigner2(java.lang.String suggestedsigner2);

    /**
     * Sets (as xml) the "suggestedsigner2" attribute
     */
    void xsetSuggestedsigner2(org.apache.xmlbeans.XmlString suggestedsigner2);

    /**
     * Unsets the "suggestedsigner2" attribute
     */
    void unsetSuggestedsigner2();

    /**
     * Gets the "suggestedsigneremail" attribute
     */
    java.lang.String getSuggestedsigneremail();

    /**
     * Gets (as xml) the "suggestedsigneremail" attribute
     */
    org.apache.xmlbeans.XmlString xgetSuggestedsigneremail();

    /**
     * True if has "suggestedsigneremail" attribute
     */
    boolean isSetSuggestedsigneremail();

    /**
     * Sets the "suggestedsigneremail" attribute
     */
    void setSuggestedsigneremail(java.lang.String suggestedsigneremail);

    /**
     * Sets (as xml) the "suggestedsigneremail" attribute
     */
    void xsetSuggestedsigneremail(org.apache.xmlbeans.XmlString suggestedsigneremail);

    /**
     * Unsets the "suggestedsigneremail" attribute
     */
    void unsetSuggestedsigneremail();

    /**
     * Gets the "signinginstructions" attribute
     */
    java.lang.String getSigninginstructions();

    /**
     * Gets (as xml) the "signinginstructions" attribute
     */
    org.apache.xmlbeans.XmlString xgetSigninginstructions();

    /**
     * True if has "signinginstructions" attribute
     */
    boolean isSetSigninginstructions();

    /**
     * Sets the "signinginstructions" attribute
     */
    void setSigninginstructions(java.lang.String signinginstructions);

    /**
     * Sets (as xml) the "signinginstructions" attribute
     */
    void xsetSigninginstructions(org.apache.xmlbeans.XmlString signinginstructions);

    /**
     * Unsets the "signinginstructions" attribute
     */
    void unsetSigninginstructions();

    /**
     * Gets the "addlxml" attribute
     */
    java.lang.String getAddlxml();

    /**
     * Gets (as xml) the "addlxml" attribute
     */
    org.apache.xmlbeans.XmlString xgetAddlxml();

    /**
     * True if has "addlxml" attribute
     */
    boolean isSetAddlxml();

    /**
     * Sets the "addlxml" attribute
     */
    void setAddlxml(java.lang.String addlxml);

    /**
     * Sets (as xml) the "addlxml" attribute
     */
    void xsetAddlxml(org.apache.xmlbeans.XmlString addlxml);

    /**
     * Unsets the "addlxml" attribute
     */
    void unsetAddlxml();

    /**
     * Gets the "sigprovurl" attribute
     */
    java.lang.String getSigprovurl();

    /**
     * Gets (as xml) the "sigprovurl" attribute
     */
    org.apache.xmlbeans.XmlString xgetSigprovurl();

    /**
     * True if has "sigprovurl" attribute
     */
    boolean isSetSigprovurl();

    /**
     * Sets the "sigprovurl" attribute
     */
    void setSigprovurl(java.lang.String sigprovurl);

    /**
     * Sets (as xml) the "sigprovurl" attribute
     */
    void xsetSigprovurl(org.apache.xmlbeans.XmlString sigprovurl);

    /**
     * Unsets the "sigprovurl" attribute
     */
    void unsetSigprovurl();
}
