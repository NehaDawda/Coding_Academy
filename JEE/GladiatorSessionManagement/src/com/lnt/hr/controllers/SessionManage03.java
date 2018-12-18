package com.lnt.hr.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * http://localhost:8085/GladiatorSessionManagement/appl/sm03/homePage
 * 
 * This approach autowires the HttpSession object within a class.
 * 		Before autowiring, Spring has to create a session object.
 * 		This approach creates a session automatically.
 * 	This approach allows injecting session even in non-controller/core layer objects.
 */

@Controller("sessionManage03")
@RequestMapping("/sm03")
public class SessionManage03 {
	
	@Resource
	HttpSession session;
	
	@RequestMapping("/homePage")
	public String getHomePage(){
		return "HomePage";
	}
	
	// Be aware.  This method is creating a session as it is receiving a Session parameter.
	@RequestMapping("/noSesssion")
	public String noSesssion(){
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
		//HttpSession session = request.getSession(true);
		
		if (session == null){
			System.out.println("Fail: Session creation failed.");
		} else {
			System.out.println("From createSession: " + session.getId());
			System.out.println("Pass: Session created here");
		}
		return "HomePage";
	}
	
	@RequestMapping("/removeSession")
	public String removeSession(){
		session.invalidate();
		System.out.println("From removeSession: " + session.getId());
		System.out.println("Session invalidated.");
		return "HomePage";
	}
}
