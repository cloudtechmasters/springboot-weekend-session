package com.companyname.springbootweekendsession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.companyname.controller"})
public class SpringbootWeekendSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWeekendSessionApplication.class, args);
	}

}
