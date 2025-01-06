package com.example.demo.FieldInjection;

import org.springframework.stereotype.Component;

@Component
public class cricketcoach implements coach {
	public String getDailyworkout()
	{
		return "practice bowling everyday 15min";
	}

}
