
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTransformerV2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTransformerV2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}wsTransformerV2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransformerV2Response", propOrder = {
    "_return"
})
public class GetTransformerV2Response {

    @XmlElement(name = "return")
    protected WsTransformerV2 _return;

    /**
     * Default no-arg constructor
     * 
     */
    public GetTransformerV2Response() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetTransformerV2Response(final WsTransformerV2 _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WsTransformerV2 }
     *     
     */
    public WsTransformerV2 getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsTransformerV2 }
     *     
     */
    public void setReturn(WsTransformerV2 value) {
        this._return = value;
    }

}
