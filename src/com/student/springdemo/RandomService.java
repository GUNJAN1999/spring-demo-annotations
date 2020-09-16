package com.student.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {
	
	// create a array of string
	private String[] data= {"good day","bad day","ok-ok types wala day"};
	
	//create a random number
	
	private Random myRandom=new Random();
	
	
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		int index=myRandom.nextInt(data.length);
		
		return data[index];
	}

}
