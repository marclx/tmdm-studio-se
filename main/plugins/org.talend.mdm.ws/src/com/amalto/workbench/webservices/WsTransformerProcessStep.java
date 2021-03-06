
package com.amalto.workbench.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsTransformerProcessStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsTransformerProcessStep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inputMappings" type="{http://www.talend.com/mdm}wsTransformerVariablesMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputMappings" type="{http://www.talend.com/mdm}wsTransformerVariablesMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pluginJNDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsTransformerProcessStep", propOrder = {
    "description",
    "disabled",
    "inputMappings",
    "outputMappings",
    "parameters",
    "pluginJNDI"
})
public class WsTransformerProcessStep {

    protected String description;
    protected Boolean disabled;
    @XmlElement(nillable = true)
    protected List<WsTransformerVariablesMapping> inputMappings;
    @XmlElement(nillable = true)
    protected List<WsTransformerVariablesMapping> outputMappings;
    protected String parameters;
    protected String pluginJNDI;

    /**
     * Default no-arg constructor
     * 
     */
    public WsTransformerProcessStep() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsTransformerProcessStep(final String description, final Boolean disabled, final List<WsTransformerVariablesMapping> inputMappings, final List<WsTransformerVariablesMapping> outputMappings, final String parameters, final String pluginJNDI) {
        this.description = description;
        this.disabled = disabled;
        this.inputMappings = inputMappings;
        this.outputMappings = outputMappings;
        this.parameters = parameters;
        this.pluginJNDI = pluginJNDI;
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
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the inputMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsTransformerVariablesMapping }
     * 
     * 
     */
    public List<WsTransformerVariablesMapping> getInputMappings() {
        if (inputMappings == null) {
            inputMappings = new ArrayList<WsTransformerVariablesMapping>();
        }
        return this.inputMappings;
    }

    /**
     * Gets the value of the outputMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsTransformerVariablesMapping }
     * 
     * 
     */
    public List<WsTransformerVariablesMapping> getOutputMappings() {
        if (outputMappings == null) {
            outputMappings = new ArrayList<WsTransformerVariablesMapping>();
        }
        return this.outputMappings;
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
     * Gets the value of the pluginJNDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginJNDI() {
        return pluginJNDI;
    }

    /**
     * Sets the value of the pluginJNDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginJNDI(String value) {
        this.pluginJNDI = value;
    }

}
