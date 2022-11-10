package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency 
	private FortuneService fortuneService;
	
	// define a constructor dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice"; 
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
		

}
