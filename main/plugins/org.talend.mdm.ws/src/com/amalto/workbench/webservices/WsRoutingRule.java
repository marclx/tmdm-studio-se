
package com.amalto.workbench.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsRoutingRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsRoutingRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="concept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executeOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceJNDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="synchronous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wsRoutingRuleExpressions" type="{http://www.talend.com/mdm}wsRoutingRuleExpression" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsRoutingRule", propOrder = {
    "concept",
    "condition",
    "deactive",
    "description",
    "executeOrder",
    "name",
    "parameters",
    "serviceJNDI",
    "synchronous",
    "wsRoutingRuleExpressions"
})
public class WsRoutingRule {

    protected String concept;
    protected String condition;
    protected Boolean deactive;
    protected String description;
    protected int executeOrder;
    protected String name;
    protected String parameters;
    protected String serviceJNDI;
    protected boolean synchronous;
    @XmlElement(nillable = true)
    protected List<WsRoutingRuleExpression> wsRoutingRuleExpressions;

    /**
     * Default no-arg constructor
     * 
     */
    public WsRoutingRule() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsRoutingRule(final String concept, final String condition, final Boolean deactive, final String description, final int executeOrder, final String name, final String parameters, final String serviceJNDI, final boolean synchronous, final List<WsRoutingRuleExpression> wsRoutingRuleExpressions) {
        this.concept = concept;
        this.condition = condition;
        this.deactive = deactive;
        this.description = description;
        this.executeOrder = executeOrder;
        this.name = name;
        this.parameters = parameters;
        this.serviceJNDI = serviceJNDI;
        this.synchronous = synchronous;
        this.wsRoutingRuleExpressions = wsRoutingRuleExpressions;
    }

    /**
     * Gets the value of the concept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcept() {
        return concept;
    }

    /**
     * Sets the value of the concept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcept(String value) {
        this.concept = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the deactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeactive() {
        return deactive;
    }

    /**
     * Sets the value of the deactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeactive(Boolean value) {
        this.deactive = value;
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
     * Gets the value of the executeOrder property.
     * 
     */
    public int getExecuteOrder() {
        return executeOrder;
    }

    /**
     * Sets the value of the executeOrder property.
     * 
     */
    public void setExecuteOrder(int value) {
        this.executeOrder = value;
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
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameters(String value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the serviceJNDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceJNDI() {
        return serviceJNDI;
    }

    /**
     * Sets the value of the serviceJNDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceJNDI(String value) {
        this.serviceJNDI = value;
    }

    /**
     * Gets the value of the synchronous property.
     * 
     */
    public boolean isSynchronous() {
        return synchronous;
    }

    /**
     * Sets the value of the synchronous property.
     * 
     */
    public void setSynchronous(boolean value) {
        this.synchronous = value;
    }

    /**
     * Gets the value of the wsRoutingRuleExpressions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsRoutingRuleExpressions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsRoutingRuleExpressions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsRoutingRuleExpression }
     * 
     * 
     */
    public List<WsRoutingRuleExpression> getWsRoutingRuleExpressions() {
        if (wsRoutingRuleExpressions == null) {
            wsRoutingRuleExpressions = new ArrayList<WsRoutingRuleExpression>();
        }
        return this.wsRoutingRuleExpressions;
    }

}
