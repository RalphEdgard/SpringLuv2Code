package com.luv2.code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team; 
	
	public SwimCoach(FortuneService fortuneService) { 
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}
	
	

}
