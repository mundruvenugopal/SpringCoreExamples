package com.example.demo.primaryAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class PrimaryAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimaryAnnotationApplication.class, args);
	}
	private Coach myCoach;
	@Autowired
	PrimaryAnnotationApplication(Coach theCoach)
	{
		myCoach=theCoach;
		System.out.println(myCoach.getDailyWorkout());
	}
	

	


}
