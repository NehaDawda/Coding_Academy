package com.lnt.hr.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * http://localhost:8085/GladiatorSessionManagement/appl/sm02/homePage
 * 
 * Observe the noSession().
 * 		It is taking HttpSession parameter.  Here, Spring MVC creates a session and passes
 * 			it to this method.
 * 		The code continue using same session until invalidated.
 * 
 * 		After invalidation, if control comes to noSession() again, it creates a new session.
 */
@Controller("sessionManage02")
@RequestMapping("/sm02")
public class SessionManage02 {
	
	@RequestMapping("/homePage")
	public String getHomePage(){
		return "HomePage02";
	}
	
	// Be aware.  This method is creating a session as it is receiving a Session parameter.
	@RequestMapping("/noSesssion")
	public String noSesssion(HttpSession session){
		if (session == null){
			System.out.println("Pass: Session not yet created.");
		} else {
			System.out.println("From noSession: " + session.getId());
			System.out.println("Fail: Session must not exist here");
		}
		return "HomePage02";
	}
	
	@RequestMapping("/createSession")
	public String createSession(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		
		if (session == null){
			System.out.println("Fail: Session creation failed.");
		} else {
			System.out.println("From createSession: " + session.getId());
			System.out.println("Pass: Session created here");
		}
		return "HomePage02";
	}
	
	@RequestMapping("/removeSession")
	public String removeSession(HttpSession session){
		session.invalidate();
		System.out.println("From removeSession: " + session.getId());
		System.out.println("Session invalidated.");
		return "HomePage02";
	}
}
