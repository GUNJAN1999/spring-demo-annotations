package com.student.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoAnotationWithScope {

	public static void main(String[] args) {
		// TODO make the use of scope
		//TODO scope are of two types : singleton(default) and prototype
		
		//TODO loading the config file
		ClassPathXmlApplicationContext context=new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		//Coach betaCoach=context.getBean("tennisCoach",Coach.class);
		
		//boolean b=(alphaCoach==betaCoach);
		//System.out.println("Answer is >>"+b);
		//System.out.println("alpha memory address "+alphaCoach);
		//System.out.println("alpha memory address "+betaCoach);
		System.out.println(alphaCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyFortune());
		
	}

}
