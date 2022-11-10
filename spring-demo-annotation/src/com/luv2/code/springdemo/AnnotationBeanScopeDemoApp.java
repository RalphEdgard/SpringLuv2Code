package com.luv2.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String [] args) {
		// load spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("mmaCoach", Coach.class);
		Coach alphaCoach = context.getBean("mmaCoach", Coach.class);
		
		// check if they are the same
		System.out.println(theCoach==alphaCoach);
	}
}
