package com.jpm.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// http://localhost:8080/Spring400_BasicAuth/admin/inner
@Controller
public class HrController {

	@RequestMapping(value="/admin/inner")
	public ModelAndView getInnerPage(){
		ModelAndView mAndV = new ModelAndView();
		
		mAndV.addObject("message", "J. P. Morgan");
		mAndV.setViewName("Inner");
		return mAndV;
	}
}
