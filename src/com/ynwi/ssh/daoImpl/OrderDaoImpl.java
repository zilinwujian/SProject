package com.ynwi.ssh.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ynwi.ssh.beans.Commdity;
import com.ynwi.ssh.beans.Commdityplan;
import com.ynwi.ssh.beans.Member;
import com.ynwi.ssh.beans.Order;
import com.ynwi.ssh.beans.Record;
import com.ynwi.ssh.dao.OrderDao;

public class OrderDaoImpl  extends HibernateDaoSupport implements OrderDao{

	@Override
	public void saveObject(Object o) throws HibernateException {
		getHibernateTemplate().save(o);
	}

	@Override
	public int update(int oid) throws HibernateException {
		Order o = getHibernateTemplate().get(Order.class,oid);
		int cid = o.getCommdityid();
		Commdity c = getHibernateTemplate().get(Commdity.class,cid);
		Member m = getHibernateTemplate().get(Member.class,o.getMemberid());
		int price = c.getPrice()*o.getNumber();
		if(price>m.getMoney()){
			return -1;
		}else{
			m.setMoney(m.getMoney() - price);
			getHibernateTemplate().update(m);
			o.setStatus(1);
			getHibernateTemplate().update(o);
			return 0;
		}
	}

	@Override
	public ArrayList<Order> getlist() throws HibernateException {
		String hql = "from Order";
		List<Order> storelist=  getHibernateTemplate().find(hql);
		return (ArrayList<Order>) storelist;
	}

}
