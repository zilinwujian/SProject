package com.ynwi.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.forms.BuyForm;
import com.ynwi.ssh.forms.OrderForm;
import com.ynwi.ssh.service.BuyManager;
import com.ynwi.ssh.service.ComManager;
import com.ynwi.ssh.service.OrderManager;

public class OrderCreateAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private OrderForm orderform;
	
	private OrderManager ordermanager;
	
	private int oid;
	

	public OrderForm getOrderform() {
		return orderform;
	}

	public void setOrderform(OrderForm orderform) {
		this.orderform = orderform;
	}

	public OrderManager getOrdermanager() {
		return ordermanager;
	}

	public void setOrdermanager(OrderManager ordermanager) {
		this.ordermanager = ordermanager;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String execute() {
		try {
			
			System.out.println("Create order : "+oid);
			ordermanager.sav(orderform);
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
