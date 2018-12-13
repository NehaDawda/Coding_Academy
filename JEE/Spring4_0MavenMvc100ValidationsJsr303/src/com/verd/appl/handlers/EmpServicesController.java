package com.verd.appl.handlers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.PreDestroy;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.verd.appl.entities.Employee;
import com.verd.appl.exceptions.EmpException;
import com.verd.appl.services.EmployeeServices;

// http://localhost:8081/Spring4_0MavenMvc100ValidationsJsr303/getRegistrationPage.do
@Controller("empServicesController")
public class EmpServicesController {
	private static final Logger LOGGER = Logger.getLogger(EmpServicesController.class);
	
	@Autowired
	private EmployeeServices services;
	
	@Autowired
	private Validator validator;
	
	@InitBinder
    private void initBinder(WebDataBinder binder) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
        /*SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
        binder.registerCustomEditor(Date.class, editor);*/
        System.out.println("Validator is set."+validator.hashCode());
    }
	
	@ModelAttribute("employee")
    public Employee createEmployeeModel() {
        // ModelAttribute value should be same as used in the empSave.jsp
        return new Employee();
    }
 
	@RequestMapping("/getRegistrationPage")
	public ModelAndView getRegistrationPage(){
		ModelAndView mAndV = new ModelAndView("EntryPage");
		Employee emp = new Employee(); // This is command object.
		mAndV.addObject("employee", emp);
		return mAndV;
	}
	
    @RequestMapping(value = "/postRegistrationData", method = RequestMethod.POST)
    public String saveEmployeeAction(
            @ModelAttribute("employee") Employee employee,
            BindingResult result, Model model, SessionStatus status) throws EmpException {
    	
    	Set<ConstraintViolation<Employee>> violations = validator.validate(employee);
    	
    	for (ConstraintViolation<Employee> violation : violations)
        {
            String propertyPath = violation.getPropertyPath().toString();
            String message = violation.getMessage();
            // Add JSR-303 errors to BindingResult. This allows Spring to display them in view via a FieldError
            FieldError error = new FieldError("employee",propertyPath,
                    "Invalid "+ propertyPath + "(" + message + ")");
            result.addError(error);
        }
    	
    	model.addAttribute("emp", employee);
    	
    	if (result.hasErrors()) {
    		System.out.println("Invalid values:" + employee);
            return "EntryPage";
        } else {
        	status.setComplete();
        	services.insertNewRecord(employee);
        	return "SaveSuccess";
        }
    }
}
