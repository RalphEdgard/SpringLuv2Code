package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String[] args) {
		// load the spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container 
		MuayThaiCoach bukauw = context.getBean("myMuayThaiCoach", MuayThaiCoach.class);
		
		// calll methods on the bean 
		System.out.println(bukauw.getDailyFortune());
		
		// close the cntext 
		context.close();
		
		
	}
}
