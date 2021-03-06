
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsGetItemsByCustomFKFilters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsGetItemsByCustomFKFilters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="injectedXpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="viewablePaths" type="{http://www.talend.com/mdm}wsStringArray" minOccurs="0"/>
 *         &lt;element name="whereItem" type="{http://www.talend.com/mdm}wsWhereItem" minOccurs="0"/>
 *         &lt;element name="wsDataClusterPK" type="{http://www.talend.com/mdm}wsDataClusterPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGetItemsByCustomFKFilters", propOrder = {
    "conceptName",
    "direction",
    "injectedXpath",
    "maxItems",
    "orderBy",
    "returnCount",
    "skip",
    "viewablePaths",
    "whereItem",
    "wsDataClusterPK"
})
public class WsGetItemsByCustomFKFilters {

    protected String conceptName;
    protected String direction;
    protected String injectedXpath;
    protected int maxItems;
    protected String orderBy;
    protected boolean returnCount;
    protected int skip;
    protected WsStringArray viewablePaths;
    protected WsWhereItem whereItem;
    protected WsDataClusterPK wsDataClusterPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WsGetItemsByCustomFKFilters() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsGetItemsByCustomFKFilters(final String conceptName, final String direction, final String injectedXpath, final int maxItems, final String orderBy, final boolean returnCount, final int skip, final WsStringArray viewablePaths, final WsWhereItem whereItem, final WsDataClusterPK wsDataClusterPK) {
        this.conceptName = conceptName;
        this.direction = direction;
        this.injectedXpath = injectedXpath;
        this.maxItems = maxItems;
        this.orderBy = orderBy;
        this.returnCount = returnCount;
        this.skip = skip;
        this.viewablePaths = viewablePaths;
        this.whereItem = whereItem;
        this.wsDataClusterPK = wsDataClusterPK;
    }

    /**
     * Gets the value of the conceptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptName() {
        return conceptName;
    }

    /**
     * Sets the value of the conceptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptName(String value) {
        this.conceptName = value;
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
     * Gets the value of the injectedXpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInjectedXpath() {
        return injectedXpath;
    }

    /**
     * Sets the value of the injectedXpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInjectedXpath(String value) {
        this.injectedXpath = value;
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
     * Gets the value of the returnCount property.
     * 
     */
    public boolean isReturnCount() {
        return returnCount;
    }

    /**
     * Sets the value of the returnCount property.
     * 
     */
    public void setReturnCount(boolean value) {
        this.returnCount = value;
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
     * Gets the value of the viewablePaths property.
     * 
     * @return
     *     possible object is
     *     {@link WsStringArray }
     *     
     */
    public WsStringArray getViewablePaths() {
        return viewablePaths;
    }

    /**
     * Sets the value of the viewablePaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsStringArray }
     *     
     */
    public void setViewablePaths(WsStringArray value) {
        this.viewablePaths = value;
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

}
