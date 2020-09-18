package com.student.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO read spring config java class 
		AnnotationConfigApplicationContext context=new
				AnnotationConfigApplicationContext(SportConfig.class);
		// TODO get the bean from spring container
		Coach theCoach=context.getBean("swimCoach",Coach.class);
		//TODO call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//TODO close the context 
		context.close();
		

	}

}
