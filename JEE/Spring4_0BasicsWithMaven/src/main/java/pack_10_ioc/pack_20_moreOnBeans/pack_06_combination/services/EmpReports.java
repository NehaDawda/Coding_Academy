package pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.services;

import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.daos.Emp;
import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.daos.EmpDao;

public class EmpReports {
	private EmpDao empDao;
	private IGlobInvestment globalInvestment;
	
	public EmpReports(EmpDao empDao){
		this.empDao = empDao;
	}

	public void setGlobalInvestment(IGlobInvestment globalInvestment){
		this.globalInvestment = globalInvestment;
	}
	
	public void prepareReport(){
		// Report head
		System.out.println(globalInvestment.getFirmName());
		
		for(Emp l : empDao.getAllEmps()){
			System.out.println(l);
		}		
	}
}
