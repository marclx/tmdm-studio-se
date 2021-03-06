
package com.amalto.workbench.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsOutputDecisionTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsOutputDecisionTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="decisions" type="{http://www.talend.com/mdm}wsProcessBytesUsingTransformerWsOutputDecisionTableDecisions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsOutputDecisionTable", propOrder = {
    "decisions"
})
public class WsOutputDecisionTable {

    @XmlElement(nillable = true)
    protected List<WsProcessBytesUsingTransformerWsOutputDecisionTableDecisions> decisions;

    /**
     * Default no-arg constructor
     * 
     */
    public WsOutputDecisionTable() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsOutputDecisionTable(final List<WsProcessBytesUsingTransformerWsOutputDecisionTableDecisions> decisions) {
        this.decisions = decisions;
    }

    /**
     * Gets the value of the decisions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProcessBytesUsingTransformerWsOutputDecisionTableDecisions }
     * 
     * 
     */
    public List<WsProcessBytesUsingTransformerWsOutputDecisionTableDecisions> getDecisions() {
        if (decisions == null) {
            decisions = new ArrayList<WsProcessBytesUsingTransformerWsOutputDecisionTableDecisions>();
        }
        return this.decisions;
    }

}
