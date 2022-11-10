package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getDailyFortune() {
		return "This is the best thing that has ever happened to me in my whole entire life";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}