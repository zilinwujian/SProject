package com.ynwi.ssh.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Buy;
import com.ynwi.ssh.beans.Clerk;
import com.ynwi.ssh.beans.Member;
import com.ynwi.ssh.beans.Store;

public interface StoreDao {
	
	public void saveObject(Object obj) throws HibernateException;
	
	public ArrayList<Store> storelist()throws HibernateException;
	
	public void updateObject(Object obj)throws HibernateException;
	
	public ArrayList<Member> getmemberlist()throws HibernateException;
	
	public ArrayList<Buy> getbuylist()throws HibernateException;

	public ArrayList<Clerk> getclerklist()throws HibernateException;
}
