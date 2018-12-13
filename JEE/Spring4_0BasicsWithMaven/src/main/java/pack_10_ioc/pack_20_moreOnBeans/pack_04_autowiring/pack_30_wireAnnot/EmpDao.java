package pack_10_ioc.pack_20_moreOnBeans.pack_04_autowiring.pack_30_wireAnnot;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
//import javax.inject.Qualifier;  // This annotation does not meant for qualifying a bean.  It is used to qualify annotation interface definition
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("empDao")
public class EmpDao {
	private DataSource dataSource;
	private IGlobInvestment resource;
	
	public EmpDao(){
		System.out.println("Hashcode EmpDao from Constructor:"+this.hashCode());
	}
	/*
	// Default For type
	@Autowired
	//@Resource // If this annotation fails in wiring by type, picks up method name and does wiring by Name.
	//@Inject
	public void setDataSource1(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	*/
	///* By Name
	//@Autowired@Qualifier("dataSource1")
	//@Resource(name="dataSource1")
	@Inject//@Qualifier("dataSource1")
	public void setDataSource1(DataSource dataSource){
		this.dataSource = dataSource;
	}
	//*/
	
	
	@Resource
	public void setMainResource(IGlobInvestment resource){
		this.resource = resource;
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
