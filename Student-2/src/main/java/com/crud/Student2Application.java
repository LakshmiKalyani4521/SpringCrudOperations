package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins="http://localhost:55004")
@SpringBootApplication
public class Student2Application {

	public static void main(String[] args) {
		SpringApplication.run(Student2Application.class, args);
	}

}
