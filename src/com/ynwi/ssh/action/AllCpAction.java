package com.ynwi.ssh.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.forms.BuyForm;
import com.ynwi.ssh.service.BuyManager;
import com.ynwi.ssh.service.ComManager;

public class AllCpAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private ComManager comManager;


	public ComManager getComManager() {
		return comManager;
	}



	public void setComManager(ComManager comManager) {
		this.comManager = comManager;
	}

	public String execute() {
		try {
			
			Map request  = (Map)ActionContext.getContext().get("request");
			request.put("list", comManager.getcplist());
			System.out.println("ShowCps");
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
