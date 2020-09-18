package com.student.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	// this is called field level injection
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService thFortuneService)
	{
		fortuneService=thFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "swim atleast 10000 meters as warm up ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
