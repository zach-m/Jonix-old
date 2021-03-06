//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:07:00 PM IST 
//


package org.editeur.onix.v30.shorts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List21.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List21">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABR"/>
 *     &lt;enumeration value="ACT"/>
 *     &lt;enumeration value="ADP"/>
 *     &lt;enumeration value="ALT"/>
 *     &lt;enumeration value="ANN"/>
 *     &lt;enumeration value="BLL"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="CMB"/>
 *     &lt;enumeration value="CRI"/>
 *     &lt;enumeration value="CSP"/>
 *     &lt;enumeration value="DGO"/>
 *     &lt;enumeration value="ENH"/>
 *     &lt;enumeration value="ENL"/>
 *     &lt;enumeration value="EXP"/>
 *     &lt;enumeration value="FAC"/>
 *     &lt;enumeration value="FST"/>
 *     &lt;enumeration value="ILL"/>
 *     &lt;enumeration value="LTE"/>
 *     &lt;enumeration value="MCP"/>
 *     &lt;enumeration value="MDT"/>
 *     &lt;enumeration value="MLL"/>
 *     &lt;enumeration value="NED"/>
 *     &lt;enumeration value="NUM"/>
 *     &lt;enumeration value="PRB"/>
 *     &lt;enumeration value="REV"/>
 *     &lt;enumeration value="SCH"/>
 *     &lt;enumeration value="SMP"/>
 *     &lt;enumeration value="SPE"/>
 *     &lt;enumeration value="STU"/>
 *     &lt;enumeration value="TCH"/>
 *     &lt;enumeration value="UBR"/>
 *     &lt;enumeration value="ULP"/>
 *     &lt;enumeration value="UXP"/>
 *     &lt;enumeration value="VAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List21")
@XmlEnum
public enum List21 {


    /**
     * Content has been shortened: use for abridged, shortened, concise, condensed.
     * 
     */
    ABR,

    /**
     * Version of a play or script intended for use of those directly involved in a production, usually including full stage directions in addition to the text of the script.
     * 
     */
    ACT,

    /**
     * Content has been adapted to serve a different purpose or audience, or from one medium to another: use for dramatization, novelization etc. Use <EditionStatement> to describe the exact nature of the adaptation.
     * 
     */
    ADP,

    /**
     * Do not use. This code is now DEPRECATED, but is retained in the list for reasons of backwards compatibility.
     * 
     */
    ALT,

    /**
     * Content is augmented by the addition of notes.
     * 
     */
    ANN,

    /**
     * Both languages should be specified in the �Language� group. Use MLL for an edition in more than two languages.
     * 
     */
    BLL,

    /**
     * Braille edition.
     * 
     */
    BRL,

    /**
     * An edition in which two or more works also published separately are combined in a single volume; AKA �omnibus� edition.
     * 
     */
    CMB,

    /**
     * Content includes critical commentary on the text.
     * 
     */
    CRI,

    /**
     * Content was compiled for a specified educational course.
     * 
     */
    CSP,

    /**
     * A digital product which has no print counterpart and is not expected to have a print counterpart.
     * 
     */
    DGO,

    /**
     * Use for e-publications that have been enhanced with additional text, speech, other audio, video, interactive or other content.
     * 
     */
    ENH,

    /**
     * Content has been enlarged or expanded from that of a previous edition.
     * 
     */
    ENL,

    /**
     * �Offensive� content has been removed.
     * 
     */
    EXP,

    /**
     * Exact reproduction of the content and format of a previous edition.
     * 
     */
    FAC,

    /**
     * A collection of writings published in honor of a person, an institution or a society.
     * 
     */
    FST,

    /**
     * Content includes extensive illustrations which are not part of other editions.
     * 
     */
    ILL,

    /**
     * Large print edition, print sizes 14 to 19 pt � see also ULP.
     * 
     */
    LTE,

    /**
     * A printed edition in a type size too small to be read without a magnifying glass.
     * 
     */
    MCP,

    /**
     * An edition published to coincide with the release of a film, TV program, or electronic game based on the same work. Use <EditionStatement> to describe the exact nature of the tie-in.
     * 
     */
    MDT,

    /**
     * All languages should be specified in the �Language� group. Use BLL for a bilingual edition.
     * 
     */
    MLL,

    /**
     * Where no other information is given, or no other coded type is applicable.
     * 
     */
    NED,

    /**
     * A limited edition in which each copy is individually numbered.
     * 
     */
    NUM,

    /**
     * In the US, a book that was previously bound, normally as a paperback, and has been rebound with a library-quality hardcover binding by a supplier other than the original publisher. See also the <Publisher> and <RelatedProduct> composites for other aspects of the treatment of prebound editions in ONIX.
     * 
     */
    PRB,

    /**
     * Content has been revised from that of a previous edition.
     * 
     */
    REV,

    /**
     * An edition intended specifically for use in schools.
     * 
     */
    SCH,

    /**
     * An edition that uses simplified language (Finnish �Selkokirja�).
     * 
     */
    SMP,

    /**
     * Use for anniversary, collectors�, de luxe, gift, limited, numbered, autographed edition. Use <EditionStatement> to describe the exact nature of the special edition.
     * 
     */
    SPE,

    /**
     * Where a text is available in both student and teacher�s editions.
     * 
     */
    STU,

    /**
     * Where a text is available in both student and teacher�s editions; use also for instructor�s or leader�s editions.
     * 
     */
    TCH,

    /**
     * Where a title has also been published in an abridged edition; also for audiobooks, regardless of whether an abridged audio version also exists.
     * 
     */
    UBR,

    /**
     * For print sizes 20pt and above, and with typefaces designed for the visually impaired � see also LTE.
     * 
     */
    ULP,

    /**
     * Content previously considered �offensive� has been restored.
     * 
     */
    UXP,

    /**
     * Content includes notes by various commentators, and/or includes and compares several variant texts of the same work.
     * 
     */
    VAR;

    public String value() {
        return name();
    }

    public static List21 fromValue(String v) {
        return valueOf(v);
    }

}
