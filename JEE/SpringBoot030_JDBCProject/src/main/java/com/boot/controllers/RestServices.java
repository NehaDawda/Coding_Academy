package com.boot.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController 
public class RestServices {
	@Autowired  
    JdbcTemplate jdbc;    
	
	public RestServices(){
		System.out.println("Bean created.");
	}
	@RequestMapping("/listAll")  
    public List<Map<String, Object>> getAllEmps(){  
		
		String query = "Select EMPNO, ENAME, SAL, COMM from EMP";
		List<Map<String, Object>> list = jdbc.queryForList(query, new Object[] {});
		System.out.println("\nEmpNo\tEName\t\tSal\tComm");
		for(Map<String, Object> item:list){
			System.out.print(item.get("EMPNO"));
			System.out.print("\t"+item.get("ENAME"));
			System.out.print("\t\t"+item.get("SAL"));
			System.out.print("\t"+item.get("COMM"));
			System.out.println();
		}
		return list;
        //return"Successfully fetched data!";  
    } 
}
