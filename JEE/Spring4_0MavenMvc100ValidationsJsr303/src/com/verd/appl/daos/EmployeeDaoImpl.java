package com.verd.appl.daos;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.verd.appl.entities.Employee;
import com.verd.appl.exceptions.EmpException;

@Repository
//@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sFactory;
	
	@Override
	public int insertNewRecord(Employee emp) throws EmpException {
		System.out.println("Validated emp data reached here: " + emp);
		/*Session session = null;
		Transaction trans = null;
		Integer value = 0;
		try {
			session = sFactory.openSession();
			trans = session.beginTransaction(); // Transaction boundary begins here.
			value = (Integer)session.save(emp); // Returns Id value.
			//session.persist(emp);
			trans.commit();	// Transaction boundary ends here.
		} catch (HibernateException e) {
			trans.rollback(); // Transaction boundary ends here.
			throw new EmpException("Encountered problem while updating name.", e);
		} finally {
			session.close();
		}
		return value;
		*/
		return 0;
	}
	
	public void closeResources(){
		if (sFactory != null){
			System.out.println("Factory closed.");
			sFactory.close();
		}
	}
}
