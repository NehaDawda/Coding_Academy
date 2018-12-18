package com.lnt.hr.controlSecureBack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * http://localhost:8085/GladiatorSessionManagement/appl/secure/homePage
 */
@Controller("secureManage")
@RequestMapping("/secure")
public class SecureManage {

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
		return "InnerPage01";
	}
	
	@RequestMapping("/innerPage01")
	public String innerPage01(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		if (session == null){
			System.out.println("Fail: Session creation failed.");
			return "HomePage";
		} else {
			System.out.println("From createSession: " + session.getId());
			System.out.println("Pass: Session created here");
			return "InnerPage01";
		}
		
	}
	
	@RequestMapping("/innerPage02")
	public String innerPage02(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		
		if (session == null){
			System.out.println("Fail: Session creation failed.");
			return "HomePage";
		} else {
			System.out.println("From createSession: " + session.getId());
			System.out.println("Pass: Session created here");
			return "InnerPage02";
		}
		
	}
	
	@RequestMapping("/removeSession")
	public String removeSession(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		if (session != null) {
			System.out.println("From removeSession: " + session.getId());
			System.out.println("Session invalidated.");
			session.invalidate();
		}
		else {
			System.out.println("Fail: Session missing");
		}
		
		return "ThankingPage";
	}
}
