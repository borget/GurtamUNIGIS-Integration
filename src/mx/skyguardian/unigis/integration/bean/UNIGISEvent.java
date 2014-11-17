package mx.skyguardian.unigis.integration.bean;


public class UNIGISEvent {
	public String systemUser = "";
	public String password = "";
	public String domain = "SINPLACA00";
	public String serialNumber = "";
	public String code = "";
	public Double latitude = 0D;
	public Double longitude = 0D;
	public Double altitude = 0D;
	public Double speed = 0D;
	public Long posixDatetimeEvent = 0L;
	
	public UNIGISEvent(String systemUser, String password, String domain,
			String serialNumber, String code, Double latitude,
			Double longitude, Double altitude, Double speed,
			Long posixDatetimeEvent) {
		super();
		this.systemUser = systemUser;
		this.password = password;
		this.domain = domain;
		this.serialNumber = serialNumber;
		this.code = code;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.speed = speed;
		this.posixDatetimeEvent = posixDatetimeEvent;
	}

	public UNIGISEvent(){
		
	}

	public String getSystemUser() {
		return systemUser;
	}

	public void setSystemUser(String systemUser) {
		this.systemUser = systemUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Long getPosixDatetimeEvent() {
		return posixDatetimeEvent;
	}

	public void setPosixDatetimeEvent(Long posixDatetimeEvent) {
		this.posixDatetimeEvent = posixDatetimeEvent;
	}

}
