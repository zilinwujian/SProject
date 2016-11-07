package com.ynwi.ssh.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;

import com.ynwi.ssh.beans.Member;
import com.ynwi.ssh.beans.Record;
import com.ynwi.ssh.beans.User;

public interface MemberDao {

	public void saveObject(Object obj) throws HibernateException;

	public void updateObject(Object obj)throws HibernateException;
	
	public void createrecord(int price,int memberid)throws HibernateException;
	
	public Member findMember(int id)throws HibernateException;

	public ArrayList<Record> getrlist()throws HibernateException;
}
