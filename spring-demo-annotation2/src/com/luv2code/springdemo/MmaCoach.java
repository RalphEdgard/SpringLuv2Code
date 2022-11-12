package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MmaCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService; 

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("hello ralph");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public MmaCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "500 leg kicks";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}