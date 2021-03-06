
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRolePKsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRolePKsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}wsRolePKArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRolePKsResponse", propOrder = {
    "_return"
})
public class GetRolePKsResponse {

    @XmlElement(name = "return")
    protected WsRolePKArray _return;

    /**
     * Default no-arg constructor
     * 
     */
    public GetRolePKsResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetRolePKsResponse(final WsRolePKArray _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WsRolePKArray }
     *     
     */
    public WsRolePKArray getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsRolePKArray }
     *     
     */
    public void setReturn(WsRolePKArray value) {
        this._return = value;
    }

}
