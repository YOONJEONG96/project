package com.demo.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.demo.bean.AuthBean;
import com.demo.util.AjaxCall;

public class Authentication {

	String page;
	
	
	public String entrance(AuthBean auth,Model model,HttpServletRequest request) {
		
		switch(auth.getsCode()) {
				
		case "Login" : logInCtl(auth, model,request);
					break;
		case "Logout" : logOutCtl(auth, model,request);
					break;
		case "Admin" : adminCtl(auth,model,request);
					break;
		}
		return page;
	}
	
	@SuppressWarnings("unused")
	private String logInCtl(AuthBean auth,Model model,HttpServletRequest request) {
		String msg;
		
		System.out.println("여기로옴");
		
		HttpSession session = request.getSession(true);
		
		if(auth.getmId().equals("test")) {
			model.addAttribute("id", auth.getmId());
			session.setAttribute("userId", auth.getmId());
			
			String userId = (String)session.getAttribute("userId");
			
			page = "login";
			if(auth.getmPw().equals("1234")) {
				model.addAttribute("pw", auth.getmPw());
				System.out.println("session id : "+userId);
				
				msg= "로그인 성공";
				page = "login";
				
			}else {
				System.out.println("비밀번호 확인해주세요");
				msg= "로그인 실패(비밀번호)";
				
				page = "home";
			}
		}else {
			System.out.println("아이디 확인바람");
			model.addAttribute("msg", "fail");
			msg= "로그인 실패(아이디)";
			page = "home";
		}
		
		
		model.addAttribute("msg", msg);
		
		page = "login";
		return page;
	}
	
	private String logOutCtl(AuthBean auth,Model model,HttpServletRequest request) {
		String msg;
		
		System.out.println("여기로옴");
		
		HttpSession session = request.getSession();
		session.invalidate();
		System.out.println("로그아웃");
			
		
		page = "main";
		return page;
	}
	
	private String adminCtl(AuthBean auth,Model model,HttpServletRequest request) {
		
		System.out.println("관리자 리스트");
		AjaxCall ajax = new AjaxCall() {};
		
		System.out.println("gg:"+ajax.getJsonParam().toString());
		model.addAttribute("Admin",ajax.getJsonParam().toString() );
		
		page = "admin";
		return page;
	}
}
