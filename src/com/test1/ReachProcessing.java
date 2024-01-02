package com.test1;

public class ReachProcessing {
	private long uploadId;
	private String fileName;
	private String upoadedBy;
	private String uploadedDate;
	private boolean isAction;
	private String status;
	private String processStartTime;
	private String processCompletionTime;
	private String fileType;
	private long executiondDuration;
	private String creationDate;
	private String executionLog;
	private String loggedDate;

	public ReachProcessing() {

	}

	public ReachProcessing(long uploadId, String fileName, String upoadedBy, String uploadedDate, boolean isAction,
			String status, String processStartTime, String processCompletionTime, String fileType,
			long executiondDuration, String creationDate, String executionLog, String loggedDate) {
		super();
		this.uploadId = uploadId;
		this.fileName = fileName;
		this.upoadedBy = upoadedBy;
		this.uploadedDate = uploadedDate;
		this.isAction = isAction;
		this.status = status;
		this.processStartTime = processStartTime;
		this.processCompletionTime = processCompletionTime;
		this.fileType = fileType;
		this.executiondDuration = executiondDuration;
		this.creationDate = creationDate;
		this.executionLog = executionLog;
		this.loggedDate = loggedDate;
	}

	public long getUploadId() {
		return uploadId;
	}

	public void setUploadId(long uploadId) {
		this.uploadId = uploadId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUpoadedBy() {
		return upoadedBy;
	}

	public void setUpoadedBy(String upoadedBy) {
		this.upoadedBy = upoadedBy;
	}

	public String getUploadedDate() {
		return uploadedDate;
	}

	public void setUploadedDate(String uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

	public boolean isAction() {
		return isAction;
	}

	public void setAction(boolean isAction) {
		this.isAction = isAction;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProcessStartTime() {
		return processStartTime;
	}

	public void setProcessStartTime(String processStartTime) {
		this.processStartTime = processStartTime;
	}

	public String getProcessCompletionTime() {
		return processCompletionTime;
	}

	public void setProcessCompletionTime(String processCompletionTime) {
		this.processCompletionTime = processCompletionTime;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public long getExecutiondDuration() {
		return executiondDuration;
	}

	public void setExecutiondDuration(long executiondDuration) {
		this.executiondDuration = executiondDuration;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getExecutionLog() {
		return executionLog;
	}

	public void setExecutionLog(String executionLog) {
		this.executionLog = executionLog;
	}

	public String getLoggedDate() {
		return loggedDate;
	}

	public void setLoggedDate(String loggedDate) {
		this.loggedDate = loggedDate;
	}

}
