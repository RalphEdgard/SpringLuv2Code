package com.luv2code.springdemo;

public class MuayThaiCoach implements Coach {

	private FortuneService fortuneService; 
	
	private String emailAddress;
	
	private String team; 
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void ralphsName() {
		System.out.println("This is aralphs name");
	}
	
	public void endOfKratos() {
		System.out.println("Kratos has died");
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("You are in the setter method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "400 leg kicks";
	}
	
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}