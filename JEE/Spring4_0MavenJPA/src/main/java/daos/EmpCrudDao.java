package daos;

import java.io.Serializable;
import java.util.List;

import dto.Emp;

public interface EmpCrudDao extends Serializable {
	//Emp getEmpOnId(int empId);
	List<Emp> getAllEmps();
}
