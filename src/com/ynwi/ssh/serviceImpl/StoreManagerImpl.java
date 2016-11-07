package com.ynwi.ssh.serviceImpl;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.ynwi.ssh.beans.Buy;
import com.ynwi.ssh.beans.Clerk;
import com.ynwi.ssh.beans.Commdityplan;
import com.ynwi.ssh.beans.Member;
import com.ynwi.ssh.beans.Store;
import com.ynwi.ssh.dao.StoreDao;
import com.ynwi.ssh.forms.ClerkForm;
import com.ynwi.ssh.forms.StoreForm;
import com.ynwi.ssh.service.StoreManager;

public class StoreManagerImpl implements StoreManager{

	private StoreDao dao;
	
	
	
	public StoreDao getDao() {
		return dao;
	}

	public void setDao(StoreDao dao) {
		this.dao = dao;
	}

	@Override
	public void saveObject(StoreForm sf) throws HibernateException {
		Store st = new Store();
		BeanUtils.copyProperties(sf, st);
		dao.saveObject(st);
	}

	@Override
	public ArrayList<Store> storelist() throws HibernateException {
		return dao.storelist();
	}

	@Override
	public void updateObject(Store st) throws HibernateException {
		dao.updateObject(st);
	}

	@Override
	public ArrayList<Member> getmembers() throws HibernateException {
		
		return dao.getmemberlist();
	}

	@Override
	public ArrayList<Buy> getbuylist() throws HibernateException {
		return dao.getbuylist();
	}

	@Override
	public void saveObject2(ClerkForm sf) throws HibernateException {
		Clerk cl = new Clerk();
		BeanUtils.copyProperties(sf, cl);
		dao.saveObject(cl);
	}

	@Override
	public ArrayList<Clerk> clerklist() throws HibernateException {
		// TODO Auto-generated method stub
		return dao.getclerklist();
	}

}
