package com.ynwi.ssh.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.beans.Member;
import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.forms.MemberForm;
import com.ynwi.ssh.service.MemberManager;

public class MemberFindAction extends ActionSupport{
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
			Map request = (Map)ActionContext.getContext().get("request");
			Map session = ActionContext.getContext().getSession();
			User now = (User) session.get("user");
			int id = now.getUserId();
			Member mem = memberManager.find(id);
			System.out.println("FindSuccess:" +mem.getMemberid());
			request.put("member", mem);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
