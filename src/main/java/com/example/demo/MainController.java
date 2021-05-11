package com.example.demo;



import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.bean.AuthBean;
import com.demo.services.Authentication;



@Controller
public class MainController {
	Authentication ab= new Authentication();
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@ModelAttribute AuthBean auth, Model model,HttpServletRequest request) {
    	HttpSession session = request.getSession(true);
    	
    	System.out.println("session id : "+session.getAttribute("userId"));
    	System.out.println(auth.getmId());
    	System.out.println(auth.getmPw());
		return "main";
	}
    
    @RequestMapping(value = "/LOGIN", method = RequestMethod.POST)
 	public String login(@ModelAttribute AuthBean auth,Model model,HttpServletRequest request) {
    		auth.setsCode("Login");
    		System.out.println(auth.getmId());
        	System.out.println(auth.getmPw());
 		return ab.entrance(auth, model,request);
 	}
    
    @RequestMapping(value = "/LOGOUT", method = RequestMethod.POST)
	public String logout( @ModelAttribute AuthBean auth,Model model,HttpServletRequest request) {
	
    	 auth.setsCode("Logout");
		
		return ab.entrance(auth, model, request);
		
	}
    
    @RequestMapping(value = "/ADMIN", method = RequestMethod.POST)
   	public String admin( @ModelAttribute AuthBean auth,Model model,HttpServletRequest request) {
   	
       	 auth.setsCode("Admin");
   		
   		return ab.entrance(auth, model, request);
   		
   	}
}