/**
 * 
 */
package com.jpm.jpacrud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Neha
 *
 */

@Entity // tell JPA that this class object need to be persisted
@Table(name ="emp_jpacrud") // tell JPA that this class object need to be mapped to be mapped with this table
public class Employee {
	@Id //Primary Key
	//@GeneratedValue(strategy=GenerationType.TABLE)
	@SequenceGenerator(name="EMP_GEN", sequenceName="emp_master_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_GEN")
	private Long employeeId;
	private String name;
	private Double salary;
	
	//no-arg constr
	public Employee() {
		super();
	}

	//overloaded constr
		public Employee(String name, Double salary) {
			super();
			this.name = name;
			this.salary = salary;
	}
		
	//overloaded constr
	public Employee(Long employeeId, String name, Double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
