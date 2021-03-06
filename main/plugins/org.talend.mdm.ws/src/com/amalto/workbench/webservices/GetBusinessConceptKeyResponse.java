
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBusinessConceptKeyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBusinessConceptKeyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}wsConceptKey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBusinessConceptKeyResponse", propOrder = {
    "_return"
})
public class GetBusinessConceptKeyResponse {

    @XmlElement(name = "return")
    protected WsConceptKey _return;

    /**
     * Default no-arg constructor
     * 
     */
    public GetBusinessConceptKeyResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetBusinessConceptKeyResponse(final WsConceptKey _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WsConceptKey }
     *     
     */
    public WsConceptKey getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsConceptKey }
     *     
     */
    public void setReturn(WsConceptKey value) {
        this._return = value;
    }

}
