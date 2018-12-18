package com.lnt.hr.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * http://localhost:8085/GladiatorSessionManagement/appl/sm01/homePage
 */
@Controller("sessionManage01")
@RequestMapping("/sm01")
public class SessionManage01 {

	@RequestMapping("/homePage")
	public String getHomePage(){
		return "HomePage";
	}
	
	@RequestMapping("/noSesssion")
	public String noSesssion(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		
		if (session == null){
			System.out.println("Pass: Session not yet created.");
		} else {
			System.out.println("From noSession: " + session.getId());
			System.out.println("Fail: Session must not exist here");
		}
		return "HomePage";
	}
	
	@RequestMapping("/createSession")
	public String createSession(HttpServletRequest request){
		HttpSession session = request.getSession(true);  // Manual way of creating the session.
		
		if (session == null){
			System.out.println("Fail: Session creation failed.");
		} else {
			System.out.println("From createSession: " + session.getId());
			System.out.println("Pass: Session created here");
		}
		return "HomePage";
	}
	
	@RequestMapping("/removeSession")
	public String removeSession(HttpSession session){
		session.invalidate();
		System.out.println("From removeSession: " + session.getId());
		System.out.println("Session invalidated.");
		return "HomePage";
	}
}
