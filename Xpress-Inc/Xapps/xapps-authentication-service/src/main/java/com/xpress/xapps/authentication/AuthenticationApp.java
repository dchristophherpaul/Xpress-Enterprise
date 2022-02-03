package com.xpress.xapps.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.xpress.xapps*")
public class AuthenticationApp {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApp.class, args);
	}

}
