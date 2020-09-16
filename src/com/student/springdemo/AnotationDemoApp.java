package com.student.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotationDemoApp {

	public static void main(String[] args) {
		// TODO read spring config file
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("applicationContext.xml");
		// TODO get the bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		//TODO call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//TODO close the context 
		context.close();
		

	}

}
