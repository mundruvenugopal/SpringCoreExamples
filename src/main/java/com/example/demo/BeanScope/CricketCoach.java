package com.example.demo.BeanScope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
