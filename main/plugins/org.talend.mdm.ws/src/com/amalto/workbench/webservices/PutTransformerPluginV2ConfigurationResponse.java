
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for putTransformerPluginV2ConfigurationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="putTransformerPluginV2ConfigurationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}wsString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putTransformerPluginV2ConfigurationResponse", propOrder = {
    "_return"
})
public class PutTransformerPluginV2ConfigurationResponse {

    @XmlElement(name = "return")
    protected WsString _return;

    /**
     * Default no-arg constructor
     * 
     */
    public PutTransformerPluginV2ConfigurationResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PutTransformerPluginV2ConfigurationResponse(final WsString _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WsString }
     *     
     */
    public WsString getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsString }
     *     
     */
    public void setReturn(WsString value) {
        this._return = value;
    }

}
