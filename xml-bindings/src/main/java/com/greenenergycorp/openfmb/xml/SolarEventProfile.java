//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:07:42 PM EDT 
//


package com.greenenergycorp.openfmb.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SolarEventProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SolarEventProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolarInverter" type="{http://openfmb.org/xsd/2015/12/openfmb/solarmodule}SolarInverter"/&gt;
 *         &lt;element name="SolarInverterStatus" type="{http://openfmb.org/xsd/2015/12/openfmb/solarmodule}SolarInverterStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolarEventProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule", propOrder = {
    "solarInverter",
    "solarInverterStatus"
})
@XmlRootElement(name = "SolarEventProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/solarmodule")
public class SolarEventProfile
    extends Container
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SolarInverter", required = true)
    protected SolarInverter solarInverter;
    @XmlElement(name = "SolarInverterStatus", required = true)
    protected SolarInverterStatus solarInverterStatus;

    /**
     * Gets the value of the solarInverter property.
     * 
     * @return
     *     possible object is
     *     {@link SolarInverter }
     *     
     */
    public SolarInverter getSolarInverter() {
        return solarInverter;
    }

    /**
     * Sets the value of the solarInverter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolarInverter }
     *     
     */
    public void setSolarInverter(SolarInverter value) {
        this.solarInverter = value;
    }

    /**
     * Gets the value of the solarInverterStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SolarInverterStatus }
     *     
     */
    public SolarInverterStatus getSolarInverterStatus() {
        return solarInverterStatus;
    }

    /**
     * Sets the value of the solarInverterStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolarInverterStatus }
     *     
     */
    public void setSolarInverterStatus(SolarInverterStatus value) {
        this.solarInverterStatus = value;
    }

}