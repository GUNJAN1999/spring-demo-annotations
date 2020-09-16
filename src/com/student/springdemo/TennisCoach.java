package com.student.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	

	@PostConstruct
	public void start()
	{
		System.out.println(">>DOING START UP ACTIVITIES----");
	}
	//TODO define destroy method
	
	@PreDestroy
	public void ending()
	{
		System.out.println(">>DOING CLEAN UP ACTIVITIES----");
	}
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
