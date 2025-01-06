package com.example.demo.Sampleprogram;

import org.springframework.stereotype.Component;

@Component
public class cricketcoach implements coach {
	public String getDailyworkout()
	{
		return "practice bowling everyday 15min";
	}

}
