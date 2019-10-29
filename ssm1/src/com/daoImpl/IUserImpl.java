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
		//1、读取配置文件
		Configuration conf = new Configuration().configure("hibernate.cfg.xml");
		//2、创建sessionFactory对象
		SessionFactory sessionFactory = conf.buildSessionFactory(); 
		//3、创建session连接
	    Session session = sessionFactory.openSession();   
        //4、开启事务
	    Transaction tx = session.beginTransaction(); 
	    //5、存取操作
	    session.save(user);
	    tx.commit(); 
	    session.close();
		return rows;
	}

}
