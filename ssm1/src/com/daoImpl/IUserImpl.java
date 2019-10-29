package com.daoImpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dao.IUser;
import com.entity.User;

public class IUserImpl implements IUser{

	@Override
	public int save(User user) {
		int rows=-1;
		//1����ȡ�����ļ�
		Configuration conf = new Configuration().configure("hibernate.cfg.xml");
		//2������sessionFactory����
		SessionFactory sessionFactory = conf.buildSessionFactory(); 
		//3������session����
	    Session session = sessionFactory.openSession();   
        //4����������
	    Transaction tx = session.beginTransaction(); 
	    //5����ȡ����
	    session.save(user);
	    tx.commit(); 
	    session.close();
		return rows;
	}

}
