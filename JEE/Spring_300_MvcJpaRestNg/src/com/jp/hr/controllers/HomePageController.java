package com.jp.hr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;



/*
 * @Controller: A kind of @Component to declare SpringMVC controllers.
 * @RequestMapping: To map a controlling method to the URL.
 * @RequestParam: To take single QueryString or FormData field value.
 * 
 * Multi-action controllers.
 * 
 * http://localhost:8080/Spring_300_MvcJpaRestNg/hr/empList
 * http://localhost:8080/Spring_300_MvcJpaRestNg/hr/empDetails?id=1
 * http://localhost:8080/Spring_300_MvcJpaRestNg/hr/empDetails2/1
 * http://localhost:8080/Spring_300_MvcJpaRestNg/hr/submitForm/1/aaa/bbb
 */
@RestController
public class HomePageController {
	@Autowired
	@Qualifier("service")
	private ServiceEmployee empService;
	
	/*@RequestMapping("homePage.hr")
	public String getHomePage(){
		System.out.println("In getHomePage()");
		return "HomePage";
	}*/
	
	@RequestMapping(value = "/empList",method = RequestMethod.GET,headers="Accept=application/json")
	public List<Employee> getEmpList(){
		List<Employee> empList = null;
		try {
			empList = empService.getEmpList();
			
		} catch (HrException e) {
			e.printStackTrace();
		}
		return empList;
	}
	
	@RequestMapping(value="/empDetails",method = RequestMethod.GET,headers="Accept=application/json")
	public Employee getEmpDetails(@RequestParam("id") int empId){
		Employee emp = null;
		try {
			emp = empService.getEmpDetails(empId);
		} catch (HrException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	@RequestMapping(value="/empDetails2/{id}",method = RequestMethod.GET,headers="Accept=application/json")
	public Employee getEmpDetails2(@PathVariable("id") int empId){
		Employee emp = null;
		try {
			emp = empService.getEmpDetails(empId);
		} catch (HrException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	/*@RequestMapping("registrationForm.hr")
	public String getRegistrationForm(Model model){
		// Define command object
		Employee emp = new Employee();
		model.addAttribute("command", emp);
		
		return "EntryPage";
	}*/
	
	@RequestMapping(value="/submitForm/{id}/{nameF}/{nameL}",method = RequestMethod.GET,headers="Accept=application/json")
	public boolean submitRegistrationForm(@PathVariable("id") int id, @PathVariable("nameF") String nameF, @PathVariable("nameL") String nameL) throws HrException{
		Employee emp = new Employee(id,nameF,nameL);
    	return empService.joinNewEmployee(emp);
	}
}
