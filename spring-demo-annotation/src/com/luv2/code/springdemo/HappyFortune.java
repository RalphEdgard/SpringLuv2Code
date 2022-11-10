package com.luv2.code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is you lucky day";
	}
	
}