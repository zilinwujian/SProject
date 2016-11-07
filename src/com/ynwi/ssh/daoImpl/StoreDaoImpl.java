package com.ynwi.ssh.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ynwi.ssh.beans.Buy;
import com.ynwi.ssh.beans.Clerk;
import com.ynwi.ssh.beans.Commdityplan;
import com.ynwi.ssh.beans.Member;
import com.ynwi.ssh.beans.Store;
import com.ynwi.ssh.dao.StoreDao;

public class StoreDaoImpl  extends HibernateDaoSupport implements StoreDao{

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}

	@Override
	public ArrayList<Store> storelist() throws HibernateException {
		String hql = "from Store";
		List<Store> storelist=  getHibernateTemplate().find(hql);
		return (ArrayList<Store>) storelist;
	}

	@Override
	public void updateObject(Object obj) throws HibernateException {
		getHibernateTemplate().update(obj);
	}

	@Override
	public ArrayList<Member> getmemberlist() throws HibernateException {
		String hql = "from Member";
		List<Member> mlist =getHibernateTemplate().find(hql);
		return (ArrayList<Member>) mlist;
	}

	@Override
	public ArrayList<Buy> getbuylist() throws HibernateException {
		String hql = "from Buy";
		List<Buy> mlist =getHibernateTemplate().find(hql);
		return (ArrayList<Buy>) mlist;
	}

	@Override
	public ArrayList<Clerk> getclerklist() throws HibernateException {
		String hql = "from Clerk";
		List<Clerk> clist =getHibernateTemplate().find(hql);
		return (ArrayList<Clerk>) clist;
	}
	
}
