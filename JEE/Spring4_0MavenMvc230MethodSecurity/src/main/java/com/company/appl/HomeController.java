package com.company.appl;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.company.daos.EmpDao;

/**
 * Handles requests for the application home page.
 * url: http://localhost:8081/Spring4_0MavenMvc230MethodSecurity/admin
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private EmpDao empDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("empList", empDao.getAllEmps());
		
		return "home";
	}
	
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Spring Authentication");
		model.addObject("message", "This is protected page!");
		
		model.setViewName("Admin");
 
		return model;
	}
	
	@RequestMapping(value = "/innerpage**", method = RequestMethod.GET)
	public ModelAndView innerPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Spring Authentication");
		model.addObject("message", "This is inner page!");
		
		model.setViewName("Innerpage");
 
		return model;
	}
	
}
