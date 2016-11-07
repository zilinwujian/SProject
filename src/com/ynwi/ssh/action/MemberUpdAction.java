package com.ynwi.ssh.action;

import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.forms.MemberForm;
import com.ynwi.ssh.forms.MemberUpdForm;
import com.ynwi.ssh.forms.UserForm;
import com.ynwi.ssh.service.MemberManager;
import com.ynwi.ssh.service.UserManager;

public class MemberUpdAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private MemberUpdForm member;

	private MemberManager memberManager;

	public MemberUpdForm getMember() {
		return member;
	}

	public void setMember(MemberUpdForm member) {
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
			memberManager.update(member);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
