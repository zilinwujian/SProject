package com.ynwi.ssh.daoImpl;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ynwi.ssh.dao.RiskDao;

public class RiskDaoImpl extends HibernateDaoSupport implements RiskDao{

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}

	@Override
	public void updateObject(Object obj) throws HibernateException {
		getHibernateTemplate().update(obj);
	}

}
