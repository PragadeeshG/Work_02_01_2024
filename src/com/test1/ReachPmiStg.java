package com.test1;

public class ReachPmiStg {
	private String recKey;
	private String recordId;
	private String serviceName;
	private String alternateName;
	private String currencyCode;
	private String serviceType;
	private String area;
	private String coverage;
	private String grossValue;

	public ReachPmiStg() {

	}

	public ReachPmiStg(String recKey, String recordId, String serviceName, String alternateName, String currencyCode,
			String serviceType, String area, String coverage, String grossValue) {
		super();
		this.recKey = recKey;
		this.recordId = recordId;
		this.serviceName = serviceName;
		this.alternateName = alternateName;
		this.currencyCode = currencyCode;
		this.serviceType = serviceType;
		this.area = area;
		this.coverage = coverage;
		this.grossValue = grossValue;
	}

	public String getRecKey() {
		return recKey;
	}

	public void setRecKey(String recKey) {
		this.recKey = recKey;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getAlternateName() {
		return alternateName;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public String getGrossValue() {
		return grossValue;
	}

	public void setGrossValue(String grossValue) {
		this.grossValue = grossValue;
	}

}
