package pack_50_jdbc.pack_10_JdbcTemplate;

import java.util.List;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import pack_50_jdbc.pack_common.Emp;

public class TestJdbcTemplate {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("pack_50_jdbc\\pack_10_JdbcTemplate\\context.xml");
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");
		String query;
		
		/*// Retrieving list of records
		query = "Select EMPNO, ENAME, SAL, COMM from EMP";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(query, new Object[] {});
		System.out.println("\nEmpNo\tEName\t\tSal\tComm");
		for(Map<String, Object> item:list){
			System.out.print(item.get("EMPNO"));
			System.out.print("\t"+item.get("ENAME"));
			System.out.print("\t\t"+item.get("SAL"));
			System.out.print("\t"+item.get("COMM"));
			System.out.println();
		}
		*/
	
		/*// Simple query for retrieving String value on interactive query.
		query = "SELECT EMPNM FROM EMP_Chandra WHERE empNo=?";
		String empName =  jdbcTemplate.queryForObject(query, new Object[] {9000}, String.class);
		System.out.println("Name for employee 1100:"+empName);
		// In above code, the Object[] is an array representing interactive parameters in the order of '?' from left to right.
		// The String.class represents the type of single value being fetched from result set.
		*/
			
		///*// Simple CRUD operations
			/* // Inserting a record
			query = "Insert into EMP_CHANDRA(EMPNO, EMPNM, SAL) values (?, ?, ?)";
			jdbcTemplate.update(query, new Object[]{9000, "Suchita", 25000});
			System.out.println("Record inserted:9000");
			*/
			/* // Updating an inserted record
			query = "Update EMP_CHANDRA set EMPNM=? where EMPNO=?";
			jdbcTemplate.update(query, new Object[]{"Sumitra", 9000});
			System.out.println("Record 9000 name changed from Suchita to Sumitra");
			*/
			/* // Retrieve a record
			query = "Select ENAME from EMP where EMPNO=?";
			String empName =  jdbcTemplate.queryForObject(query, new Object[] {9000}, String.class);
			System.out.println("Name for employee 9000:"+empName);
			*/
			/* // Deleting a record
			query = "Delete from EMP_CHANDRA where EMPNO=?";
			jdbcTemplate.update(query, new Object[]{9000});
			System.out.println("Record 9000 deleted.");
			*/
			///*// Count for records
			query = "Select count(*) as count from EMP_CHANDRA";
			Integer cnt = jdbcTemplate.queryForObject(query, Integer.class);//, Map.class);
			System.out.println(cnt);
			//*/
		//*/
		ctx.close();
	}

}
