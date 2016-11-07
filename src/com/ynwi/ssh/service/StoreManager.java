package com.ynwi.ssh.service;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Buy;
import com.ynwi.ssh.beans.Clerk;
import com.ynwi.ssh.beans.Member;
import com.ynwi.ssh.beans.Store;
import com.ynwi.ssh.forms.ClerkForm;
import com.ynwi.ssh.forms.StoreForm;

public interface StoreManager {
	
	public void saveObject(StoreForm sf) throws HibernateException;
	
	public void saveObject2(ClerkForm sf) throws HibernateException;
	
	public ArrayList<Store> storelist()throws HibernateException;
	
	public ArrayList<Clerk> clerklist()throws HibernateException;

	public void updateObject(Store st)throws HibernateException;
	
	public ArrayList<Member> getmembers()throws HibernateException;
	
	public ArrayList<Buy> getbuylist()throws HibernateException;
}
