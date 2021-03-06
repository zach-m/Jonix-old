//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:39 PM IST 
//


package org.editeur.onix.v21.shorts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b284" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}textitem"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}website" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b288"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b289" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b028" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}title" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b289"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b028" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}title" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b028"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}title" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}title" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}workidentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}contributor" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}b049" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}subject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}personassubject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b071" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b072" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}othertext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}mediafile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/short}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="ContentItem" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="contentitem" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "contentitem")
public class Contentitem {

    @XmlElementRefs({
        @XmlElementRef(name = "contributor", namespace = "http://www.editeur.org/onix/2.1/short", type = Contributor.class, required = false),
        @XmlElementRef(name = "b049", namespace = "http://www.editeur.org/onix/2.1/short", type = B049 .class, required = false),
        @XmlElementRef(name = "b288", namespace = "http://www.editeur.org/onix/2.1/short", type = B288 .class, required = false),
        @XmlElementRef(name = "b071", namespace = "http://www.editeur.org/onix/2.1/short", type = B071 .class, required = false),
        @XmlElementRef(name = "personassubject", namespace = "http://www.editeur.org/onix/2.1/short", type = Personassubject.class, required = false),
        @XmlElementRef(name = "workidentifier", namespace = "http://www.editeur.org/onix/2.1/short", type = Workidentifier.class, required = false),
        @XmlElementRef(name = "b289", namespace = "http://www.editeur.org/onix/2.1/short", type = B289 .class, required = false),
        @XmlElementRef(name = "textitem", namespace = "http://www.editeur.org/onix/2.1/short", type = Textitem.class, required = false),
        @XmlElementRef(name = "mediafile", namespace = "http://www.editeur.org/onix/2.1/short", type = Mediafile.class, required = false),
        @XmlElementRef(name = "subject", namespace = "http://www.editeur.org/onix/2.1/short", type = Subject.class, required = false),
        @XmlElementRef(name = "othertext", namespace = "http://www.editeur.org/onix/2.1/short", type = Othertext.class, required = false),
        @XmlElementRef(name = "b028", namespace = "http://www.editeur.org/onix/2.1/short", type = B028 .class, required = false),
        @XmlElementRef(name = "b284", namespace = "http://www.editeur.org/onix/2.1/short", type = B284 .class, required = false),
        @XmlElementRef(name = "website", namespace = "http://www.editeur.org/onix/2.1/short", type = Website.class, required = false),
        @XmlElementRef(name = "b072", namespace = "http://www.editeur.org/onix/2.1/short", type = B072 .class, required = false),
        @XmlElementRef(name = "title", namespace = "http://www.editeur.org/onix/2.1/short", type = Title.class, required = false)
    })
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String shortname;
    @XmlAttribute(name = "textformat")
    protected String textformat;
    @XmlAttribute(name = "textcase")
    protected String textcase;
    @XmlAttribute(name = "language")
    protected List74 language;
    @XmlAttribute(name = "transliteration")
    protected List138 transliteration;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    protected String sourcename;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "B289" is used by two different parts of a schema. See: 
     * line 1038 of file:/C:/DEV/Projects/Jonix/onix_doc/v2.1/ONIX_BookProduct_Release2.1_short.xsd
     * line 1033 of file:/C:/DEV/Projects/Jonix/onix_doc/v2.1/ONIX_BookProduct_Release2.1_short.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contributor }
     * {@link B049 }
     * {@link B288 }
     * {@link B071 }
     * {@link Personassubject }
     * {@link Workidentifier }
     * {@link B289 }
     * {@link Textitem }
     * {@link Mediafile }
     * {@link Subject }
     * {@link Othertext }
     * {@link B028 }
     * {@link Website }
     * {@link B284 }
     * {@link Title }
     * {@link B072 }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the refname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefname() {
        if (refname == null) {
            return "ContentItem";
        } else {
            return refname;
        }
    }

    /**
     * Sets the value of the refname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefname(String value) {
        this.refname = value;
    }

    /**
     * Gets the value of the shortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        if (shortname == null) {
            return "contentitem";
        } else {
            return shortname;
        }
    }

    /**
     * Sets the value of the shortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the textformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextformat() {
        if (textformat == null) {
            return "00";
        } else {
            return textformat;
        }
    }

    /**
     * Sets the value of the textformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextformat(String value) {
        this.textformat = value;
    }

    /**
     * Gets the value of the textcase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextcase() {
        if (textcase == null) {
            return "00";
        } else {
            return textcase;
        }
    }

    /**
     * Sets the value of the textcase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextcase(String value) {
        this.textcase = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link List74 }
     *     
     */
    public List74 getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link List74 }
     *     
     */
    public void setLanguage(List74 value) {
        this.language = value;
    }

    /**
     * Gets the value of the transliteration property.
     * 
     * @return
     *     possible object is
     *     {@link List138 }
     *     
     */
    public List138 getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the value of the transliteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link List138 }
     *     
     */
    public void setTransliteration(List138 value) {
        this.transliteration = value;
    }

    /**
     * Gets the value of the datestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatestamp() {
        return datestamp;
    }

    /**
     * Sets the value of the datestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatestamp(String value) {
        this.datestamp = value;
    }

    /**
     * Gets the value of the sourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcetype() {
        if (sourcetype == null) {
            return "00";
        } else {
            return sourcetype;
        }
    }

    /**
     * Sets the value of the sourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcetype(String value) {
        this.sourcetype = value;
    }

    /**
     * Gets the value of the sourcename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcename() {
        return sourcename;
    }

    /**
     * Sets the value of the sourcename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcename(String value) {
        this.sourcename = value;
    }

}
