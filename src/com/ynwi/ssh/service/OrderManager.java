package com.ynwi.ssh.service;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Order;
import com.ynwi.ssh.forms.OrderForm;

public interface OrderManager {
	public void sav(OrderForm of)throws HibernateException;;
	public int  upd(int oid)throws HibernateException;;
	public ArrayList<Order> getlist()throws HibernateException;;
}
