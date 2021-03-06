
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extractUsingTransformerThruViewResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extractUsingTransformerThruViewResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}wsPipeline" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extractUsingTransformerThruViewResponse", propOrder = {
    "_return"
})
public class ExtractUsingTransformerThruViewResponse {

    @XmlElement(name = "return")
    protected WsPipeline _return;

    /**
     * Default no-arg constructor
     * 
     */
    public ExtractUsingTransformerThruViewResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ExtractUsingTransformerThruViewResponse(final WsPipeline _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WsPipeline }
     *     
     */
    public WsPipeline getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPipeline }
     *     
     */
    public void setReturn(WsPipeline value) {
        this._return = value;
    }

}
