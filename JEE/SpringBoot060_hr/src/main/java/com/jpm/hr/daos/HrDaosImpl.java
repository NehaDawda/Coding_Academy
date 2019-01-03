package com.jpm.hr.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jpm.hr.entities.Employee;
import com.jpm.hr.exceptions.HrException;

@Repository("hrDao")
public class HrDaosImpl implements HrDaos {
	private static final long serialVersionUID = 7312702558266191148L;

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Employee getEmpDetails(int empNo) throws HrException {
		//Employee emp = new Employee(1,"aaa",80000.0f);
		Employee emp = manager.find(Employee.class, empNo);
		return emp;
	}

}
