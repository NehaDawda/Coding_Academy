/**
 * 
 */
package com.lnt.maven.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.hibernate.SessionFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lnt.emp_project.dao.EmployeeDaoImpl;
import com.lnt.emp_project.dao.IEmployeeDao;
import com.lnt.emp_project.model.Address;
import com.lnt.emp_project.model.Employee;
import com.lnt.emp_project.util.HibernateUtil;

/**
 * @author brije
 *
 */
public class TestEmpDao {
	private IEmployeeDao employeeDao;
	static Long empId=1L;
	static Employee employee=null;
	@BeforeClass
	public void testEmployeeDao(){
		employeeDao= new EmployeeDaoImpl();
		assertNotNull(employeeDao, "employeeDao is not created is null");
	}
	
	@Test
	public void testAddEmployee(){
		Address address = new Address( "Sky App", "400708", "Mumbai"); 
		employee= new Employee("Smita", 999.99,address);
		
		employee.setAddress(address);//one to one relationship
		address.setEmployee(employee);//one to one relationship
		
		empId=employeeDao.addEmployee(employee);
		//setting the auto-generated id
		employee.setEmpId(empId);
		assertTrue(empId>0, "Employee not added ");
	}
/*	@Test
	public void testUpdateEmployee(){
		employee.setEmpId(empId);
		
		employeeDao.updateEmp(employee);
		assertTrue(empId>0, "Employee not added ");
	}*/
	
}
