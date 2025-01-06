
package com.example.demo.ConfigurationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SportConfig {
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach();
	}

}
