package com.test1;

public class ReachPmiStgDtlAction {
	private String recKey;
	private String settlementService;
	private Integer platformId;
	private String operatorCompany;
	private String operatorCountryCode;
	private String notes;
	private String fieldC;
	private String entityState;

	public ReachPmiStgDtlAction() {

	}

	public ReachPmiStgDtlAction(String recKey, String settlementService, Integer platformId, String operatorCompany,
			String operatorCountryCode, String notes, String fieldC, String entityState) {
		super();
		this.recKey = recKey;
		this.settlementService = settlementService;
		this.platformId = platformId;
		this.operatorCompany = operatorCompany;
		this.operatorCountryCode = operatorCountryCode;
		this.notes = notes;
		this.fieldC = fieldC;
		this.entityState = entityState;
	}

	public String getRecKey() {
		return recKey;
	}

	public void setRecKey(String recKey) {
		this.recKey = recKey;
	}

	public String getSettlementService() {
		return settlementService;
	}

	public void setSettlementService(String settlementService) {
		this.settlementService = settlementService;
	}

	public Integer getPlatformId() {
		return platformId;
	}

	public void setPlatformId(Integer platformId) {
		this.platformId = platformId;
	}

	public String getOperatorCompany() {
		return operatorCompany;
	}

	public void setOperatorCompany(String operatorCompany) {
		this.operatorCompany = operatorCompany;
	}

	public String getOperatorCountryCode() {
		return operatorCountryCode;
	}

	public void setOperatorCountryCode(String operatorCountryCode) {
		this.operatorCountryCode = operatorCountryCode;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getFieldC() {
		return fieldC;
	}

	public void setFieldC(String fieldC) {
		this.fieldC = fieldC;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
