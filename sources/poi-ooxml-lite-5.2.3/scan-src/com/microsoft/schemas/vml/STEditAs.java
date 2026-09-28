/*
 * XML Type:  ST_EditAs
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.STEditAs
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_EditAs(@urn:schemas-microsoft-com:vml).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.vml.STEditAs.
 */
public interface STEditAs extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.vml.STEditAs> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "steditas85aatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum CANVAS = Enum.forString("canvas");
    Enum ORGCHART = Enum.forString("orgchart");
    Enum RADIAL = Enum.forString("radial");
    Enum CYCLE = Enum.forString("cycle");
    Enum STACKED = Enum.forString("stacked");
    Enum VENN = Enum.forString("venn");
    Enum BULLSEYE = Enum.forString("bullseye");

    int INT_CANVAS = Enum.INT_CANVAS;
    int INT_ORGCHART = Enum.INT_ORGCHART;
    int INT_RADIAL = Enum.INT_RADIAL;
    int INT_CYCLE = Enum.INT_CYCLE;
    int INT_STACKED = Enum.INT_STACKED;
    int INT_VENN = Enum.INT_VENN;
    int INT_BULLSEYE = Enum.INT_BULLSEYE;

    /**
     * Enumeration value class for com.microsoft.schemas.vml.STEditAs.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CANVAS
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s) {
            return (Enum)table.forString(s);
        }

        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i) {
            return (Enum)table.forInt(i);
        }

        private Enum(java.lang.String s, int i) {
            super(s, i);
        }

        static final int INT_CANVAS = 1;
        static final int INT_ORGCHART = 2;
        static final int INT_RADIAL = 3;
        static final int INT_CYCLE = 4;
        static final int INT_STACKED = 5;
        static final int INT_VENN = 6;
        static final int INT_BULLSEYE = 7;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("canvas", INT_CANVAS),
            new Enum("orgchart", INT_ORGCHART),
            new Enum("radial", INT_RADIAL),
            new Enum("cycle", INT_CYCLE),
            new Enum("stacked", INT_STACKED),
            new Enum("venn", INT_VENN),
            new Enum("bullseye", INT_BULLSEYE),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
