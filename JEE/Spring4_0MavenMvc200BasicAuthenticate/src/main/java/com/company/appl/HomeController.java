package com.company.appl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
 URLS: 
 	To visit Home page...
 		http://localhost:8081/Spring4_0MavenMvc200BasicAuthenticate/welcome
 		
 	To visit inner pages...
 		http://localhost:8081/Spring4_0MavenMvc200BasicAuthenticate/admin
 */

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView();
		model.addObject("pageTitle", "Basic Authentication");
		model.addObject("pageHead", "Spring Security Spring Authentication");
		model.addObject("message", "This is welcome page!!");
		
		model.setViewName("hello");
		
		return model;
	}
 
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Spring Authentication");
		model.addObject("message", "This is protected page!");
		
		model.setViewName("admin");
 
		return model;
	}
	
	@RequestMapping(value = "/admin/innerpage", method = RequestMethod.GET)
	public ModelAndView innerPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Spring Authentication");
		model.addObject("message", "This is inner page!");
		
		model.setViewName("innerpage");
 
		return model;
	}
}
