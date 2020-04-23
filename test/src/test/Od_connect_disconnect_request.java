package test;

public class Od_connect_disconnect_request {
	private String orgName;
	private String requestDate;
	private String requestId;
	private String type;
	private String meterNumber;
	private String installationNumber;

	// Getter Methods

	public String getOrgName() {
		return orgName;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public String getRequestId() {
		return requestId;
	}

	public String getType() {
		return type;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public String getInstallationNumber() {
		return installationNumber;
	}

	// Setter Methods

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public void setInstallationNumber(String installationNumber) {
		this.installationNumber = installationNumber;
	}
}
