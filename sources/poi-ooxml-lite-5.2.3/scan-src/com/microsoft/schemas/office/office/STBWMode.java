/*
 * XML Type:  ST_BWMode
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.STBWMode
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_BWMode(@urn:schemas-microsoft-com:office:office).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.office.STBWMode.
 */
public interface STBWMode extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.office.STBWMode> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stbwmode77abtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum COLOR = Enum.forString("color");
    Enum AUTO = Enum.forString("auto");
    Enum GRAY_SCALE = Enum.forString("grayScale");
    Enum LIGHT_GRAYSCALE = Enum.forString("lightGrayscale");
    Enum INVERSE_GRAY = Enum.forString("inverseGray");
    Enum GRAY_OUTLINE = Enum.forString("grayOutline");
    Enum HIGH_CONTRAST = Enum.forString("highContrast");
    Enum BLACK = Enum.forString("black");
    Enum WHITE = Enum.forString("white");
    Enum HIDE = Enum.forString("hide");
    Enum UNDRAWN = Enum.forString("undrawn");
    Enum BLACK_TEXT_AND_LINES = Enum.forString("blackTextAndLines");

    int INT_COLOR = Enum.INT_COLOR;
    int INT_AUTO = Enum.INT_AUTO;
    int INT_GRAY_SCALE = Enum.INT_GRAY_SCALE;
    int INT_LIGHT_GRAYSCALE = Enum.INT_LIGHT_GRAYSCALE;
    int INT_INVERSE_GRAY = Enum.INT_INVERSE_GRAY;
    int INT_GRAY_OUTLINE = Enum.INT_GRAY_OUTLINE;
    int INT_HIGH_CONTRAST = Enum.INT_HIGH_CONTRAST;
    int INT_BLACK = Enum.INT_BLACK;
    int INT_WHITE = Enum.INT_WHITE;
    int INT_HIDE = Enum.INT_HIDE;
    int INT_UNDRAWN = Enum.INT_UNDRAWN;
    int INT_BLACK_TEXT_AND_LINES = Enum.INT_BLACK_TEXT_AND_LINES;

    /**
     * Enumeration value class for com.microsoft.schemas.office.office.STBWMode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_COLOR
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

        static final int INT_COLOR = 1;
        static final int INT_AUTO = 2;
        static final int INT_GRAY_SCALE = 3;
        static final int INT_LIGHT_GRAYSCALE = 4;
        static final int INT_INVERSE_GRAY = 5;
        static final int INT_GRAY_OUTLINE = 6;
        static final int INT_HIGH_CONTRAST = 7;
        static final int INT_BLACK = 8;
        static final int INT_WHITE = 9;
        static final int INT_HIDE = 10;
        static final int INT_UNDRAWN = 11;
        static final int INT_BLACK_TEXT_AND_LINES = 12;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("color", INT_COLOR),
            new Enum("auto", INT_AUTO),
            new Enum("grayScale", INT_GRAY_SCALE),
            new Enum("lightGrayscale", INT_LIGHT_GRAYSCALE),
            new Enum("inverseGray", INT_INVERSE_GRAY),
            new Enum("grayOutline", INT_GRAY_OUTLINE),
            new Enum("highContrast", INT_HIGH_CONTRAST),
            new Enum("black", INT_BLACK),
            new Enum("white", INT_WHITE),
            new Enum("hide", INT_HIDE),
            new Enum("undrawn", INT_UNDRAWN),
            new Enum("blackTextAndLines", INT_BLACK_TEXT_AND_LINES),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
