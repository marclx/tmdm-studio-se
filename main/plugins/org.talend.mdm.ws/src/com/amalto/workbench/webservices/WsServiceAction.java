
package com.amalto.workbench.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsServiceAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsServiceAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodParameters" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wsAction" type="{http://www.talend.com/mdm}wsServiceActionCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsServiceAction", propOrder = {
    "jndiName",
    "methodName",
    "methodParameters",
    "wsAction"
})
public class WsServiceAction {

    protected String jndiName;
    protected String methodName;
    @XmlElement(nillable = true)
    protected List<String> methodParameters;
    protected WsServiceActionCode wsAction;

    /**
     * Default no-arg constructor
     * 
     */
    public WsServiceAction() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsServiceAction(final String jndiName, final String methodName, final List<String> methodParameters, final WsServiceActionCode wsAction) {
        this.jndiName = jndiName;
        this.methodName = methodName;
        this.methodParameters = methodParameters;
        this.wsAction = wsAction;
    }

    /**
     * Gets the value of the jndiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiName() {
        return jndiName;
    }

    /**
     * Sets the value of the jndiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiName(String value) {
        this.jndiName = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the methodParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMethodParameters() {
        if (methodParameters == null) {
            methodParameters = new ArrayList<String>();
        }
        return this.methodParameters;
    }

    /**
     * Gets the value of the wsAction property.
     * 
     * @return
     *     possible object is
     *     {@link WsServiceActionCode }
     *     
     */
    public WsServiceActionCode getWsAction() {
        return wsAction;
    }

    /**
     * Sets the value of the wsAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsServiceActionCode }
     *     
     */
    public void setWsAction(WsServiceActionCode value) {
        this.wsAction = value;
    }

}
