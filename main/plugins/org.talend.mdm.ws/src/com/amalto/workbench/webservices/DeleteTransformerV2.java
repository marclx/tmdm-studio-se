
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteTransformerV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteTransformerV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}wsDeleteTransformerV2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteTransformerV2", propOrder = {
    "arg0"
})
public class DeleteTransformerV2 {

    protected WsDeleteTransformerV2 arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public DeleteTransformerV2() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeleteTransformerV2(final WsDeleteTransformerV2 arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WsDeleteTransformerV2 }
     *     
     */
    public WsDeleteTransformerV2 getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDeleteTransformerV2 }
     *     
     */
    public void setArg0(WsDeleteTransformerV2 value) {
        this.arg0 = value;
    }

}
