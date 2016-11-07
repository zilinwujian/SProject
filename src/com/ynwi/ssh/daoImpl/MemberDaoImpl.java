package com.ynwi.ssh.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ynwi.ssh.beans.Member;
import com.ynwi.ssh.beans.Record;
import com.ynwi.ssh.beans.Store;
import com.ynwi.ssh.dao.MemberDao;

public class MemberDaoImpl extends HibernateDaoSupport implements MemberDao{

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}

	@Override
	public void updateObject(Object obj) throws HibernateException {
		getHibernateTemplate().update(obj);
	}

	@Override
	public Member findMember(int id) throws HibernateException {
		Member member = null;
		member = getHibernateTemplate().get(Member.class,id);
		return member;
	}

	@Override
	public void createrecord(int price, int memberid) throws HibernateException {
		Record r = new Record();
		r.setMemberid(memberid);
		r.setPrice(price);
		r.setDate(new java.util.GregorianCalendar().getTime());
		getHibernateTemplate().save(r);
	}

	@Override
	public ArrayList<Record> getrlist() throws HibernateException {
		String hql = "from Record";
		List<Record> storelist=  getHibernateTemplate().find(hql);
		return (ArrayList<Record>) storelist;
	}

	

}
