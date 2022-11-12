package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run bitch";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	// add init method 
	public void startingMethod() {
		System.out.println("You are the man because this is the starting method");
	}
	// add dest method 
	
	public void endingMethod() {
		System.out.println("You are the best person because this is the ending method");
	}

}
