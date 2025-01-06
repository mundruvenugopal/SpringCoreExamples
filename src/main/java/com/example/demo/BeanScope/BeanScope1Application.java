package com.example.demo.BeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@RestController
@SpringBootApplication
public class BeanScope1Application {

	public static void main(String[] args) {
		SpringApplication.run(BeanScope1Application.class, args);
		//scopecheck();
	}  
	private Coach myCoach;
	private Coach myCoach1;
	@Autowired
	BeanScope1Application(@Qualifier("cricketCoach") Coach thecoach,@Qualifier("cricketCoach") Coach theCoach1)
	{
		myCoach=thecoach;
		myCoach1=theCoach1;
		System.out.println("Comparing beans:myCoach==myCoach1  "+(myCoach==myCoach1));
	}

}
