package com.ynwi.ssh.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Buy;

public interface Buydao {
	
	public void saveObject(Object obj) throws HibernateException;
	
	public void updateObject(Object obj)throws HibernateException;
	
	public ArrayList<Buy> findbyMember(int id)throws HibernateException;
	
	public ArrayList<Buy> findbyStore(int id)throws HibernateException;
	
	public ArrayList<Buy> findbyClerk(int id)throws HibernateException;	
}
