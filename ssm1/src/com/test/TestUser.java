package com.test;

import com.dao.IUser;
import com.daoImpl.IUserImpl;
import com.entity.User;

public class TestUser {
	public static void main(String[] args) {
		IUser users=new IUserImpl();
		User user=new User(0,"Àî°×","123");
		users.save(user);
		System.out.println(user);
	}

}
