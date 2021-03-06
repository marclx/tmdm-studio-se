
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeTransformerV2AsJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeTransformerV2AsJob">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}wsExecuteTransformerV2AsJob" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeTransformerV2AsJob", propOrder = {
    "arg0"
})
public class ExecuteTransformerV2AsJob {

    protected WsExecuteTransformerV2AsJob arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public ExecuteTransformerV2AsJob() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ExecuteTransformerV2AsJob(final WsExecuteTransformerV2AsJob arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WsExecuteTransformerV2AsJob }
     *     
     */
    public WsExecuteTransformerV2AsJob getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsExecuteTransformerV2AsJob }
     *     
     */
    public void setArg0(WsExecuteTransformerV2AsJob value) {
        this.arg0 = value;
    }

}
