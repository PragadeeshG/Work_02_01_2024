package com.test1;

public class ReachStagingDtls {
	private String recKey;
	private String allowedValues;
	private String fieldA;
	private String fieldB;
	private String specificFormat;
	private boolean underScoreAllowed;
	private String allowedFormat;
	private String platformRole;
	private String creationDate;
	private String modifyFlag;
	private String crId;

	public ReachStagingDtls() {

	}

	public ReachStagingDtls(String recKey, String allowedValues, String fieldA, String fieldB, String specificFormat,
			boolean underScoreAllowed, String allowedFormat, String platformRole, String creationDate,
			String modifyFlag, String crId) {
		super();
		this.recKey = recKey;
		this.allowedValues = allowedValues;
		this.fieldA = fieldA;
		this.fieldB = fieldB;
		this.specificFormat = specificFormat;
		this.underScoreAllowed = underScoreAllowed;
		this.allowedFormat = allowedFormat;
		this.platformRole = platformRole;
		this.creationDate = creationDate;
		this.modifyFlag = modifyFlag;
		this.crId = crId;
	}

	public String getRecKey() {
		return recKey;
	}

	public void setRecKey(String recKey) {
		this.recKey = recKey;
	}

	public String getAllowedValues() {
		return allowedValues;
	}

	public void setAllowedValues(String allowedValues) {
		this.allowedValues = allowedValues;
	}

	public String getFieldA() {
		return fieldA;
	}

	public void setFieldA(String fieldA) {
		this.fieldA = fieldA;
	}

	public String getFieldB() {
		return fieldB;
	}

	public void setFieldB(String fieldB) {
		this.fieldB = fieldB;
	}

	public String getSpecificFormat() {
		return specificFormat;
	}

	public void setSpecificFormat(String specificFormat) {
		this.specificFormat = specificFormat;
	}

	public boolean isUnderScoreAllowed() {
		return underScoreAllowed;
	}

	public void setUnderScoreAllowed(boolean underScoreAllowed) {
		this.underScoreAllowed = underScoreAllowed;
	}

	public String getAllowedFormat() {
		return allowedFormat;
	}

	public void setAllowedFormat(String allowedFormat) {
		this.allowedFormat = allowedFormat;
	}

	public String getPlatformRole() {
		return platformRole;
	}

	public void setPlatformRole(String platformRole) {
		this.platformRole = platformRole;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifyFlag() {
		return modifyFlag;
	}

	public void setModifyFlag(String modifyFlag) {
		this.modifyFlag = modifyFlag;
	}

	public String getCrId() {
		return crId;
	}

	public void setCrId(String crId) {
		this.crId = crId;
	}

}
