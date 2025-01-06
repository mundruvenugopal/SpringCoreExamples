package com.example.demo.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class TrackCoach implements Coach{
	@Override
	public String getDailyWorkout()
	{
		return "Run Daily 15km";
	}

}
