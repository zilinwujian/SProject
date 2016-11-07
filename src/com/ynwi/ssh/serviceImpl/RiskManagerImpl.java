package com.ynwi.ssh.serviceImpl;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.ynwi.ssh.beans.Risk;
import com.ynwi.ssh.dao.RiskDao;
import com.ynwi.ssh.forms.RiskForm;
import com.ynwi.ssh.service.RiskManager;

public class RiskManagerImpl implements RiskManager{
	
	private RiskDao dao;
	
	public RiskDao getDao() {
		return dao;
	}

	public void setDao(RiskDao dao) {
		this.dao = dao;
	}

	
	@Override
	public void create(RiskForm form) throws HibernateException {
		Risk risk = new Risk();
		BeanUtils.copyProperties(form, risk);
		dao.saveObject(risk);
	}

	@Override
	public void update(RiskForm form) throws HibernateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Risk> getrisklist() throws HibernateException {
		// TODO Auto-generated method stub
		return dao.getrisklist();
	}

}
