package com.test1;

public class ReachStaging {
	private long modificationFlagId;
	private String recKey;
	private String platformName;
	private Integer genericFieldId;
	private String genericFldName;
	private String spcfcFldName;
	private String spcfcFldDesc;
	private String presentAlways;
	private String creationDate;
	private String modifiedDate;

	public ReachStaging() {

	}

	public ReachStaging(long modificationFlagId, String recKey, String platformName, Integer genericFieldId,
			String genericFldName, String spcfcFldName, String spcfcFldDesc, String presentAlways, String creationDate,
			String modifiedDate) {
		super();
		this.modificationFlagId = modificationFlagId;
		this.recKey = recKey;
		this.platformName = platformName;
		this.genericFieldId = genericFieldId;
		this.genericFldName = genericFldName;
		this.spcfcFldName = spcfcFldName;
		this.spcfcFldDesc = spcfcFldDesc;
		this.presentAlways = presentAlways;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public long getModificationFlagId() {
		return modificationFlagId;
	}

	public void setModificationFlagId(long modificationFlagId) {
		this.modificationFlagId = modificationFlagId;
	}

	public String getRecKey() {
		return recKey;
	}

	public void setRecKey(String recKey) {
		this.recKey = recKey;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public Integer getGenericFieldId() {
		return genericFieldId;
	}

	public void setGenericFieldId(Integer genericFieldId) {
		this.genericFieldId = genericFieldId;
	}

	public String getGenericFldName() {
		return genericFldName;
	}

	public void setGenericFldName(String genericFldName) {
		this.genericFldName = genericFldName;
	}

	public String getSpcfcFldName() {
		return spcfcFldName;
	}

	public void setSpcfcFldName(String spcfcFldName) {
		this.spcfcFldName = spcfcFldName;
	}

	public String getSpcfcFldDesc() {
		return spcfcFldDesc;
	}

	public void setSpcfcFldDesc(String spcfcFldDesc) {
		this.spcfcFldDesc = spcfcFldDesc;
	}

	public String getPresentAlways() {
		return presentAlways;
	}

	public void setPresentAlways(String presentAlways) {
		this.presentAlways = presentAlways;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
