package daos;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import dto.Emp;

@Repository("empDao")
public class EmpCrudDaoImpl implements EmpCrudDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	// Get a list of all emps.
		@Override
		public List<Emp> getAllEmps() {
			String sql = "SELECT e FROM empRec e";
			Query qry = entityManager.createQuery(sql);
			
			List<Emp> empList = qry.getResultList();
			return empList;
		}
		
	/*
	// Get a record on given EmpId.- MapResultSet
	public Emp getEmpOnId(int empId){
		String sql = "SELECT empNo, eName, sal FROM emp WHERE empNo=?";
		Object[] params = new Object[]{empId};
		MyRowMapper mapper = new MyRowMapper(ctx);
		
		Emp emp = jdbcTemplate.queryForObject(sql, params, mapper);
		return emp;
	}
	
	// Insert a record.
	
	// Delete
	// Update
	// Batch Insert
	// Page Fetching
	// Queries with Joins
}

class MyRowMapper implements ParameterizedRowMapper<Emp> {
	private ConfigurableApplicationContext ctx;
	
	public MyRowMapper(ConfigurableApplicationContext ctx){
		this.ctx = ctx;
	}
	
	@Override
	public Emp mapRow(ResultSet rs, int arg1) throws SQLException {
		Emp emp = ctx.getBean("emp", Emp.class);
		
		emp.setEmpNo(rs.getInt("empNo"));
		emp.setEmpNm(rs.getString("eName"));
		emp.setEmpSal(rs.getFloat("sal"));
		
		return emp;
	}*/
}
