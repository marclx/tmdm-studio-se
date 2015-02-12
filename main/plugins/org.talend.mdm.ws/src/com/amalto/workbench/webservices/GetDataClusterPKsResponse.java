
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDataClusterPKsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDataClusterPKsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.talend.com/mdm}wsDataClusterPKArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDataClusterPKsResponse", propOrder = {
    "_return"
})
public class GetDataClusterPKsResponse {

    @XmlElement(name = "return")
    protected WsDataClusterPKArray _return;

    /**
     * Default no-arg constructor
     * 
     */
    public GetDataClusterPKsResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetDataClusterPKsResponse(final WsDataClusterPKArray _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WsDataClusterPKArray }
     *     
     */
    public WsDataClusterPKArray getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDataClusterPKArray }
     *     
     */
    public void setReturn(WsDataClusterPKArray value) {
        this._return = value;
    }

}
