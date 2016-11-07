package com.ynwi.ssh.service;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Member;
import com.ynwi.ssh.beans.Record;
import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.forms.MemberForm;
import com.ynwi.ssh.forms.MemberUpdForm;
import com.ynwi.ssh.forms.UserForm;

public interface MemberManager {

	public void reg(MemberForm memberform) throws HibernateException;
	
	public void update(MemberUpdForm memberform) throws HibernateException;

	public Member find(int id)throws HibernateException;
	
	public int sti(int money)throws HibernateException;
	
	public void updatelocal(Member member)throws HibernateException;
	
	public ArrayList<Record> getrlist() throws HibernateException;

}
