package com.example.demo.ConfigurationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ConfigurationBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationBeanApplication.class, args);
	}
	
	private Coach myCoach;
	@Autowired
	ConfigurationBeanApplication(@Qualifier("swimCoach") Coach theCoach)
	{
		myCoach=theCoach;
		System.out.println(myCoach.getDailyWorkout());
	}
}
