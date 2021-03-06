
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTransformerPluginV2DetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTransformerPluginV2DetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}wsTransformerPluginV2Details" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransformerPluginV2DetailsResponse", propOrder = {
    "_return"
})
public class GetTransformerPluginV2DetailsResponse {

    @XmlElement(name = "return")
    protected WsTransformerPluginV2Details _return;

    /**
     * Default no-arg constructor
     * 
     */
    public GetTransformerPluginV2DetailsResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetTransformerPluginV2DetailsResponse(final WsTransformerPluginV2Details _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WsTransformerPluginV2Details }
     *     
     */
    public WsTransformerPluginV2Details getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsTransformerPluginV2Details }
     *     
     */
    public void setReturn(WsTransformerPluginV2Details value) {
        this._return = value;
    }

}
