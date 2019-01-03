package com.boot.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController 
//@EnableAutoConfiguration
public class RestServices {

	public RestServices(){
		System.out.println("Bean created.");
	}
	@RequestMapping("/hello")  
    public String hello(){  
        return"Hello!";  
    } 
	
}
