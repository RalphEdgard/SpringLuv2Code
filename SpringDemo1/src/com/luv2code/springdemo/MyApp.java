package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GodOfWarCharacters kratos = context.getBean("myGodOfWarCharacters", GodOfWarCharacters.class);
		
		System.out.println(kratos.getUpgrade());
		
		System.out.println("Next line");
		
		Thor thor = context.getBean("myThor", Thor.class);
		
		System.out.println(thor.getAxe());
		context.close();
	}

}
