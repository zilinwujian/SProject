package com.ynwi.ssh.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.forms.BuyForm;
import com.ynwi.ssh.forms.StoreForm;
import com.ynwi.ssh.service.BuyManager;
import com.ynwi.ssh.service.ComManager;
import com.ynwi.ssh.service.StoreManager;

public class StoreCreateAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private StoreManager storeManager;
	private StoreForm store;


	public StoreForm getStore() {
		return store;
	}



	public void setStore(StoreForm store) {
		this.store = store;
	}



	public String execute() {
		try {
			storeManager.saveObject(store);
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
