package com.luv2code.springdemo;

public class MuayThaiCoach implements Coach {

	private FortuneService fortuneService;
	
	
	// literal injection add new fields for emailaddress and team 
	private String emailAddress;
	private String team; 

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public MuayThaiCoach() {
		System.out.println("You are in the constructor sonny bunny");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("You are in the setter method dummy");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
