package com.example.demo.LazyAnnotation;
import org.springframework.stereotype.Component;
@Component
public class TrackCoach implements Coach{
	TrackCoach()
	{
		System.out.println("In Constructor :" +getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout()
	{
		return "Run Daily 15km";
	}

}
