package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by marcus.chiu on 10/1/16.
 * @SpringBootApplication -
 * a convenience annotation that adds all the following:
 *     1. @Configuration - tags the class as a source of bean definitions
 *     2. @EnableAutoConfiguration - tells Spring Boot to start adding beans
 *          based on classpath settings, other beans, and various property settings
 *     3. @EnableWebMvc - normally added for a Spring MVC app, but Spring boot adds
 *          it automatically when it sees 'spring-webmvc' on the classpath.
 *          This flags application as a web application and activates key behaviors
 *          like setting up DispatcherServlet
 *     4. @ComponentScan - tells Spring to look for other components, configurations,
 *          and services in the com.marcus.chiu package, allowing it to find the controllers
 */
@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) {
		//launch the application
		//100% pure java. no xml configurations
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
}
