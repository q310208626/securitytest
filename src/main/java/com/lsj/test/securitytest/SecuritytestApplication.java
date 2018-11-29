package com.lsj.test.securitytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScan(basePackages = "com.lsj.test.securitytest")
public class SecuritytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritytestApplication.class, args);
	}
}
