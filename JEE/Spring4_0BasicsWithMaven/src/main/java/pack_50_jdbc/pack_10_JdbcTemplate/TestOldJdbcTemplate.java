package pack_50_jdbc.pack_10_JdbcTemplate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

// Template imports
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

// Mapping imports
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import pack_50_jdbc.pack_common.EmpPojo;

/*Example 34: Spring's JDBC wrapper features.
 * 
 */
public class TestOldJdbcTemplate { 
	
	public static void main(String[] args) {
		BeanFactory beanFact = new XmlBeanFactory(new ClassPathResource(
        "pack_50_jdbc\\pack_10_JdbcTemplate\\context.xml"));
		
		
	// Using JdbcTemplate
		JdbcTemplate jdbcTemplate = (JdbcTemplate)beanFact.getBean("emp_jdbcTemplate");
		String query;
		
		/*
	//Using NamedParaJdbcTemplate
		NamedParameterJdbcTemplate namedParaJdbcTemplate = (NamedParameterJdbcTemplate)beanFact.getBean("emp_namedParaJdbcTemplate");
		
		query = "Select SAL from EMP where EMPNO=:givenImpId";
		*/
		/*
		// Mapping the named parameter with actual value
		SqlParameterSource namedPara = new MapSqlParameterSource("givenImpId", 7521);
		
		float sal = (Float)namedParaJdbcTemplate.queryForObject(query, namedPara, Float.class);
		System.out.println("(1)Salary for Emp 7521 is:"+sal);
		*/
		/*
		// Passing mapped name through Map
		Map namedParameter  = Collections.singletonMap("givenImpId", 7521);
		Float sal = (Float)namedParaJdbcTemplate.queryForObject(query, namedParameter, Float.class);
		System.out.println("(2)Salary for Emp 7521 is:"+sal);
		*/
		/*
	// Using SimpleJdbcTemplate
		SimpleJdbcTemplate simpleJdbcTemplate = (SimpleJdbcTemplate)beanFact.getBean("emp_simpleJdbcTemplate");
		query = "Select EMPNO, ENAME, SAL from EMP where EMPNO=?";
		ParameterizedRowMapper<EmpPojo> mapper = new ParameterizedRowMapper<EmpPojo>(){

			public EmpPojo mapRow(ResultSet rs, int rowNum) throws SQLException{
				EmpPojo emp = new EmpPojo();
				emp.setEmpNo(rs.getInt("EMPNO"));
				emp.setEmpNm(rs.getString("ENAME"));
				emp.setEmpSal(rs.getFloat("SAL"));
				return emp;
			}
		};
		
		EmpPojo emp = simpleJdbcTemplate.queryForObject(query, mapper, 7521);
		System.out.println("Object for empNo-7521 is:"+emp);
		
		query="Select EMPNO, ENAME, SAL from EMP";
		List<Map<String, Object>> list = simpleJdbcTemplate.queryForList(query, new Object[] {});
		for(Map<String, Object> mp :list){
			System.out.print("EmpNo:"+mp.get("EMPNO"));
			System.out.print("\tEName:"+mp.get("ENAME"));
			System.out.println("\tSal  :"+mp.get("SAL"));
		}
		*/
	}
}
