package com.ynwi.ssh.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Commdityplan;
import com.ynwi.ssh.beans.Order;

public interface OrderDao {
	
	public void saveObject(Object o) throws HibernateException;
		
	public int update(int oid) throws HibernateException;
	
	public ArrayList<Order> getlist()throws HibernateException;
}
