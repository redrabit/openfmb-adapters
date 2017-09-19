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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.
 * 
 * <p>Java class for GeneratingUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneratingUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}IdentifiedObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxOperatingP" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}ActivePower" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneratingUnit", namespace = "http://openfmb.org/xsd/2015/12/openfmb/generationmodule", propOrder = {
    "maxOperatingP"
})
@XmlRootElement(name = "GeneratingUnit", namespace = "http://openfmb.org/xsd/2015/12/openfmb/generationmodule")
public class GeneratingUnit
    extends IdentifiedObject
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ActivePower maxOperatingP;

    /**
     * Gets the value of the maxOperatingP property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getMaxOperatingP() {
        return maxOperatingP;
    }

    /**
     * Sets the value of the maxOperatingP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setMaxOperatingP(ActivePower value) {
        this.maxOperatingP = value;
    }

}