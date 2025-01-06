package com.example.demo.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach{
	@Override
	public String getDailyWorkout()
	{
		return "practice bowling 15mi9n everyday";
	}

}
