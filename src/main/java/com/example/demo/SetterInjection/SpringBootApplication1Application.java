package com.example.demo.SetterInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringBootApplication1Application {
	private coach mycoach;
	 public static void main(String[] args) {
			SpringApplication.run(SpringBootApplication1Application.class, args);		
		}
		@Autowired
	public void	setCoach(coach theCoach)
		{
			mycoach=theCoach;
			System.out.println(mycoach.getDailyworkout());	
		}
}
