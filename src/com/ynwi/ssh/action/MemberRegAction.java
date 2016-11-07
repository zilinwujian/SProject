package com.ynwi.ssh.action;

import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.forms.MemberForm;
import com.ynwi.ssh.forms.UserForm;
import com.ynwi.ssh.service.MemberManager;
import com.ynwi.ssh.service.UserManager;

public class MemberRegAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private MemberForm member;

	private MemberManager memberManager;

	public MemberForm getMember() {
		return member;
	}

	public void setMember(MemberForm member) {
		this.member = member;
	}

	public MemberManager getMemberManager() {
		return memberManager;
	}

	public void setMemberManager(MemberManager memberManager) {
		this.memberManager = memberManager;
	}

	public String execute() {
		try {
			memberManager.reg(member);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
