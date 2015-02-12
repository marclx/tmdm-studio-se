
package com.amalto.workbench.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isTransformerActive" type="{http://www.talend.com/mdm}wsBoolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchableBusinessElements" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transformerPK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="viewableBusinessElements" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="whereConditions" type="{http://www.talend.com/mdm}wsWhereCondition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsView", propOrder = {
    "description",
    "isTransformerActive",
    "name",
    "searchableBusinessElements",
    "transformerPK",
    "viewableBusinessElements",
    "whereConditions"
})
public class WsView {

    protected String description;
    protected WsBoolean isTransformerActive;
    protected String name;
    @XmlElement(nillable = true)
    protected List<String> searchableBusinessElements;
    protected String transformerPK;
    @XmlElement(nillable = true)
    protected List<String> viewableBusinessElements;
    @XmlElement(nillable = true)
    protected List<WsWhereCondition> whereConditions;

    /**
     * Default no-arg constructor
     * 
     */
    public WsView() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsView(final String description, final WsBoolean isTransformerActive, final String name, final List<String> searchableBusinessElements, final String transformerPK, final List<String> viewableBusinessElements, final List<WsWhereCondition> whereConditions) {
        this.description = description;
        this.isTransformerActive = isTransformerActive;
        this.name = name;
        this.searchableBusinessElements = searchableBusinessElements;
        this.transformerPK = transformerPK;
        this.viewableBusinessElements = viewableBusinessElements;
        this.whereConditions = whereConditions;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isTransformerActive property.
     * 
     * @return
     *     possible object is
     *     {@link WsBoolean }
     *     
     */
    public WsBoolean getIsTransformerActive() {
        return isTransformerActive;
    }

    /**
     * Sets the value of the isTransformerActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsBoolean }
     *     
     */
    public void setIsTransformerActive(WsBoolean value) {
        this.isTransformerActive = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the searchableBusinessElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchableBusinessElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchableBusinessElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSearchableBusinessElements() {
        if (searchableBusinessElements == null) {
            searchableBusinessElements = new ArrayList<String>();
        }
        return this.searchableBusinessElements;
    }

    /**
     * Gets the value of the transformerPK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerPK() {
        return transformerPK;
    }

    /**
     * Sets the value of the transformerPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerPK(String value) {
        this.transformerPK = value;
    }

    /**
     * Gets the value of the viewableBusinessElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewableBusinessElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewableBusinessElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getViewableBusinessElements() {
        if (viewableBusinessElements == null) {
            viewableBusinessElements = new ArrayList<String>();
        }
        return this.viewableBusinessElements;
    }

    /**
     * Gets the value of the whereConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whereConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhereConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsWhereCondition }
     * 
     * 
     */
    public List<WsWhereCondition> getWhereConditions() {
        if (whereConditions == null) {
            whereConditions = new ArrayList<WsWhereCondition>();
        }
        return this.whereConditions;
    }

}
