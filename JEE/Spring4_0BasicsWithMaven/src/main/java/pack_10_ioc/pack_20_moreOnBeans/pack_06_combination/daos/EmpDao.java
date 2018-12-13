package pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.services.IGlobInvestment;

//@Repository("empDao")
public class EmpDao {
	private DataSource dataSource;
	
	public EmpDao(){
		
	}
	
	//@Resource // If this annotation fails in wiring by type, picks up method name and does wiring by Name.
	public void setDataSource1(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Emp> getAllEmps() {
		
		String qry = "Select EMPNO, ENAME, SAL from EMP";
		List<Emp> l = new ArrayList<Emp>();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(qry);
			
			while(rs.next()){
				Emp ep = new Emp();
				ep.setEmpNo(rs.getInt("EMPNO"));
				ep.setEmpNm(rs.getString("ENAME"));
				ep.setEmpSal(rs.getFloat("SAL"));
				l.add(ep);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try { rs.close(); stmt.close(); conn.close(); } catch(Exception e) { }
		}
		
		return l;
	}
}
