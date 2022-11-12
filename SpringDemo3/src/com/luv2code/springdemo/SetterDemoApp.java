package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MuayThaiCoach coach = context.getBean("myMuayThaiCoach", MuayThaiCoach.class);
		MuayThaiCoach alphaCoach = context.getBean("myMuayThaiCoach", MuayThaiCoach.class);
//		CricketCoach fortune = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		System.out.println(coach.equals(alphaCoach));
		//call our new methods to get the literal values 

	}

}
 