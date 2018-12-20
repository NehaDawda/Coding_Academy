package com.jp.hr.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jp.hr.entities.Dept;
import com.jp.hr.entities.Emp;
import com.jp.hr.exceptions.HrException;

@Repository("daoDS")
public class DaoEmployeeImplJPA implements DaoEmployee {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Emp> getEmpList() throws HrException {
		String sql = "SELECT e FROM empRecNew e";
		Query qry = entityManager.createQuery(sql);
		
		List<Emp> empList = qry.getResultList();
		return empList;
	}

	@Override
	public List<Dept> getDeptList() throws HrException {
		String sql = "SELECT d FROM dept d";
		Query qry = entityManager.createQuery(sql);
		
		List<Dept> deptList = qry.getResultList();
		return deptList;
	}

	@Override
	public Emp getEmpDetails(int empId) throws HrException {
		Emp emp = entityManager.find(Emp.class, empId);
		return emp;
	}

	@Override
	public Dept getDeptDetails(int deptId) throws HrException {
		Dept dept = entityManager.find(Dept.class, deptId);
		return dept;
	}
	
	/*
	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
		// TODO Auto-generated method stub
		return false;
	}*/

}
