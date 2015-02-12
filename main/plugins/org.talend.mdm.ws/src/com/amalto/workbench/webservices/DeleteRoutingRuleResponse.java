
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteRoutingRuleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteRoutingRuleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}wsRoutingRulePK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteRoutingRuleResponse", propOrder = {
    "_return"
})
public class DeleteRoutingRuleResponse {

    @XmlElement(name = "return")
    protected WsRoutingRulePK _return;

    /**
     * Default no-arg constructor
     * 
     */
    public DeleteRoutingRuleResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeleteRoutingRuleResponse(final WsRoutingRulePK _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WsRoutingRulePK }
     *     
     */
    public WsRoutingRulePK getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsRoutingRulePK }
     *     
     */
    public void setReturn(WsRoutingRulePK value) {
        this._return = value;
    }

}
