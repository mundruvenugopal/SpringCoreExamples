package com.example.demo.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@SpringBootApplication
public class SpringBootApplication21Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication21Application.class, args);
	}
	private Coach myCoach;
	@Autowired
	SpringBootApplication21Application(@Qualifier("trackCoach") Coach theCoach)
	{
		myCoach=theCoach;
		System.out.println(myCoach.getDailyWorkout());
	}
}

	

