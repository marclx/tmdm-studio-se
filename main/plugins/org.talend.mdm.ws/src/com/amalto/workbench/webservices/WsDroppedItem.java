
package com.amalto.workbench.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsDroppedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsDroppedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ids" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="insertionTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="insertionUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "wsDroppedItem", propOrder = {
    "conceptName",
    "ids",
    "insertionTime",
    "insertionUserName",
    "partPath",
    "projection",
    "uniqueId",
    "wsDataClusterPK"
})
public class WsDroppedItem {

    protected String conceptName;
    @XmlElement(nillable = true)
    protected List<String> ids;
    protected Long insertionTime;
    protected String insertionUserName;
    protected String partPath;
    protected String projection;
    protected String uniqueId;
    protected WsDataClusterPK wsDataClusterPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WsDroppedItem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsDroppedItem(final String conceptName, final List<String> ids, final Long insertionTime, final String insertionUserName, final String partPath, final String projection, final String uniqueId, final WsDataClusterPK wsDataClusterPK) {
        this.conceptName = conceptName;
        this.ids = ids;
        this.insertionTime = insertionTime;
        this.insertionUserName = insertionUserName;
        this.partPath = partPath;
        this.projection = projection;
        this.uniqueId = uniqueId;
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
     * Gets the value of the ids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIds() {
        if (ids == null) {
            ids = new ArrayList<String>();
        }
        return this.ids;
    }

    /**
     * Gets the value of the insertionTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsertionTime() {
        return insertionTime;
    }

    /**
     * Sets the value of the insertionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsertionTime(Long value) {
        this.insertionTime = value;
    }

    /**
     * Gets the value of the insertionUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertionUserName() {
        return insertionUserName;
    }

    /**
     * Sets the value of the insertionUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertionUserName(String value) {
        this.insertionUserName = value;
    }

    /**
     * Gets the value of the partPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartPath() {
        return partPath;
    }

    /**
     * Sets the value of the partPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartPath(String value) {
        this.partPath = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjection() {
        return projection;
    }

    /**
     * Sets the value of the projection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjection(String value) {
        this.projection = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
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
