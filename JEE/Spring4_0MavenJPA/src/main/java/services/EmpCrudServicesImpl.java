package services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import daos.EmpCrudDao;
import dto.Emp;

@Service("empServices")
public class EmpCrudServicesImpl implements EmpCrudServices {

	private EmpCrudDao empDao;
	
	@Resource(name="empDao")
	public void setEmpDao(EmpCrudDao empDao) {
		this.empDao = empDao;
	}

	/*@Override
	public Emp getEmpOnEmpId(int empId) {
		Emp emp = empDao.getEmpOnId(empId);
		return emp;
	}*/
	
	@Transactional(readOnly = true)
	@Override
	public List<Emp> getEmpList() {
		return empDao.getAllEmps();
	}
}
