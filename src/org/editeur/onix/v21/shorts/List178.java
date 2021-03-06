//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:39 PM IST 
//


package org.editeur.onix.v21.shorts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List178.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List178">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A103"/>
 *     &lt;enumeration value="A104"/>
 *     &lt;enumeration value="A105"/>
 *     &lt;enumeration value="A106"/>
 *     &lt;enumeration value="A107"/>
 *     &lt;enumeration value="A111"/>
 *     &lt;enumeration value="D101"/>
 *     &lt;enumeration value="D102"/>
 *     &lt;enumeration value="D103"/>
 *     &lt;enumeration value="D104"/>
 *     &lt;enumeration value="D105"/>
 *     &lt;enumeration value="D106"/>
 *     &lt;enumeration value="D107"/>
 *     &lt;enumeration value="D108"/>
 *     &lt;enumeration value="D109"/>
 *     &lt;enumeration value="D401"/>
 *     &lt;enumeration value="D501"/>
 *     &lt;enumeration value="D502"/>
 *     &lt;enumeration value="D503"/>
 *     &lt;enumeration value="D504"/>
 *     &lt;enumeration value="E101"/>
 *     &lt;enumeration value="E105"/>
 *     &lt;enumeration value="E107"/>
 *     &lt;enumeration value="E113"/>
 *     &lt;enumeration value="E115"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List178")
@XmlEnum
public enum List178 {


    /**
     * MPEG 1/2 Audio Layer III file.
     * 
     */
    @XmlEnumValue("A103")
    A_103("A103"),

    /**
     * Waveform Audio file.
     * 
     */
    @XmlEnumValue("A104")
    A_104("A104"),

    /**
     * Proprietary RealNetworks format.
     * 
     */
    @XmlEnumValue("A105")
    A_105("A105"),

    /**
     * Windows Media Audio format.
     * 
     */
    @XmlEnumValue("A106")
    A_106("A106"),

    /**
     * Advanced Audio Coding format.
     * 
     */
    @XmlEnumValue("A107")
    A_107("A107"),

    /**
     * Audio Interchange File format.
     * 
     */
    @XmlEnumValue("A111")
    A_111("A111"),

    /**
     * Proprietary RealNetworks format. Includes Real Video packaged within a .rm RealMedia container.
     * 
     */
    @XmlEnumValue("D101")
    D_101("D101"),

    /**
     * Quicktime container format (.mov).
     * 
     */
    @XmlEnumValue("D102")
    D_102("D102"),

    /**
     * Audio Video Interleave format.
     * 
     */
    @XmlEnumValue("D103")
    D_103("D103"),

    /**
     * Windows Media Video format.
     * 
     */
    @XmlEnumValue("D104")
    D_104("D104"),

    /**
     * MPEG-4 container format (.mp4, .m4a).
     * 
     */
    @XmlEnumValue("D105")
    D_105("D105"),

    /**
     * Flash Video (.flv, .f4v).
     * 
     */
    @XmlEnumValue("D106")
    D_106("D106"),

    /**
     * ShockWave (.swf).
     * 
     */
    @XmlEnumValue("D107")
    D_107("D107"),

    /**
     *  3GPP container format (.3gp, .3g2).
     * 
     */
    @XmlEnumValue("D108")
    D_108("D108"),

    /**
     * WebM container format (includes .mkv).
     * 
     */
    @XmlEnumValue("D109")
    D_109("D109"),

    /**
     * Portable Document File format.
     * 
     */
    @XmlEnumValue("D401")
    D_401("D401"),

    /**
     * Graphic Interchange File format.
     * 
     */
    @XmlEnumValue("D501")
    D_501("D501"),

    /**
     * Joint Photographic Experts Group format.
     * 
     */
    @XmlEnumValue("D502")
    D_502("D502"),

    /**
     * Portable Network Graphics format.
     * 
     */
    @XmlEnumValue("D503")
    D_503("D503"),

    /**
     * Tagged Image File format.
     * 
     */
    @XmlEnumValue("D504")
    D_504("D504"),

    /**
     * The Open Publication Structure / OPS Container Format standard of the International Digital Publishing Forum (IDPF) [File extension .epub].
     * 
     */
    @XmlEnumValue("E101")
    E_101("E101"),

    /**
     * HyperText Mark-up Language [File extension .html, .htm].
     * 
     */
    @XmlEnumValue("E105")
    E_105("E105"),

    /**
     * Portable Document Format (ISO 32000-1:2008) [File extension .pdf].
     * 
     */
    @XmlEnumValue("E107")
    E_107("E107"),

    /**
     * Extensible Hypertext Markup Language [File extension .xhtml, .xht, .xml, .html, .htm].
     * 
     */
    @XmlEnumValue("E113")
    E_113("E113"),

    /**
     * XML Paper Specification.
     * 
     */
    @XmlEnumValue("E115")
    E_115("E115");
    private final String value;

    List178(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static List178 fromValue(String v) {
        for (List178 c: List178 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
