
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsPartialPutItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsPartialPutItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datacluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datamodel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyXPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pivot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startingPosition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPartialPutItem", propOrder = {
    "datacluster",
    "datamodel",
    "keyXPath",
    "overwrite",
    "pivot",
    "report",
    "source",
    "startingPosition",
    "xml"
})
public class WsPartialPutItem {

    protected String datacluster;
    protected String datamodel;
    protected String keyXPath;
    protected Boolean overwrite;
    protected String pivot;
    protected boolean report;
    protected String source;
    protected Integer startingPosition;
    protected String xml;

    /**
     * Default no-arg constructor
     * 
     */
    public WsPartialPutItem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsPartialPutItem(final String datacluster, final String datamodel, final String keyXPath, final Boolean overwrite, final String pivot, final boolean report, final String source, final Integer startingPosition, final String xml) {
        this.datacluster = datacluster;
        this.datamodel = datamodel;
        this.keyXPath = keyXPath;
        this.overwrite = overwrite;
        this.pivot = pivot;
        this.report = report;
        this.source = source;
        this.startingPosition = startingPosition;
        this.xml = xml;
    }

    /**
     * Gets the value of the datacluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatacluster() {
        return datacluster;
    }

    /**
     * Sets the value of the datacluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatacluster(String value) {
        this.datacluster = value;
    }

    /**
     * Gets the value of the datamodel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatamodel() {
        return datamodel;
    }

    /**
     * Sets the value of the datamodel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatamodel(String value) {
        this.datamodel = value;
    }

    /**
     * Gets the value of the keyXPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyXPath() {
        return keyXPath;
    }

    /**
     * Sets the value of the keyXPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyXPath(String value) {
        this.keyXPath = value;
    }

    /**
     * Gets the value of the overwrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverwrite() {
        return overwrite;
    }

    /**
     * Sets the value of the overwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

    /**
     * Gets the value of the pivot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPivot() {
        return pivot;
    }

    /**
     * Sets the value of the pivot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPivot(String value) {
        this.pivot = value;
    }

    /**
     * Gets the value of the report property.
     * 
     */
    public boolean isReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     */
    public void setReport(boolean value) {
        this.report = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the startingPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartingPosition() {
        return startingPosition;
    }

    /**
     * Sets the value of the startingPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartingPosition(Integer value) {
        this.startingPosition = value;
    }

    /**
     * Gets the value of the xml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXml() {
        return xml;
    }

    /**
     * Sets the value of the xml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXml(String value) {
        this.xml = value;
    }

}
