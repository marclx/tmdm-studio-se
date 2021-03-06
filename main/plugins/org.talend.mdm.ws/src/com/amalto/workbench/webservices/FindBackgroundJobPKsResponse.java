
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findBackgroundJobPKsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findBackgroundJobPKsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}wsBackgroundJobPKArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findBackgroundJobPKsResponse", propOrder = {
    "_return"
})
public class FindBackgroundJobPKsResponse {

    @XmlElement(name = "return")
    protected WsBackgroundJobPKArray _return;

    /**
     * Default no-arg constructor
     * 
     */
    public FindBackgroundJobPKsResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FindBackgroundJobPKsResponse(final WsBackgroundJobPKArray _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WsBackgroundJobPKArray }
     *     
     */
    public WsBackgroundJobPKArray getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsBackgroundJobPKArray }
     *     
     */
    public void setReturn(WsBackgroundJobPKArray value) {
        this._return = value;
    }

}
