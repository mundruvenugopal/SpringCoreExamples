package com.example.demo.LazyAnnotation;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
@Lazy
public class BasketBallCoach implements Coach {
	BasketBallCoach()
	{
		System.out.println("In Constructor :" +getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout()
	{
		return "practice 15min everyday";
	}

}
