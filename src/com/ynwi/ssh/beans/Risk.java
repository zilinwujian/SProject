package com.ynwi.ssh.beans;

public class Risk {
	private int riskid;
	private String content;
	private String possibility;
	private String influence;
	private String triggerthreshold;
	private String submitter;
	private String spoorer;
	public int getRiskid() {
		return riskid;
	}
	public void setRiskid(int riskid) {
		this.riskid = riskid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPossibility() {
		return possibility;
	}
	public void setPossibility(String possibility) {
		this.possibility = possibility;
	}
	public String getInfluence() {
		return influence;
	}
	public void setInfluence(String influence) {
		this.influence = influence;
	}
	public String getTriggerthreshold() {
		return triggerthreshold;
	}
	public void setTriggerthreshold(String triggerthreshold) {
		this.triggerthreshold = triggerthreshold;
	}
	public String getSubmitter() {
		return submitter;
	}
	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}
	public String getSpoorer() {
		return spoorer;
	}
	public void setSpoorer(String spoorer) {
		this.spoorer = spoorer;
	}
	
}
