package mx.skyguardian.unigis.integration.bean;

public class LoginSession {
	private String eid = null;
	private Integer posixTime = null;

	public LoginSession() {
		this.eid = "";
		this.posixTime = 0;

	}

	public LoginSession(String eid, Integer posixTime) {
		super();
		this.eid = eid;
		this.posixTime = posixTime;
	}

	public Integer getPosixTime() {
		return posixTime;
	}

	public void setPosixTime(Integer posixTime) {
		this.posixTime = posixTime;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}


}
