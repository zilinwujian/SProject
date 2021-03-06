package com.ynwi.ssh.service;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.forms.RiskForm;


public interface RiskManager {
	public void create(RiskForm form)throws HibernateException;
	public void update(RiskForm form)throws HibernateException;
	public ArrayList<Risk>getrisklist()throws HibernateException;
}
