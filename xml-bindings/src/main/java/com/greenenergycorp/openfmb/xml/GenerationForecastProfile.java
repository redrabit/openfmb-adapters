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
 * Load forecast.
 * 
 * <p>Java class for GenerationForecastProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerationForecastProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForecastSchedule" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}ForecastSchedule"/&gt;
 *         &lt;element name="GeneratingUnit" type="{http://openfmb.org/xsd/2015/12/openfmb/generationmodule}GeneratingUnit"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerationForecastProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/generationmodule", propOrder = {
    "forecastSchedule",
    "generatingUnit"
})
@XmlRootElement(name = "GenerationForecastProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/generationmodule")
public class GenerationForecastProfile
    extends Container
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ForecastSchedule", required = true)
    protected ForecastSchedule forecastSchedule;
    @XmlElement(name = "GeneratingUnit", required = true)
    protected GeneratingUnit generatingUnit;

    /**
     * Gets the value of the forecastSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastSchedule }
     *     
     */
    public ForecastSchedule getForecastSchedule() {
        return forecastSchedule;
    }

    /**
     * Sets the value of the forecastSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastSchedule }
     *     
     */
    public void setForecastSchedule(ForecastSchedule value) {
        this.forecastSchedule = value;
    }

    /**
     * Gets the value of the generatingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratingUnit }
     *     
     */
    public GeneratingUnit getGeneratingUnit() {
        return generatingUnit;
    }

    /**
     * Sets the value of the generatingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratingUnit }
     *     
     */
    public void setGeneratingUnit(GeneratingUnit value) {
        this.generatingUnit = value;
    }

}
