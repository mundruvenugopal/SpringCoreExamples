package com.example.demo.Sampleprogram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
public class SpringBootApplication1Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication1Application.class, args);
		
	}
	
		private coach mycoach;
	
		
		@Autowired
		SpringBootApplication1Application(coach theCoach)
		{
			mycoach=theCoach;
			System.out.println(mycoach.getDailyworkout());
		}
	

}
