package com.ynwi.ssh.service;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.User;
import com.ynwi.ssh.forms.UserForm;
import com.ynwi.ssh.forms.UserRegForm;

public interface UserManager {

	public void regUser(UserRegForm user) throws HibernateException;
	
	public ArrayList<User> checkUser(UserForm user) throws HibernateException;

}
