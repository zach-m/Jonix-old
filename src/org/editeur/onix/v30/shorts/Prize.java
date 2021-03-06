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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}g126"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}g127" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}g128" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}g129" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}g343" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/short}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Prize"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="prize"/>
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
    "g126",
    "g127",
    "g128",
    "g129",
    "g343"
})
@XmlRootElement(name = "prize")
public class Prize {

    @XmlElement(required = true)
    protected G126 g126;
    protected G127 g127;
    protected G128 g128;
    protected G129 g129;
    protected List<G343> g343;
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
     * Gets the value of the g126 property.
     * 
     * @return
     *     possible object is
     *     {@link G126 }
     *     
     */
    public G126 getG126() {
        return g126;
    }

    /**
     * Sets the value of the g126 property.
     * 
     * @param value
     *     allowed object is
     *     {@link G126 }
     *     
     */
    public void setG126(G126 value) {
        this.g126 = value;
    }

    /**
     * Gets the value of the g127 property.
     * 
     * @return
     *     possible object is
     *     {@link G127 }
     *     
     */
    public G127 getG127() {
        return g127;
    }

    /**
     * Sets the value of the g127 property.
     * 
     * @param value
     *     allowed object is
     *     {@link G127 }
     *     
     */
    public void setG127(G127 value) {
        this.g127 = value;
    }

    /**
     * Gets the value of the g128 property.
     * 
     * @return
     *     possible object is
     *     {@link G128 }
     *     
     */
    public G128 getG128() {
        return g128;
    }

    /**
     * Sets the value of the g128 property.
     * 
     * @param value
     *     allowed object is
     *     {@link G128 }
     *     
     */
    public void setG128(G128 value) {
        this.g128 = value;
    }

    /**
     * Gets the value of the g129 property.
     * 
     * @return
     *     possible object is
     *     {@link G129 }
     *     
     */
    public G129 getG129() {
        return g129;
    }

    /**
     * Sets the value of the g129 property.
     * 
     * @param value
     *     allowed object is
     *     {@link G129 }
     *     
     */
    public void setG129(G129 value) {
        this.g129 = value;
    }

    /**
     * Gets the value of the g343 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the g343 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getG343().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link G343 }
     * 
     * 
     */
    public List<G343> getG343() {
        if (g343 == null) {
            g343 = new ArrayList<G343>();
        }
        return this.g343;
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
