
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoutingOrderV2SByCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoutingOrderV2SByCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}wsGetRoutingOrderV2SByCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoutingOrderV2SByCriteria", propOrder = {
    "arg0"
})
public class GetRoutingOrderV2SByCriteria {

    protected WsGetRoutingOrderV2SByCriteria arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public GetRoutingOrderV2SByCriteria() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetRoutingOrderV2SByCriteria(final WsGetRoutingOrderV2SByCriteria arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WsGetRoutingOrderV2SByCriteria }
     *     
     */
    public WsGetRoutingOrderV2SByCriteria getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsGetRoutingOrderV2SByCriteria }
     *     
     */
    public void setArg0(WsGetRoutingOrderV2SByCriteria value) {
        this.arg0 = value;
    }

}
