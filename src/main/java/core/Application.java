/**
 The main() method uses Spring Boot’s SpringApplication.run() 
 method to launch an application.
 */
package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application  {
	
	 public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }

}
