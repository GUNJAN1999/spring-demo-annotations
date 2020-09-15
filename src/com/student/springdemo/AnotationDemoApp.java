package com.student.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotationDemoApp {

	public static void main(String[] args) {
		// TODO read spring config file
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("applicationContext.xml");
		// TODO 
		Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
		

	}

}
