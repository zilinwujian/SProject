package com.ynwi.ssh.service;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Buy;
import com.ynwi.ssh.forms.BuyForm;

public interface BuyManager {
	public int create(BuyForm form)throws HibernateException;
	public void update(BuyForm form)throws HibernateException;
	public ArrayList<Buy> findbystore(int id)throws HibernateException;
	public ArrayList<Buy> findbymember(int id)throws HibernateException;
	public ArrayList<Buy> findbyclerk(int id)throws HibernateException;
}
