package com.company.appl;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Home page: http://localhost:8081/Spring4_0MavenMvc210FormAuthenticate/
 * Admin page: http://localhost:8081/Spring4_0MavenMvc210FormAuthenticate/admin
 * 
 * Try after logout:
 * 	http://localhost:8081/Spring4_0MavenMvc210FormAuthenticate/admin/innerPage
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Home";
	}
	
	@RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Spring Authentication");
		model.addObject("message", "This is protected page!");
		
		model.setViewName("Admin");
 
		return model;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {
 
		ModelAndView model = new ModelAndView();
		if (logout == null){
			if (error != null) {
				model.addObject("error", "Invalid username and password!");
			}
			model.setViewName("Login");
		} else {
			model.addObject("title", "Spring Security Spring Authentication");
			model.addObject("msg", "You've been logged out successfully.");
			model.setViewName("Logout");
		}
		
		return model;
	}
	
	@RequestMapping(value = "/admin/innerPage", method = RequestMethod.GET)
	public ModelAndView innerPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Spring Authentication");
		model.addObject("message", "This is inner page!");
		
		
		model.setViewName("Innerpage");
 
		return model;
	}
}
