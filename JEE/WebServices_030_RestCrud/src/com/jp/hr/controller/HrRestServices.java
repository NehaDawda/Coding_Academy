package com.jp.hr.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.utilities.ServiceFactory;

@Path("/emps")
public class HrRestServices {

	private ServiceEmployee services;
	
	public HrRestServices() {
		services = ServiceFactory.getService();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Employee> getEmpList() throws HrException{
		ArrayList<Employee> empList = services.getEmpList();
		return empList;
	}
}
