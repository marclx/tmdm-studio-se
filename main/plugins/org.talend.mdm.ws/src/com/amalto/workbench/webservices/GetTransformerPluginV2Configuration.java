
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTransformerPluginV2Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTransformerPluginV2Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}wsTransformerPluginV2GetConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransformerPluginV2Configuration", propOrder = {
    "arg0"
})
public class GetTransformerPluginV2Configuration {

    protected WsTransformerPluginV2GetConfiguration arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public GetTransformerPluginV2Configuration() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetTransformerPluginV2Configuration(final WsTransformerPluginV2GetConfiguration arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WsTransformerPluginV2GetConfiguration }
     *     
     */
    public WsTransformerPluginV2GetConfiguration getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsTransformerPluginV2GetConfiguration }
     *     
     */
    public void setArg0(WsTransformerPluginV2GetConfiguration value) {
        this.arg0 = value;
    }

}
