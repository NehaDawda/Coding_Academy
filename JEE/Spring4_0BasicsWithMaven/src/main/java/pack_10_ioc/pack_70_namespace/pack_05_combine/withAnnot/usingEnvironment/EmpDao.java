package pack_10_ioc.pack_70_namespace.pack_05_combine.withAnnot.usingEnvironment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class EmpDao {
	private DataSource ds;
	
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}

	public List<Emp> getAllEmps() {
		String qry = "Select EMPNO, ENAME, SAL from EMP";
		List<Emp> l = new ArrayList<Emp>();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			conn = ds.getConnection();
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
