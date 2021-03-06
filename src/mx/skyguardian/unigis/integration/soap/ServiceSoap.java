package mx.skyguardian.unigis.integration.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-02T10:51:12.336-06:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://www.assistcargo.com/", name = "ServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ServiceSoap {

    

    /**
     * Loguea e inserta un evento
     */
    @WebResult(name = "LoginYInsertarEventoResult", targetNamespace = "http://www.assistcargo.com/")
    @RequestWrapper(localName = "LoginYInsertarEvento", targetNamespace = "http://www.assistcargo.com/", className = "mx.skyguardian.unigis.integration.soap.LoginYInsertarEvento")
    @WebMethod(operationName = "LoginYInsertarEvento", action = "http://www.assistcargo.com/LoginYInsertarEvento")
    @ResponseWrapper(localName = "LoginYInsertarEventoResponse", targetNamespace = "http://www.assistcargo.com/", className = "mx.skyguardian.unigis.integration.soap.LoginYInsertarEventoResponse")
    public int loginYInsertarEvento(
        @WebParam(name = "SystemUser", targetNamespace = "http://www.assistcargo.com/")
        java.lang.String systemUser,
        @WebParam(name = "Password", targetNamespace = "http://www.assistcargo.com/")
        java.lang.String password,
        @WebParam(name = "Dominio", targetNamespace = "http://www.assistcargo.com/")
        java.lang.String dominio,
        @WebParam(name = "NroSerie", targetNamespace = "http://www.assistcargo.com/")
        java.lang.String nroSerie,
        @WebParam(name = "Codigo", targetNamespace = "http://www.assistcargo.com/")
        java.lang.String codigo,
        @WebParam(name = "Latitud", targetNamespace = "http://www.assistcargo.com/")
        double latitud,
        @WebParam(name = "Longitud", targetNamespace = "http://www.assistcargo.com/")
        double longitud,
        @WebParam(name = "Altitud", targetNamespace = "http://www.assistcargo.com/")
        double altitud,
        @WebParam(name = "Velocidad", targetNamespace = "http://www.assistcargo.com/")
        double velocidad,
        @WebParam(name = "FechaHoraEvento", targetNamespace = "http://www.assistcargo.com/")
        javax.xml.datatype.XMLGregorianCalendar fechaHoraEvento,
        @WebParam(name = "FechaHoraRecepcion", targetNamespace = "http://www.assistcargo.com/")
        javax.xml.datatype.XMLGregorianCalendar fechaHoraRecepcion
    );



}
