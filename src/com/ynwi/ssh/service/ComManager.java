package com.ynwi.ssh.service;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Commdityplan;
import com.ynwi.ssh.forms.ComForm;

public interface ComManager {
	
	public void create(ComForm commdityplan) throws HibernateException;
	
	public int isenough (int comid,int storeid,int number) throws HibernateException;
	
	public ArrayList<Commdityplan> getcplist() throws HibernateException;
	
	public void permit(int id)  throws HibernateException;
}
