package com.ty.keystore.controller;

import com.ty.keystore.dao.UserDao;
import com.ty.keystore.dto.User;

public class TestSaveUser {
	public static void main(String[] args) {
		User user=new User();
		user.setId(4);
		user.setUserName("likil");
		user.setEmail("lik@mail.com");
		user.setPassword("lik@5678");
		UserDao dao=new UserDao();
		int result=dao.saveUser(user);
		if(result>0)
		{
			System.out.println("Query saved");
		}
		else
		{
			System.out.println("Query not saved");
		}
				
	}
}
