package com.ynwi.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.forms.BuyForm;
import com.ynwi.ssh.forms.OrderForm;
import com.ynwi.ssh.service.BuyManager;
import com.ynwi.ssh.service.ComManager;
import com.ynwi.ssh.service.OrderManager;

public class OrderSellAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private OrderManager ordermanager;
	
	private int oid;
	
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
			
			System.out.println("Upd order : "+oid);
			int r = ordermanager.upd(oid);
			if(r == 0){
				return SUCCESS;
			}else{
				return ERROR;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
