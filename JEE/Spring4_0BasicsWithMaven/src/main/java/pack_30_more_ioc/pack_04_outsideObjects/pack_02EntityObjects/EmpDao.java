package pack_30_more_ioc.pack_04_outsideObjects.pack_02EntityObjects;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	List<Emp> emps;

	public EmpDao() {
		super();
		emps = new ArrayList<Emp>();
		
		Emp e1 = new Emp(101, "A", 20100);
		Emp e2 = new Emp(102, "B", 20200);
		Emp e3 = new Emp(103, "C", 20300);
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
	}
	
	public List<Emp> getEmps(){
		return emps;
	}
}
