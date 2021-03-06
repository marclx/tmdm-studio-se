
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsExtractUsingTransformerThruView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsExtractUsingTransformerThruView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="spellTreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="whereItem" type="{http://www.talend.com/mdm}wsWhereItem" minOccurs="0"/>
 *         &lt;element name="wsDataClusterPK" type="{http://www.talend.com/mdm}wsDataClusterPK" minOccurs="0"/>
 *         &lt;element name="wsTransformerPK" type="{http://www.talend.com/mdm}wsTransformerPK" minOccurs="0"/>
 *         &lt;element name="wsViewPK" type="{http://www.talend.com/mdm}wsViewPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsExtractUsingTransformerThruView", propOrder = {
    "direction",
    "maxItems",
    "orderBy",
    "skip",
    "spellTreshold",
    "whereItem",
    "wsDataClusterPK",
    "wsTransformerPK",
    "wsViewPK"
})
public class WsExtractUsingTransformerThruView {

    protected String direction;
    protected int maxItems;
    protected String orderBy;
    protected int skip;
    protected int spellTreshold;
    protected WsWhereItem whereItem;
    protected WsDataClusterPK wsDataClusterPK;
    protected WsTransformerPK wsTransformerPK;
    protected WsViewPK wsViewPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WsExtractUsingTransformerThruView() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsExtractUsingTransformerThruView(final String direction, final int maxItems, final String orderBy, final int skip, final int spellTreshold, final WsWhereItem whereItem, final WsDataClusterPK wsDataClusterPK, final WsTransformerPK wsTransformerPK, final WsViewPK wsViewPK) {
        this.direction = direction;
        this.maxItems = maxItems;
        this.orderBy = orderBy;
        this.skip = skip;
        this.spellTreshold = spellTreshold;
        this.whereItem = whereItem;
        this.wsDataClusterPK = wsDataClusterPK;
        this.wsTransformerPK = wsTransformerPK;
        this.wsViewPK = wsViewPK;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the maxItems property.
     * 
     */
    public int getMaxItems() {
        return maxItems;
    }

    /**
     * Sets the value of the maxItems property.
     * 
     */
    public void setMaxItems(int value) {
        this.maxItems = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the skip property.
     * 
     */
    public int getSkip() {
        return skip;
    }

    /**
     * Sets the value of the skip property.
     * 
     */
    public void setSkip(int value) {
        this.skip = value;
    }

    /**
     * Gets the value of the spellTreshold property.
     * 
     */
    public int getSpellTreshold() {
        return spellTreshold;
    }

    /**
     * Sets the value of the spellTreshold property.
     * 
     */
    public void setSpellTreshold(int value) {
        this.spellTreshold = value;
    }

    /**
     * Gets the value of the whereItem property.
     * 
     * @return
     *     possible object is
     *     {@link WsWhereItem }
     *     
     */
    public WsWhereItem getWhereItem() {
        return whereItem;
    }

    /**
     * Sets the value of the whereItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsWhereItem }
     *     
     */
    public void setWhereItem(WsWhereItem value) {
        this.whereItem = value;
    }

    /**
     * Gets the value of the wsDataClusterPK property.
     * 
     * @return
     *     possible object is
     *     {@link WsDataClusterPK }
     *     
     */
    public WsDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }

    /**
     * Sets the value of the wsDataClusterPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDataClusterPK }
     *     
     */
    public void setWsDataClusterPK(WsDataClusterPK value) {
        this.wsDataClusterPK = value;
    }

    /**
     * Gets the value of the wsTransformerPK property.
     * 
     * @return
     *     possible object is
     *     {@link WsTransformerPK }
     *     
     */
    public WsTransformerPK getWsTransformerPK() {
        return wsTransformerPK;
    }

    /**
     * Sets the value of the wsTransformerPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsTransformerPK }
     *     
     */
    public void setWsTransformerPK(WsTransformerPK value) {
        this.wsTransformerPK = value;
    }

    /**
     * Gets the value of the wsViewPK property.
     * 
     * @return
     *     possible object is
     *     {@link WsViewPK }
     *     
     */
    public WsViewPK getWsViewPK() {
        return wsViewPK;
    }

    /**
     * Sets the value of the wsViewPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsViewPK }
     *     
     */
    public void setWsViewPK(WsViewPK value) {
        this.wsViewPK = value;
    }

}
