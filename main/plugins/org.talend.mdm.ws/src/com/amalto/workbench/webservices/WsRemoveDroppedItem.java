
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsRemoveDroppedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsRemoveDroppedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsDroppedItemPK" type="{http://www.talend.com/mdm}wsDroppedItemPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsRemoveDroppedItem", propOrder = {
    "wsDroppedItemPK"
})
public class WsRemoveDroppedItem {

    protected WsDroppedItemPK wsDroppedItemPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WsRemoveDroppedItem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsRemoveDroppedItem(final WsDroppedItemPK wsDroppedItemPK) {
        this.wsDroppedItemPK = wsDroppedItemPK;
    }

    /**
     * Gets the value of the wsDroppedItemPK property.
     * 
     * @return
     *     possible object is
     *     {@link WsDroppedItemPK }
     *     
     */
    public WsDroppedItemPK getWsDroppedItemPK() {
        return wsDroppedItemPK;
    }

    /**
     * Sets the value of the wsDroppedItemPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDroppedItemPK }
     *     
     */
    public void setWsDroppedItemPK(WsDroppedItemPK value) {
        this.wsDroppedItemPK = value;
    }

}
