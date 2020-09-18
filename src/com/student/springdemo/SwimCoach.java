package com.student.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
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
