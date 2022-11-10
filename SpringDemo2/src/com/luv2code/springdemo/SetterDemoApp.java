package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MuayThaiCoach theCoach = context.getBean("myMuayThaiCoach", MuayThaiCoach.class);
		
		System.out.println(theCoach.getDailyFortune());
//		CricketCoach fortune = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call our new methods to get the literal values 
		System.out.println(theCoach.getEmailAddress() + "\n" +theCoach.getTeam());
		
		System.out.println(context.getBean("myMuayThaiCoach", MuayThaiCoach.class).getFortune());
		context.close();
	}

}
 