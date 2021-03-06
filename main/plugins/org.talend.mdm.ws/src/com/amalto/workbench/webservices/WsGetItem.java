
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsGetItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsGetItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsItemPK" type="{http://www.talend.com/mdm}wsItemPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGetItem", propOrder = {
    "wsItemPK"
})
public class WsGetItem {

    protected WsItemPK wsItemPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WsGetItem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsGetItem(final WsItemPK wsItemPK) {
        this.wsItemPK = wsItemPK;
    }

    /**
     * Gets the value of the wsItemPK property.
     * 
     * @return
     *     possible object is
     *     {@link WsItemPK }
     *     
     */
    public WsItemPK getWsItemPK() {
        return wsItemPK;
    }

    /**
     * Sets the value of the wsItemPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsItemPK }
     *     
     */
    public void setWsItemPK(WsItemPK value) {
        this.wsItemPK = value;
    }

}
