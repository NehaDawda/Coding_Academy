package com.jp.hr.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;

@Controller
public class HomePageController {
	@Autowired
	@Qualifier("service")
	private ServiceEmployee empService;
	
	@InitBinder
	private void validaterBinder(WebDataBinder binder){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
        binder.registerCustomEditor(Date.class, editor);
	}
	
	@RequestMapping("homePage.hr")
	public String getHomePage(){
		System.out.println("In getHomePage()");
		return "HomePage";
	}
	
	@RequestMapping("getEmpList.hr")
	public ModelAndView getEmpList(){
		ModelAndView mAndV = new ModelAndView();
		try {
			List<Employee> empList = empService.getEmpList();
			mAndV.addObject("empList", empList);
			
			mAndV.setViewName("EmpList");
		} catch (HrException e) {
			e.printStackTrace();
		}
		return mAndV;
	}
	
	@RequestMapping("empDetails.hr")
	public ModelAndView getEmpDetails(@RequestParam("id") int empId){
		ModelAndView mAndV = new ModelAndView();
		try {
			Employee emp = empService.getEmpDetails(empId);
			mAndV.addObject("empDetails", emp);
			
			mAndV.setViewName("EmpDetails");
		} catch (HrException e) {
			e.printStackTrace();
		}
		return mAndV;
	}
	
	@RequestMapping("registrationForm.hr")
	public String getRegistrationForm(Model model){
		// Define command object
		
		Employee emp = new Employee();
		model.addAttribute("command", emp);
		
		return "EntryPage";
	}
	
	@RequestMapping("submitRegistrationData.hr")
	public String submitRegistrationData(@Valid @ModelAttribute("command") Employee emp, BindingResult result, Model model){
		// Define command object
		System.out.println(emp);
    	
    	if (result.hasErrors()) {
    		
    		populateError("empId", model, result);
            populateError("email", model, result);
            populateError("firstName", model, result);
            
            return "EntryPage";
        } else {
        	//try {
    			//empService.joinNewEmployee(emp);
    			return "SaveSuccess";
    		/*} catch (HrException e) {
    			model.addAttribute("msg", "Insert failed.  " + e.getMessage());
    			return "EntryPage";
    		}*/
        }
	}
	
	private void populateError (String field, Model model, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors(field)) {
            model.addAttribute(field + "Error", bindingResult.getFieldError(field)
                                                             .getDefaultMessage());
        }
	}
}
