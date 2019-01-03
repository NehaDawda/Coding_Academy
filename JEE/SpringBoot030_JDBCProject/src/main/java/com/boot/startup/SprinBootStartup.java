package com.boot.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * URL: http://localhost:8082/listAll
 */
@SpringBootApplication
@ComponentScan(basePackages="com.boot.controllers")
public class SprinBootStartup {
	
	public static void main(String[] args) {
		SpringApplication.run(SprinBootStartup.class, args);
	}
}
