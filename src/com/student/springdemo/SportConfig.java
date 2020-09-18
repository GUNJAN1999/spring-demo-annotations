package com.student.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.student.springdemo")
public class SportConfig {
	//define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	//define bean for swim coach and inject sad fortune service
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
	}
}
