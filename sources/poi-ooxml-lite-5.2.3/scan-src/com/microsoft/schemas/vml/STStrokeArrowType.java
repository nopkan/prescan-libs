/*
 * XML Type:  ST_StrokeArrowType
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.STStrokeArrowType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_StrokeArrowType(@urn:schemas-microsoft-com:vml).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.vml.STStrokeArrowType.
 */
public interface STStrokeArrowType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.vml.STStrokeArrowType> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ststrokearrowtype7b4ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum NONE = Enum.forString("none");
    Enum BLOCK = Enum.forString("block");
    Enum CLASSIC = Enum.forString("classic");
    Enum OVAL = Enum.forString("oval");
    Enum DIAMOND = Enum.forString("diamond");
    Enum OPEN = Enum.forString("open");

    int INT_NONE = Enum.INT_NONE;
    int INT_BLOCK = Enum.INT_BLOCK;
    int INT_CLASSIC = Enum.INT_CLASSIC;
    int INT_OVAL = Enum.INT_OVAL;
    int INT_DIAMOND = Enum.INT_DIAMOND;
    int INT_OPEN = Enum.INT_OPEN;

    /**
     * Enumeration value class for com.microsoft.schemas.vml.STStrokeArrowType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NONE
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

        static final int INT_NONE = 1;
        static final int INT_BLOCK = 2;
        static final int INT_CLASSIC = 3;
        static final int INT_OVAL = 4;
        static final int INT_DIAMOND = 5;
        static final int INT_OPEN = 6;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("none", INT_NONE),
            new Enum("block", INT_BLOCK),
            new Enum("classic", INT_CLASSIC),
            new Enum("oval", INT_OVAL),
            new Enum("diamond", INT_DIAMOND),
            new Enum("open", INT_OPEN),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
