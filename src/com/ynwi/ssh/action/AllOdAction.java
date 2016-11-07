package com.ynwi.ssh.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.forms.BuyForm;
import com.ynwi.ssh.forms.OrderForm;
import com.ynwi.ssh.service.BuyManager;
import com.ynwi.ssh.service.ComManager;
import com.ynwi.ssh.service.OrderManager;

public class AllOdAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private OrderManager ordermanager;

	public OrderManager getOrdermanager() {
		return ordermanager;
	}

	public void setOrdermanager(OrderManager ordermanager) {
		this.ordermanager = ordermanager;
	}

	public String execute() {
		try {
			
			System.out.println("orders : ");
			Map request  = (Map)ActionContext.getContext().get("request");
			request.put("olist", ordermanager.getlist());
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
