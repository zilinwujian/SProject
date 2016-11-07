package com.ynwi.ssh.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.forms.BuyForm;
import com.ynwi.ssh.service.BuyManager;
import com.ynwi.ssh.service.ComManager;
import com.ynwi.ssh.service.StoreManager;

public class AllClerkAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private StoreManager storeManager;



	public String execute() {
		try {
			
			Map request  = (Map)ActionContext.getContext().get("request");
			request.put("clist", storeManager.clerklist());
			System.out.println("ShowStores");
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}



	public StoreManager getStoreManager() {
		return storeManager;
	}



	public void setStoreManager(StoreManager storeManager) {
		this.storeManager = storeManager;
	}
}
