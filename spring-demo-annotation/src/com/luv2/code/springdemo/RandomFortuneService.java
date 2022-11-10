package com.luv2.code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of strings 
	public String[] data = {
			"Your mama was good last night",
			"you are the best",
			"you are the man"
	};
	
	// create random number generator 
	double randomNumber = Math.random()*3;
	int value = (int)randomNumber;
	
	
	@Override
	public String getDailyFortune() {
		// pick a random fortune from the array
		// TODO Auto-generated method stub
		return data[value];
	}

}
