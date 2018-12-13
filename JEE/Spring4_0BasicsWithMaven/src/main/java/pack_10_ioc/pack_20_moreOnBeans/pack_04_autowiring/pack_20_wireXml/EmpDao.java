package pack_10_ioc.pack_20_moreOnBeans.pack_04_autowiring.pack_20_wireXml;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class EmpDao {
	private DataSource dataSource;
	private GlobalInvestment resource;
	
	public EmpDao(){}
	
	// Autowiring by constructor.
	public EmpDao(DataSource dataSource, GlobalInvestment resource) {
		super();
		this.dataSource = dataSource;
		this.resource = resource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void setResourceBean(GlobalInvestment resource){
		this.resource = resource;
		System.out.println("Hashcode GlobalInvestment from Client(EmpDao)"+resource.hashCode());
	}
	
	public List<Emp> getAllEmps() {
		// Report head
		System.out.println(resource.getFirmName());
		
		// Report details
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
