package com.jpm.mvc.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jpm.mvc.services, com.jpm.mvc.controllers")
public class StartAppl {

	public static void main(String[] args) {
		SpringApplication.run(StartAppl.class, args);
	}
}
