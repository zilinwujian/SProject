package com.ynwi.ssh.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.User;

public interface BaseDao {

	public void saveObject(Object obj) throws HibernateException;

	public ArrayList<User> checkAccount(String account, String password);
}
