package com.example.demo.FieldInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplication1Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication1Application.class, args);
		
	}
	@Autowired
	private coach mycoach;
	SpringBootApplication1Application(coach theCoach)
	{
		mycoach=theCoach;
		System.out.println(mycoach.getDailyworkout());
	}

}
