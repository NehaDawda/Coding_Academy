package pack_50_jdbc.pack_10_JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import pack_50_jdbc.pack_common.Emp;
import pack_50_jdbc.pack_common.EmpProp;

public class TestJdbcRowMapper {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("pack_50_jdbc\\pack_10_JdbcTemplate\\context.xml");
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");
		String query;
		
		// Row Mappers
		///*
		// Define parameterized row mapper
		ParameterizedRowMapper<Emp> mapper = new ParameterizedRowMapper<Emp>(){

			@Override
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException{
				Emp emp = new Emp();
				emp.setEmpNo(rs.getInt("EMPNO"));
				emp.setEmpNm(rs.getString("EMPNM"));
				emp.setEmpSal(rs.getFloat("SAL"));
				return emp;
			}
		};
		//*/
		/*
		// Using Parameterized Row Mapper for single row
		query = "Select EMPNO, EMPNM, SAL from EMP_CHANDRA where EMPNO=?";
		
		Emp emp = jdbcTemplate.queryForObject(query, mapper, 1100);
		System.out.println("Object for empNo-7521 is:"+emp);
		*/
		
		///*
		// Using Parameterized Row Mapper for multiple rows
		query = "Select EMPNO, EMPNM, SAL from EMP_CHANDRA";
		
		List<Emp> empList = jdbcTemplate.query(query, mapper);
		for(Emp emp : empList){
			System.out.println(emp);
		}
		//*/
		
		/*
		// Using BeanPropertyRowMapper for single row
		query = "Select EMPNO, ENAME, SAL from EMP where EMPNO=?";
		EmpProp emp = jdbcTemplate.queryForObject(query, new Object[]{7521}, new BeanPropertyRowMapper(EmpProp.class));
		System.out.println(emp);
		*/
		/*
		// Using BeanPropertyRowMapper for multiple rows
		query = "Select EMPNO, ENAME, SAL from EMP";
		List<EmpProp> empList = jdbcTemplate.query(query, new BeanPropertyRowMapper(EmpProp.class));
		for(EmpProp emp : empList){
			System.out.println(emp);
		}
		*/
		ctx.close();
	}
}
