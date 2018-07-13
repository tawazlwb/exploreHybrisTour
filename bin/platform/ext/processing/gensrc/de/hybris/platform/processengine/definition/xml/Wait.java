//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.13 at 11:44:39 AM CEST 
//


package de.hybris.platform.processengine.definition.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wait complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wait">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="event" type="{http://www.hybris.de/xsd/processdefinition}name"/>
 *           &lt;element name="case" type="{http://www.hybris.de/xsd/processdefinition}case"/>
 *         &lt;/choice>
 *         &lt;element name="timeout" type="{http://www.hybris.de/xsd/processdefinition}timeout" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.hybris.de/xsd/processdefinition}nodeAttributes"/>
 *       &lt;attribute name="then" type="{http://www.hybris.de/xsd/processdefinition}name" />
 *       &lt;attribute name="prependProcessCode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wait", propOrder = {
    "event",
    "_case",
    "timeout"
})
public class Wait {

    protected String event;
    @XmlElement(name = "case")
    protected Case _case;
    protected Timeout timeout;
    @XmlAttribute(name = "then")
    protected String then;
    @XmlAttribute(name = "prependProcessCode")
    protected Boolean prependProcessCode;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case }
     *     
     */
    public Case getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case }
     *     
     */
    public void setCase(Case value) {
        this._case = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Timeout }
     *     
     */
    public Timeout getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timeout }
     *     
     */
    public void setTimeout(Timeout value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the then property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThen() {
        return then;
    }

    /**
     * Sets the value of the then property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThen(String value) {
        this.then = value;
    }

    /**
     * Gets the value of the prependProcessCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrependProcessCode() {
        if (prependProcessCode == null) {
            return true;
        } else {
            return prependProcessCode.booleanValue();
        }
    }

    /**
     * Sets the value of the prependProcessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrependProcessCode(Boolean value) {
        this.prependProcessCode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
