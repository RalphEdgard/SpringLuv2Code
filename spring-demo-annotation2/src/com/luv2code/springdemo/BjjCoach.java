package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class BjjCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team")
	private String team;
	
	public BjjCoach (FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team; 
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}