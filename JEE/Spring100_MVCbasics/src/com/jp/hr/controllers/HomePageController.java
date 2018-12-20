package com.jp.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8081/Spring100_MVCbasics/homePage
@Controller
public class HomePageController {

	@RequestMapping("/homePage")
	public String getHomePage(){
		System.out.println("In getHomePage()");
		return "/HomePage.jsp";
	}
}
