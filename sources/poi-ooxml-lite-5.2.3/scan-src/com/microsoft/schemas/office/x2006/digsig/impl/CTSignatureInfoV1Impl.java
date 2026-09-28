/*
 * XML Type:  CT_SignatureInfoV1
 * Namespace: http://schemas.microsoft.com/office/2006/digsig
 * Java type: com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.digsig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_SignatureInfoV1(@http://schemas.microsoft.com/office/2006/digsig).
 *
 * This is a complex type.
 */
public class CTSignatureInfoV1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 {
    private static final long serialVersionUID = 1L;

    public CTSignatureInfoV1Impl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/2006/digsig", "SetupID"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureText"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureImage"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureComments"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "WindowsVersion"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "OfficeVersion"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "ApplicationVersion"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "Monitors"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "HorizontalResolution"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "VerticalResolution"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "ColorDepth"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureProviderId"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureProviderUrl"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureProviderDetails"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureType"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "DelegateSuggestedSigner"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "DelegateSuggestedSigner2"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "DelegateSuggestedSignerEmail"),
        new QName("http://schemas.microsoft.com/office/2006/digsig", "ManifestHashAlgorithm"),
    };


    /**
     * Gets the "SetupID" element
     */
    @Override
    public java.lang.String getSetupID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SetupID" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces xgetSetupID() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "SetupID" element
     */
    @Override
    public void setSetupID(java.lang.String setupID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(setupID);
        }
    }

    /**
     * Sets (as xml) the "SetupID" element
     */
    @Override
    public void xsetSetupID(com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces setupID) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(setupID);
        }
    }

    /**
     * Gets the "SignatureText" element
     */
    @Override
    public java.lang.String getSignatureText() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SignatureText" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STSignatureText xgetSignatureText() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureText target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureText)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "SignatureText" element
     */
    @Override
    public void setSignatureText(java.lang.String signatureText) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(signatureText);
        }
    }

    /**
     * Sets (as xml) the "SignatureText" element
     */
    @Override
    public void xsetSignatureText(com.microsoft.schemas.office.x2006.digsig.STSignatureText signatureText) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureText target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureText)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STSignatureText)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(signatureText);
        }
    }

    /**
     * Gets the "SignatureImage" element
     */
    @Override
    public byte[] getSignatureImage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getByteArrayValue();
        }
    }

    /**
     * Gets (as xml) the "SignatureImage" element
     */
    @Override
    public org.apache.xmlbeans.XmlBase64Binary xgetSignatureImage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * Sets the "SignatureImage" element
     */
    @Override
    public void setSignatureImage(byte[] signatureImage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setByteArrayValue(signatureImage);
        }
    }

    /**
     * Sets (as xml) the "SignatureImage" element
     */
    @Override
    public void xsetSignatureImage(org.apache.xmlbeans.XmlBase64Binary signatureImage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(signatureImage);
        }
    }

    /**
     * Gets the "SignatureComments" element
     */
    @Override
    public java.lang.String getSignatureComments() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SignatureComments" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STSignatureComments xgetSignatureComments() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureComments target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureComments)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * Sets the "SignatureComments" element
     */
    @Override
    public void setSignatureComments(java.lang.String signatureComments) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(signatureComments);
        }
    }

    /**
     * Sets (as xml) the "SignatureComments" element
     */
    @Override
    public void xsetSignatureComments(com.microsoft.schemas.office.x2006.digsig.STSignatureComments signatureComments) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureComments target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureComments)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STSignatureComments)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(signatureComments);
        }
    }

    /**
     * Gets the "WindowsVersion" element
     */
    @Override
    public java.lang.String getWindowsVersion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "WindowsVersion" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STVersion xgetWindowsVersion() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * Sets the "WindowsVersion" element
     */
    @Override
    public void setWindowsVersion(java.lang.String windowsVersion) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(windowsVersion);
        }
    }

    /**
     * Sets (as xml) the "WindowsVersion" element
     */
    @Override
    public void xsetWindowsVersion(com.microsoft.schemas.office.x2006.digsig.STVersion windowsVersion) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(windowsVersion);
        }
    }

    /**
     * Gets the "OfficeVersion" element
     */
    @Override
    public java.lang.String getOfficeVersion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "OfficeVersion" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STVersion xgetOfficeVersion() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return target;
        }
    }

    /**
     * Sets the "OfficeVersion" element
     */
    @Override
    public void setOfficeVersion(java.lang.String officeVersion) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(officeVersion);
        }
    }

    /**
     * Sets (as xml) the "OfficeVersion" element
     */
    @Override
    public void xsetOfficeVersion(com.microsoft.schemas.office.x2006.digsig.STVersion officeVersion) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.set(officeVersion);
        }
    }

    /**
     * Gets the "ApplicationVersion" element
     */
    @Override
    public java.lang.String getApplicationVersion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ApplicationVersion" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STVersion xgetApplicationVersion() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return target;
        }
    }

    /**
     * Sets the "ApplicationVersion" element
     */
    @Override
    public void setApplicationVersion(java.lang.String applicationVersion) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(applicationVersion);
        }
    }

    /**
     * Sets (as xml) the "ApplicationVersion" element
     */
    @Override
    public void xsetApplicationVersion(com.microsoft.schemas.office.x2006.digsig.STVersion applicationVersion) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.set(applicationVersion);
        }
    }

    /**
     * Gets the "Monitors" element
     */
    @Override
    public int getMonitors() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "Monitors" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetMonitors() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return target;
        }
    }

    /**
     * Sets the "Monitors" element
     */
    @Override
    public void setMonitors(int monitors) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.setIntValue(monitors);
        }
    }

    /**
     * Sets (as xml) the "Monitors" element
     */
    @Override
    public void xsetMonitors(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger monitors) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.set(monitors);
        }
    }

    /**
     * Gets the "HorizontalResolution" element
     */
    @Override
    public int getHorizontalResolution() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "HorizontalResolution" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetHorizontalResolution() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return target;
        }
    }

    /**
     * Sets the "HorizontalResolution" element
     */
    @Override
    public void setHorizontalResolution(int horizontalResolution) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[8]);
            }
            target.setIntValue(horizontalResolution);
        }
    }

    /**
     * Sets (as xml) the "HorizontalResolution" element
     */
    @Override
    public void xsetHorizontalResolution(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger horizontalResolution) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().add_element_user(PROPERTY_QNAME[8]);
            }
            target.set(horizontalResolution);
        }
    }

    /**
     * Gets the "VerticalResolution" element
     */
    @Override
    public int getVerticalResolution() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "VerticalResolution" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetVerticalResolution() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return target;
        }
    }

    /**
     * Sets the "VerticalResolution" element
     */
    @Override
    public void setVerticalResolution(int verticalResolution) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[9]);
            }
            target.setIntValue(verticalResolution);
        }
    }

    /**
     * Sets (as xml) the "VerticalResolution" element
     */
    @Override
    public void xsetVerticalResolution(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger verticalResolution) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().add_element_user(PROPERTY_QNAME[9]);
            }
            target.set(verticalResolution);
        }
    }

    /**
     * Gets the "ColorDepth" element
     */
    @Override
    public int getColorDepth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "ColorDepth" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetColorDepth() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            return target;
        }
    }

    /**
     * Sets the "ColorDepth" element
     */
    @Override
    public void setColorDepth(int colorDepth) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[10]);
            }
            target.setIntValue(colorDepth);
        }
    }

    /**
     * Sets (as xml) the "ColorDepth" element
     */
    @Override
    public void xsetColorDepth(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger colorDepth) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().add_element_user(PROPERTY_QNAME[10]);
            }
            target.set(colorDepth);
        }
    }

    /**
     * Gets the "SignatureProviderId" element
     */
    @Override
    public java.lang.String getSignatureProviderId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SignatureProviderId" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces xgetSignatureProviderId() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return target;
        }
    }

    /**
     * Sets the "SignatureProviderId" element
     */
    @Override
    public void setSignatureProviderId(java.lang.String signatureProviderId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[11]);
            }
            target.setStringValue(signatureProviderId);
        }
    }

    /**
     * Sets (as xml) the "SignatureProviderId" element
     */
    @Override
    public void xsetSignatureProviderId(com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces signatureProviderId) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().add_element_user(PROPERTY_QNAME[11]);
            }
            target.set(signatureProviderId);
        }
    }

    /**
     * Gets the "SignatureProviderUrl" element
     */
    @Override
    public java.lang.String getSignatureProviderUrl() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SignatureProviderUrl" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl xgetSignatureProviderUrl() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return target;
        }
    }

    /**
     * Sets the "SignatureProviderUrl" element
     */
    @Override
    public void setSignatureProviderUrl(java.lang.String signatureProviderUrl) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[12]);
            }
            target.setStringValue(signatureProviderUrl);
        }
    }

    /**
     * Sets (as xml) the "SignatureProviderUrl" element
     */
    @Override
    public void xsetSignatureProviderUrl(com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl signatureProviderUrl) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl)get_store().add_element_user(PROPERTY_QNAME[12]);
            }
            target.set(signatureProviderUrl);
        }
    }

    /**
     * Gets the "SignatureProviderDetails" element
     */
    @Override
    public int getSignatureProviderDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "SignatureProviderDetails" element
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetSignatureProviderDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            return target;
        }
    }

    /**
     * Sets the "SignatureProviderDetails" element
     */
    @Override
    public void setSignatureProviderDetails(int signatureProviderDetails) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[13]);
            }
            target.setIntValue(signatureProviderDetails);
        }
    }

    /**
     * Sets (as xml) the "SignatureProviderDetails" element
     */
    @Override
    public void xsetSignatureProviderDetails(org.apache.xmlbeans.XmlInt signatureProviderDetails) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PROPERTY_QNAME[13]);
            }
            target.set(signatureProviderDetails);
        }
    }

    /**
     * Gets the "SignatureType" element
     */
    @Override
    public int getSignatureType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[14], 0);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "SignatureType" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.STSignatureType xgetSignatureType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureType target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureType)get_store().find_element_user(PROPERTY_QNAME[14], 0);
            return target;
        }
    }

    /**
     * Sets the "SignatureType" element
     */
    @Override
    public void setSignatureType(int signatureType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[14], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[14]);
            }
            target.setIntValue(signatureType);
        }
    }

    /**
     * Sets (as xml) the "SignatureType" element
     */
    @Override
    public void xsetSignatureType(com.microsoft.schemas.office.x2006.digsig.STSignatureType signatureType) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureType target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureType)get_store().find_element_user(PROPERTY_QNAME[14], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.x2006.digsig.STSignatureType)get_store().add_element_user(PROPERTY_QNAME[14]);
            }
            target.set(signatureType);
        }
    }

    /**
     * Gets the "DelegateSuggestedSigner" element
     */
    @Override
    public java.lang.String getDelegateSuggestedSigner() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[15], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DelegateSuggestedSigner" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDelegateSuggestedSigner() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[15], 0);
            return target;
        }
    }

    /**
     * True if has "DelegateSuggestedSigner" element
     */
    @Override
    public boolean isSetDelegateSuggestedSigner() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[15]) != 0;
        }
    }

    /**
     * Sets the "DelegateSuggestedSigner" element
     */
    @Override
    public void setDelegateSuggestedSigner(java.lang.String delegateSuggestedSigner) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[15], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[15]);
            }
            target.setStringValue(delegateSuggestedSigner);
        }
    }

    /**
     * Sets (as xml) the "DelegateSuggestedSigner" element
     */
    @Override
    public void xsetDelegateSuggestedSigner(org.apache.xmlbeans.XmlString delegateSuggestedSigner) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[15], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[15]);
            }
            target.set(delegateSuggestedSigner);
        }
    }

    /**
     * Unsets the "DelegateSuggestedSigner" element
     */
    @Override
    public void unsetDelegateSuggestedSigner() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], 0);
        }
    }

    /**
     * Gets the "DelegateSuggestedSigner2" element
     */
    @Override
    public java.lang.String getDelegateSuggestedSigner2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[16], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DelegateSuggestedSigner2" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDelegateSuggestedSigner2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[16], 0);
            return target;
        }
    }

    /**
     * True if has "DelegateSuggestedSigner2" element
     */
    @Override
    public boolean isSetDelegateSuggestedSigner2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]) != 0;
        }
    }

    /**
     * Sets the "DelegateSuggestedSigner2" element
     */
    @Override
    public void setDelegateSuggestedSigner2(java.lang.String delegateSuggestedSigner2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[16], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[16]);
            }
            target.setStringValue(delegateSuggestedSigner2);
        }
    }

    /**
     * Sets (as xml) the "DelegateSuggestedSigner2" element
     */
    @Override
    public void xsetDelegateSuggestedSigner2(org.apache.xmlbeans.XmlString delegateSuggestedSigner2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[16], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[16]);
            }
            target.set(delegateSuggestedSigner2);
        }
    }

    /**
     * Unsets the "DelegateSuggestedSigner2" element
     */
    @Override
    public void unsetDelegateSuggestedSigner2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], 0);
        }
    }

    /**
     * Gets the "DelegateSuggestedSignerEmail" element
     */
    @Override
    public java.lang.String getDelegateSuggestedSignerEmail() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[17], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DelegateSuggestedSignerEmail" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDelegateSuggestedSignerEmail() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[17], 0);
            return target;
        }
    }

    /**
     * True if has "DelegateSuggestedSignerEmail" element
     */
    @Override
    public boolean isSetDelegateSuggestedSignerEmail() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[17]) != 0;
        }
    }

    /**
     * Sets the "DelegateSuggestedSignerEmail" element
     */
    @Override
    public void setDelegateSuggestedSignerEmail(java.lang.String delegateSuggestedSignerEmail) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[17], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[17]);
            }
            target.setStringValue(delegateSuggestedSignerEmail);
        }
    }

    /**
     * Sets (as xml) the "DelegateSuggestedSignerEmail" element
     */
    @Override
    public void xsetDelegateSuggestedSignerEmail(org.apache.xmlbeans.XmlString delegateSuggestedSignerEmail) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[17], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[17]);
            }
            target.set(delegateSuggestedSignerEmail);
        }
    }

    /**
     * Unsets the "DelegateSuggestedSignerEmail" element
     */
    @Override
    public void unsetDelegateSuggestedSignerEmail() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[17], 0);
        }
    }

    /**
     * Gets the "ManifestHashAlgorithm" element
     */
    @Override
    public java.lang.String getManifestHashAlgorithm() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[18], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ManifestHashAlgorithm" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetManifestHashAlgorithm() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[18], 0);
            return target;
        }
    }

    /**
     * True if has "ManifestHashAlgorithm" element
     */
    @Override
    public boolean isSetManifestHashAlgorithm() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]) != 0;
        }
    }

    /**
     * Sets the "ManifestHashAlgorithm" element
     */
    @Override
    public void setManifestHashAlgorithm(java.lang.String manifestHashAlgorithm) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[18], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[18]);
            }
            target.setStringValue(manifestHashAlgorithm);
        }
    }

    /**
     * Sets (as xml) the "ManifestHashAlgorithm" element
     */
    @Override
    public void xsetManifestHashAlgorithm(org.apache.xmlbeans.XmlAnyURI manifestHashAlgorithm) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[18], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[18]);
            }
            target.set(manifestHashAlgorithm);
        }
    }

    /**
     * Unsets the "ManifestHashAlgorithm" element
     */
    @Override
    public void unsetManifestHashAlgorithm() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], 0);
        }
    }
}
