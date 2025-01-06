package com.example.demo.LazyAnnotation;
import org.springframework.context.annotation.Lazy;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Lazy
public class CricketCoach implements Coach{
	CricketCoach()
	{
		System.out.println("In Constructor :" +getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout()
	{
		return "practice bowling 15mi9n everyday";
	}

}
