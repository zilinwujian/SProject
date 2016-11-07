package com.ynwi.ssh.action;

import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Member;
import com.ynwi.ssh.forms.BuyForm;
import com.ynwi.ssh.service.BuyManager;
import com.ynwi.ssh.service.ComManager;
import com.ynwi.ssh.service.StoreManager;

public class AllMemberAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private StoreManager storeManager;



	public String execute() {
		try {
			
			ArrayList<Member> mlist =  storeManager.getmembers();
			
			double male = 0.0;
			double female = 0.0;
			double other = 0.0;
			
			for(Member m : mlist){
				if(m.getSex().equalsIgnoreCase("Male")){
					male ++;
				}else if(m.getSex().equalsIgnoreCase("Female")){
					female ++;
				}else{
					other++;
				}
			}			
			
			Map request  = (Map)ActionContext.getContext().get("request");
			request.put("mlist",mlist);
			request.put("male",male);
			request.put("female",female);
			request.put("other",other);
			System.out.println("ShowMems");
			
			
			
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
