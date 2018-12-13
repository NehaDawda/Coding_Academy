package pack_50_jdbc.pack_10_JdbcTemplate;

import java.util.Collections;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class TestNamedJdbcTemplate {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_50_jdbc\\pack_10_JdbcTemplate\\context.xml");
		
		NamedParameterJdbcTemplate namedParaJdbcTemplate = (NamedParameterJdbcTemplate)ctx.getBean("namedParaJdbcTemplate");
		String query = "Select SAL from EMP_CHANDRA where EMPNO=:givenImpId";
		
		///*// Mapping the named parameter with actual value
		SqlParameterSource namedPara = new MapSqlParameterSource("givenImpId", 1100);
		
		float sal = (Float)namedParaJdbcTemplate.queryForObject(query, namedPara, Float.class);
		System.out.println("(1)Salary for Emp 7521 is:"+sal);
		//*/
		/*
		// Passing mapped name through Map
		Map namedParameter  = Collections.singletonMap("givenImpId", 7521);
		Float sal = (Float)namedParaJdbcTemplate.queryForObject(query, namedParameter, Float.class);
		System.out.println("(2)Salary for Emp 7521 is:"+sal);
		*/
		
	}

}
