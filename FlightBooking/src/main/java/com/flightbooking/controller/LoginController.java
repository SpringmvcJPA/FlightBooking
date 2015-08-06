package com.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.flightbooking.model.LoginUser;
import com.flightbooking.service.LoginServiceImpl;

@Controller
@SessionAttributes("login")
public class LoginController {
	
	@Autowired
	private LoginServiceImpl loginService;

@RequestMapping(value="/Login" , method=RequestMethod.GET)
	public String greeting(Model model){
		
	LoginUser login=new LoginUser();
	
	
	
	model.addAttribute("login", login);
	System.out.println("------- INSIDE CONTROLLER -----------" );
	System.out.println("Username:"+ login.getUsername());	
	System.out.println("Pwd:"+ login.getPassword());	
	
	
	return "login";
	
}

@RequestMapping(value="/Login", method=RequestMethod.POST )
public String updateusername(@ModelAttribute("login") LoginUser login){
	
	System.out.println("Username:"+ login.getUsername());	
	System.out.println("Pwd:"+ login.getPassword());	
System.out.println("------- INSIDE UpdateUserName -----------" );


if (loginService.findByLogin(login.getUsername(), login.getPassword())){
	return "redirect:searchflight.html";
}else
{
	return "error";
}

}
}
