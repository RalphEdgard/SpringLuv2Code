package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] array = {"you are lucky", "you are very lucky", "you are very very lucky" };
		
		double randomNumber = Math.random()*3;
		
		int realRandomNumber = (int) randomNumber;
		String value = "" + realRandomNumber;
		
		return array[realRandomNumber];
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
