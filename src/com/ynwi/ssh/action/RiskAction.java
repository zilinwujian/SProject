package com.ynwi.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.forms.RiskForm;
import com.ynwi.ssh.service.RiskManager;

public class RiskAction extends ActionSupport{


	private static final long serialVersionUID = 1L;

	private RiskForm risk;
	private RiskManager riskmanager;
	public RiskForm getRisk() {
		return risk;
	}
	public void setRisk(RiskForm risk) {
		this.risk = risk;
	}
	public RiskManager getRiskmanager() {
		return riskmanager;
	}
	public void setRiskmanager(RiskManager riskmanager) {
		this.riskmanager = riskmanager;
	}
	public String execute() {
		try {
			System.out.println("Create Risk");
			
			riskmanager.create(risk);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
