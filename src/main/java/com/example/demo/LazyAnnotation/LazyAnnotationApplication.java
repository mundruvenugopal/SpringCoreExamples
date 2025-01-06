package com.example.demo.LazyAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class LazyAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazyAnnotationApplication.class, args);
	}
	private Coach myCoach;
	@Autowired
	LazyAnnotationApplication(@Qualifier("cricketCoach") Coach theCoach)
	{
		myCoach=theCoach;
		System.out.println(myCoach.getDailyWorkout());
	}
	
	
		
	


}
