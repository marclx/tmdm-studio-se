
package com.amalto.workbench.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsPutItemWithReportArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsPutItemWithReportArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsPutItem" type="{http://www.talend.com/mdm}wsPutItemWithReport" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPutItemWithReportArray", propOrder = {
    "wsPutItem"
})
public class WsPutItemWithReportArray {

    @XmlElement(nillable = true)
    protected List<WsPutItemWithReport> wsPutItem;

    /**
     * Default no-arg constructor
     * 
     */
    public WsPutItemWithReportArray() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsPutItemWithReportArray(final List<WsPutItemWithReport> wsPutItem) {
        this.wsPutItem = wsPutItem;
    }

    /**
     * Gets the value of the wsPutItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsPutItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsPutItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsPutItemWithReport }
     * 
     * 
     */
    public List<WsPutItemWithReport> getWsPutItem() {
        if (wsPutItem == null) {
            wsPutItem = new ArrayList<WsPutItemWithReport>();
        }
        return this.wsPutItem;
    }

}
