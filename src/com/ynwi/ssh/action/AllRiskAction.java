package com.ynwi.ssh.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.service.RiskManager;
import com.ynwi.ssh.service.UserManager;

public class AllRiskAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private RiskManager riskmanager;
	
	

	public RiskManager getRiskmanager() {
		return riskmanager;
	}

	public void setRiskmanager(RiskManager riskmanager) {
		this.riskmanager = riskmanager;
	}
	
	public String execute() {
		try {
			Map request  = (Map)ActionContext.getContext().get("request");
			request.put("risklist", riskmanager.getrisklist());
			System.out.println("ShowRisks");
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
