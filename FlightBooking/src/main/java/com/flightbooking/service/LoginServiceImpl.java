package com.flightbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.model.LoginUser;
import com.flightbooking.repository.LoginRepository;

@Service
public class LoginServiceImpl {
	
	@Autowired
	private LoginRepository loginRepository;

	public boolean findByLogin(String username,String password){
	
		LoginUser user=loginRepository.findByUserName(username);
		
		System.out.println("Inside ServiceImpl-----RepoUsername="+user.getUsername()+ "----REpopassword: "+ user.getPassword());
		
		System.out.println("Inside ServiceImpl-----Entered username Username="+username+ "----enteredopassword: "+ password);
		

		if (user!=null && user.getPassword().equals(password))
		{
			return true;
		}else
		{
			return false;
		}
	
	}
	
}
