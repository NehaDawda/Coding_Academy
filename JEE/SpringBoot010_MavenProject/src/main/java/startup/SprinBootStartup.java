package startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * By default, the start-up starts tomcat on default port 8080.
 * To change the port, design application.properties in the resource folder and define property server.properties.
 * Observe the log.
 * 
 * Spring boot provides number of starters that let you add number of jar files on class path.
 * The 'spring-boot-starter-parent' in parent section in pom.xml loads useful maven defaults.
 * 		It also allows you to omit the <version> section in the dependency clause.
 * 
 * Other starters provide dependencies that you are likely to need for specific type of applications.
 * 
 * @EnableAutoConfiguration: Direct the Spring boot to guess from Maven dependencies how you want to configure the project.
 * 		As Maven Dependency 'spring-boot-starter-web' is declared, Spring Boot will assume this project is of Web type.
 * 		Spring boot will make Tomcat and Spring MVC kind of project.  Observe, dispatcher servlet is started.
 * 
 * The SpringApplication.run() does bootstrap of application.  It starts SpringBootStrap which in turn starts Tomcat web server
 * 		and deploys the application.
 */
@SpringBootApplication
public class SprinBootStartup {
	
	public SprinBootStartup(){
		System.out.println("Object created.");
	}
	public static void main(String[] args) {
		SpringApplication.run(SprinBootStartup.class, args);
	}
}
