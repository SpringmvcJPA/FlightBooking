package com.flightbooking.repository;

import org.springframework.stereotype.Repository;

import com.flightbooking.model.LoginUser;


@Repository("loginRepository")
public class LoginRepository {

	
	public LoginUser findByUserName(String username){
		
		LoginUser user=null;
		user= new LoginUser();	
		
		System.out.println("Username"+username);
		
		if(username.equals("vihi")){			 	
			user.setUsername("vihi");
			user.setPassword("vihaan");	
		}
		else	
		{
			
			user.setUsername("4444");
			user.setPassword("5555");	
			System.out.println("Invalid user");
		}
		return user;
	}
}
