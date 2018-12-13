package services;

import java.io.Serializable;
import java.util.List;

import dto.Emp;

public interface EmpCrudServices extends Serializable {
	//Emp getEmpOnEmpId(int empId);
	List<Emp> getEmpList();
}
