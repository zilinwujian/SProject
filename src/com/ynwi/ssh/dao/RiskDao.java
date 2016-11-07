package com.ynwi.ssh.dao;

import org.hibernate.HibernateException;

public interface RiskDao {
	public void saveObject(Object obj) throws HibernateException;

	public void updateObject(Object obj)throws HibernateException;
}
