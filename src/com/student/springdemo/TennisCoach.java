package com.student.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	/*
	@Autowired
	public TennisCoach(FortuneService fortune)
	{
		fortuneService=fortune;
	}
	*/
	public TennisCoach()
	{
		System.out.println("inside the tennis constructor");
	}
	// define a setter method
	/*
	@Autowired
	public void setFortuneService(FortuneService fortune)
	{
		System.out.println(">>INSIDE THE SETTER OF TENNISCOACH--");
		fortuneService=fortune;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice back-hand for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
