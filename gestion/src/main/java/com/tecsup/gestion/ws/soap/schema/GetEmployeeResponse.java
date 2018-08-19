//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.08.19 a las 10:27:41 AM COT 
//


package com.tecsup.gestion.ws.soap.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employeeXSD" type="{http://www.tecsup.gestion/EmployeeSchema}EmployeeXSD"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employeeXSD"
})
@XmlRootElement(name = "getEmployeeResponse")
public class GetEmployeeResponse {

    @XmlElement(required = true)
    protected EmployeeXSD employeeXSD;

    /**
     * Obtiene el valor de la propiedad employeeXSD.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeXSD }
     *     
     */
    public EmployeeXSD getEmployeeXSD() {
        return employeeXSD;
    }

    /**
     * Define el valor de la propiedad employeeXSD.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeXSD }
     *     
     */
    public void setEmployeeXSD(EmployeeXSD value) {
        this.employeeXSD = value;
    }

}
