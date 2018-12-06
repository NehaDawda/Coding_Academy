package com.jp.hr.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.utilities.JPAUtil;

public class DaoEmployeeImpl implements DaoEmployee{
	private EntityManager entityManager;
	
	public DaoEmployeeImpl() throws HrException{
			entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public List<Employee> getEmpList() throws HrException{
		TypedQuery<Employee> query = (TypedQuery<Employee>) entityManager.createQuery("from Employee");
		//Query query = entityManager.createQuery("from Employee");
		List<Employee> empList = query.getResultList();
		return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException{
		return entityManager.find(Employee.class, empId);
	}

	@Override
	public int insertNewRecord(Employee emp) throws HrException{
		entityManager.persist(emp);
		return emp.getEmpId();
		
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
	
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	@Override
	protected void finalize() throws Throwable {
		entityManager.close();
	}
}
