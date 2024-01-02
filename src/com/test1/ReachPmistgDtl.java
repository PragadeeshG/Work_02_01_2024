package com.test1;

public class ReachPmistgDtl {
	private String recKey;
	private String executionType;
	private String transactionType;
	private String participantIdType;
	private String isoMsgFormat;
	private Integer svcLocalTime;
	private Integer svcCutOffTime;
	private String techNicalName;
	private String networks;

	public ReachPmistgDtl() {

	}

	public ReachPmistgDtl(String recKey, String executionType, String transactionType, String participantIdType,
			String isoMsgFormat, Integer svcLocalTime, Integer svcCutOffTime, String techNicalName, String networks) {
		super();
		this.recKey = recKey;
		this.executionType = executionType;
		this.transactionType = transactionType;
		this.participantIdType = participantIdType;
		this.isoMsgFormat = isoMsgFormat;
		this.svcLocalTime = svcLocalTime;
		this.svcCutOffTime = svcCutOffTime;
		this.techNicalName = techNicalName;
		this.networks = networks;
	}

	public String getRecKey() {
		return recKey;
	}

	public void setRecKey(String recKey) {
		this.recKey = recKey;
	}

	public String getExecutionType() {
		return executionType;
	}

	public void setExecutionType(String executionType) {
		this.executionType = executionType;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getParticipantIdType() {
		return participantIdType;
	}

	public void setParticipantIdType(String participantIdType) {
		this.participantIdType = participantIdType;
	}

	public String getIsoMsgFormat() {
		return isoMsgFormat;
	}

	public void setIsoMsgFormat(String isoMsgFormat) {
		this.isoMsgFormat = isoMsgFormat;
	}

	public Integer getSvcLocalTime() {
		return svcLocalTime;
	}

	public void setSvcLocalTime(Integer svcLocalTime) {
		this.svcLocalTime = svcLocalTime;
	}

	public Integer getSvcCutOffTime() {
		return svcCutOffTime;
	}

	public void setSvcCutOffTime(Integer svcCutOffTime) {
		this.svcCutOffTime = svcCutOffTime;
	}

	public String getTechNicalName() {
		return techNicalName;
	}

	public void setTechNicalName(String techNicalName) {
		this.techNicalName = techNicalName;
	}

	public String getNetworks() {
		return networks;
	}

	public void setNetworks(String networks) {
		this.networks = networks;
	}

}
