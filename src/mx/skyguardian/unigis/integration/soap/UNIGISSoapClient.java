package mx.skyguardian.unigis.integration.soap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.net.URL;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.TimeZone;

import javax.annotation.Resource;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import mx.skyguardian.unigis.integration.bean.UNIGISEvent;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * This class was generated by Apache CXF 2.7.10 2014-04-02T10:51:12.119-06:00
 * Generated source version: 2.7.10
 * 
 */
public final class UNIGISSoapClient {
	private static Logger log = Logger.getLogger(UNIGISSoapClient.class);

	private static final QName SERVICE_NAME = new QName("http://www.assistcargo.com/", "Service");

	@Resource(name = "appProperties")
	private Properties appProperties;
	
	private UNIGISSoapClient() {
	}

	public int sendEvent2UNIGIS(UNIGISEvent event) throws ParseException, DatatypeConfigurationException {

		URL wsdlURL = Service.WSDL_LOCATION;

		Service ss = new Service(wsdlURL, SERVICE_NAME);
		ServiceSoap port = ss.getServiceSoap();
	
		java.lang.String _loginYInsertarEvento_systemUser = 
				appProperties.getProperty("mx.skyguardian.unigis.integration.soap.systemuser");
		java.lang.String _loginYInsertarEvento_password = 
				appProperties.getProperty("mx.skyguardian.unigis.integration.soap.password");
		java.lang.String _loginYInsertarEvento_dominio = event.getDomain();
		java.lang.String _loginYInsertarEvento_nroSerie = StringUtils.EMPTY;
		java.lang.String _loginYInsertarEvento_codigo = 
				appProperties.getProperty("mx.skyguardian.unigis.integration.soap.code");
		double _loginYInsertarEvento_latitud = event.getLatitude();
		double _loginYInsertarEvento_longitud = event.getLongitude();
		double _loginYInsertarEvento_altitud = event.getAltitude();
		double _loginYInsertarEvento_velocidad = event.getSpeed();
		
		XMLGregorianCalendar XMLfechaHoraEvento = null;
		
		TimeZone mxTimeZone = TimeZone.getTimeZone(appProperties.getProperty("mx.skyguardian.unigis.integration.timezone"));
		GregorianCalendar fechaHoraEvento = (GregorianCalendar)GregorianCalendar.getInstance(mxTimeZone);
		int offSet = mxTimeZone.getOffset(fechaHoraEvento.getTimeInMillis());
		fechaHoraEvento.setTimeInMillis((event.getPosixDatetimeEvent()*1000));
		fechaHoraEvento.add(GregorianCalendar.MILLISECOND, offSet);
		
		XMLfechaHoraEvento = DatatypeFactory.newInstance().newXMLGregorianCalendar(fechaHoraEvento);
		
		
		XMLGregorianCalendar _loginYInsertarEvento_fechaHoraEvento = XMLfechaHoraEvento;
		
		GregorianCalendar fechaHoraRecepcion = (GregorianCalendar)GregorianCalendar.getInstance(mxTimeZone);
		fechaHoraRecepcion.add(GregorianCalendar.MILLISECOND, offSet);
		
		XMLGregorianCalendar XMLfechaHoraRecepcion = DatatypeFactory.newInstance().newXMLGregorianCalendar(fechaHoraRecepcion);
		XMLGregorianCalendar _loginYInsertarEvento_fechaHoraRecepcion = XMLfechaHoraRecepcion;
		
		log.info("Invoking http://www.assistcargo.com/LoginYInsertarEvento ...["+
				_loginYInsertarEvento_systemUser+","+
				_loginYInsertarEvento_password+","+
				_loginYInsertarEvento_dominio+","+
				_loginYInsertarEvento_codigo+","+
				_loginYInsertarEvento_latitud+","+
				_loginYInsertarEvento_longitud+","+
				_loginYInsertarEvento_altitud+","+
				_loginYInsertarEvento_velocidad+","+
				event.getPosixDatetimeEvent()+","+
				XMLfechaHoraEvento+","+
				XMLfechaHoraRecepcion+"]");
		
		int _loginYInsertarEvento__return = port.loginYInsertarEvento(
				_loginYInsertarEvento_systemUser,
				_loginYInsertarEvento_password, _loginYInsertarEvento_dominio,
				_loginYInsertarEvento_nroSerie, _loginYInsertarEvento_codigo,
				_loginYInsertarEvento_latitud, _loginYInsertarEvento_longitud,
				_loginYInsertarEvento_altitud, _loginYInsertarEvento_velocidad,
				_loginYInsertarEvento_fechaHoraEvento,
				_loginYInsertarEvento_fechaHoraRecepcion);
		
		log.info("loginYInsertarEvento.result="+ _loginYInsertarEvento__return);

		return _loginYInsertarEvento__return;
	}
	
	public Properties getAppProperties() {
		return this.appProperties;
	}

	public void setAppProperties(Properties appProperties) {
		this.appProperties = appProperties;
	}

}