package com.ynwi.ssh.service;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.forms.UserForm;

public interface UserManager {

	public void regUser(UserForm user) throws HibernateException;
	
	public ArrayList<User> checkUser(UserForm user) throws HibernateException;

}
