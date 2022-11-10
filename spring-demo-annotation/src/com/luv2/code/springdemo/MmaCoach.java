package com.luv2.code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MmaCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// @Autowired
	public MmaCoach() {
		// FortuneService fortuneService
		System.out.println("You are in the constructor");
		// this.fortuneService = fortuneService;
	}
	
//	@Autowired
//	public void shitGodDamn(FortuneService fortuneService) {
//		System.out.println("You are in the setter method");
//		this.fortuneService = fortuneService;
//	}
	
	// define my init method 
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> MmaCoach: inside of your mom");
	}
	
	// define y destroy method 
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("You are destroying his moms ");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "400 leg kicks";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
}
