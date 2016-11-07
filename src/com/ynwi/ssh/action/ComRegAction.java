package com.ynwi.ssh.action;

import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Commdityplan;
import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.forms.ComForm;
import com.ynwi.ssh.forms.MemberForm;
import com.ynwi.ssh.forms.UserForm;
import com.ynwi.ssh.service.ComManager;
import com.ynwi.ssh.service.MemberManager;
import com.ynwi.ssh.service.UserManager;

public class ComRegAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private ComForm com;

	private ComManager comManager;

	public ComForm getCom() {
		return com;
	}



	public void setCom(ComForm com) {
		this.com = com;
	}



	public ComManager getComManager() {
		return comManager;
	}



	public void setComManager(ComManager comManager) {
		this.comManager = comManager;
	}



	public String execute() {
		try {
			comManager.create(com);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
