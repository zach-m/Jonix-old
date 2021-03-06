//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:07:00 PM IST 
//


package org.editeur.onix.v30.shorts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x425" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b067"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b171" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b068" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b069" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b070" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/short}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Subject"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="subject"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "x425",
    "b067",
    "b171",
    "b068",
    "b069",
    "b070"
})
@XmlRootElement(name = "subject")
public class Subject {

    protected X425 x425;
    @XmlElement(required = true)
    protected B067 b067;
    protected B171 b171;
    protected B068 b068;
    protected B069 b069;
    protected List<B070> b070;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shortname;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourcename;

    /**
     * Gets the value of the x425 property.
     * 
     * @return
     *     possible object is
     *     {@link X425 }
     *     
     */
    public X425 getX425() {
        return x425;
    }

    /**
     * Sets the value of the x425 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X425 }
     *     
     */
    public void setX425(X425 value) {
        this.x425 = value;
    }

    /**
     * Gets the value of the b067 property.
     * 
     * @return
     *     possible object is
     *     {@link B067 }
     *     
     */
    public B067 getB067() {
        return b067;
    }

    /**
     * Sets the value of the b067 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B067 }
     *     
     */
    public void setB067(B067 value) {
        this.b067 = value;
    }

    /**
     * Gets the value of the b171 property.
     * 
     * @return
     *     possible object is
     *     {@link B171 }
     *     
     */
    public B171 getB171() {
        return b171;
    }

    /**
     * Sets the value of the b171 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B171 }
     *     
     */
    public void setB171(B171 value) {
        this.b171 = value;
    }

    /**
     * Gets the value of the b068 property.
     * 
     * @return
     *     possible object is
     *     {@link B068 }
     *     
     */
    public B068 getB068() {
        return b068;
    }

    /**
     * Sets the value of the b068 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B068 }
     *     
     */
    public void setB068(B068 value) {
        this.b068 = value;
    }

    /**
     * Gets the value of the b069 property.
     * 
     * @return
     *     possible object is
     *     {@link B069 }
     *     
     */
    public B069 getB069() {
        return b069;
    }

    /**
     * Sets the value of the b069 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B069 }
     *     
     */
    public void setB069(B069 value) {
        this.b069 = value;
    }

    /**
     * Gets the value of the b070 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the b070 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB070().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B070 }
     * 
     * 
     */
    public List<B070> getB070() {
        if (b070 == null) {
            b070 = new ArrayList<B070>();
        }
        return this.b070;
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
        return refname;
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
        return shortname;
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
        return sourcetype;
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
