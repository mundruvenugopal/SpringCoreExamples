package com.example.demo.BeanLifeCycleMethods;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class BeanLifeCycleMethodsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanLifeCycleMethodsApplication.class, args);
	}
	private Coach myCoach;
//	private CricketCoach myCoach1;
	BeanLifeCycleMethodsApplication(@Qualifier("cricketCoach") Coach theCoach)
	{
		myCoach=theCoach;
		
	}

}
