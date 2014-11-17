
package mx.skyguardian.unigis.integration.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dominio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitud" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Altitud" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Velocidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="FechaHoraEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaHoraRecepcion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "systemUser",
    "password",
    "dominio",
    "nroSerie",
    "codigo",
    "latitud",
    "longitud",
    "altitud",
    "velocidad",
    "fechaHoraEvento",
    "fechaHoraRecepcion"
})
@XmlRootElement(name = "LoginYInsertarEvento")
public class LoginYInsertarEvento {

    @XmlElement(name = "SystemUser")
    protected String systemUser;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Dominio")
    protected String dominio;
    @XmlElement(name = "NroSerie")
    protected String nroSerie;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Latitud")
    protected double latitud;
    @XmlElement(name = "Longitud")
    protected double longitud;
    @XmlElement(name = "Altitud")
    protected double altitud;
    @XmlElement(name = "Velocidad")
    protected double velocidad;
    @XmlElement(name = "FechaHoraEvento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraEvento;
    @XmlElement(name = "FechaHoraRecepcion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraRecepcion;

    /**
     * Gets the value of the systemUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemUser() {
        return systemUser;
    }

    /**
     * Sets the value of the systemUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemUser(String value) {
        this.systemUser = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the dominio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDominio() {
        return dominio;
    }

    /**
     * Sets the value of the dominio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDominio(String value) {
        this.dominio = value;
    }

    /**
     * Gets the value of the nroSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroSerie() {
        return nroSerie;
    }

    /**
     * Sets the value of the nroSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroSerie(String value) {
        this.nroSerie = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the latitud property.
     * 
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Sets the value of the latitud property.
     * 
     */
    public void setLatitud(double value) {
        this.latitud = value;
    }

    /**
     * Gets the value of the longitud property.
     * 
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Sets the value of the longitud property.
     * 
     */
    public void setLongitud(double value) {
        this.longitud = value;
    }

    /**
     * Gets the value of the altitud property.
     * 
     */
    public double getAltitud() {
        return altitud;
    }

    /**
     * Sets the value of the altitud property.
     * 
     */
    public void setAltitud(double value) {
        this.altitud = value;
    }

    /**
     * Gets the value of the velocidad property.
     * 
     */
    public double getVelocidad() {
        return velocidad;
    }

    /**
     * Sets the value of the velocidad property.
     * 
     */
    public void setVelocidad(double value) {
        this.velocidad = value;
    }

    /**
     * Gets the value of the fechaHoraEvento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraEvento() {
        return fechaHoraEvento;
    }

    /**
     * Sets the value of the fechaHoraEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraEvento(XMLGregorianCalendar value) {
        this.fechaHoraEvento = value;
    }

    /**
     * Gets the value of the fechaHoraRecepcion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraRecepcion() {
        return fechaHoraRecepcion;
    }

    /**
     * Sets the value of the fechaHoraRecepcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraRecepcion(XMLGregorianCalendar value) {
        this.fechaHoraRecepcion = value;
    }

}
