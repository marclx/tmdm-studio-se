
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkServiceConfigurationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkServiceConfigurationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}wsCheckServiceConfigResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkServiceConfigurationResponse", propOrder = {
    "_return"
})
public class CheckServiceConfigurationResponse {

    @XmlElement(name = "return")
    protected WsCheckServiceConfigResponse _return;

    /**
     * Default no-arg constructor
     * 
     */
    public CheckServiceConfigurationResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CheckServiceConfigurationResponse(final WsCheckServiceConfigResponse _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WsCheckServiceConfigResponse }
     *     
     */
    public WsCheckServiceConfigResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCheckServiceConfigResponse }
     *     
     */
    public void setReturn(WsCheckServiceConfigResponse value) {
        this._return = value;
    }

}
