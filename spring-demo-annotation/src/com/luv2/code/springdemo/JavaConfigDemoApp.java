package com.luv2.code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("mmaCoach", Coach.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}
}

