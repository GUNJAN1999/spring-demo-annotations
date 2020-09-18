package com.student.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO read spring config java class 
		AnnotationConfigApplicationContext context=new
				AnnotationConfigApplicationContext(SportConfig.class);
		// TODO get the bean from spring container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		//TODO call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("the name is: "+theCoach.getName());
		System.out.println("the email is: "+theCoach.getEmail());
		System.out.println("the team name is: "+theCoach.getTeam());
		
		//TODO close the context 
		context.close();	
	}

}
