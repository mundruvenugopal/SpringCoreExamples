package com.example.demo.BeanLifeCycleMethods;
import org.springframework.stereotype.Component;
@Component
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
