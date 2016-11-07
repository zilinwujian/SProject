package com.ynwi.ssh.serviceImpl;

import java.util.ArrayList;
import java.util.Map;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.opensymphony.xwork2.ActionContext;
import com.ynwi.ssh.beans.Commdityplan;
import com.ynwi.ssh.beans.Order;
import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.dao.OrderDao;
import com.ynwi.ssh.forms.OrderForm;
import com.ynwi.ssh.service.OrderManager;

public class OrderManagerImpl implements OrderManager{

	private OrderDao dao;
	@Override
	public void sav(OrderForm of) {
		Order o = new Order();
		BeanUtils.copyProperties(of,o);
		o.setStatus(0);
		Map session = ActionContext.getContext().getSession();
		User now = (User) session.get("user");
		int id = now.getUserId();
		o.setMemberid(id);
		dao.saveObject(o);
	}

	@Override
	public int upd(int oid) {
		return dao.update(oid);
	}

	public OrderDao getDao() {
		return dao;
	}

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

	@Override
	public ArrayList<Order> getlist() throws HibernateException {
		return dao.getlist();
	}

}
