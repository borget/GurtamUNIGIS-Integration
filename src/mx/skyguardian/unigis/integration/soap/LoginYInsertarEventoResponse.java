
package mx.skyguardian.unigis.integration.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="LoginYInsertarEventoResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "loginYInsertarEventoResult"
})
@XmlRootElement(name = "LoginYInsertarEventoResponse")
public class LoginYInsertarEventoResponse {

    @XmlElement(name = "LoginYInsertarEventoResult")
    protected int loginYInsertarEventoResult;

    /**
     * Gets the value of the loginYInsertarEventoResult property.
     * 
     */
    public int getLoginYInsertarEventoResult() {
        return loginYInsertarEventoResult;
    }

    /**
     * Sets the value of the loginYInsertarEventoResult property.
     * 
     */
    public void setLoginYInsertarEventoResult(int value) {
        this.loginYInsertarEventoResult = value;
    }

}
