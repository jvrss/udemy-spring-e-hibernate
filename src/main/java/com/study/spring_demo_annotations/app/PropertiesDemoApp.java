package com.study.spring_demo_annotations.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring_demo_annotations.model.Coach;
import com.study.spring_demo_annotations.model.SwimCoach;

public class PropertiesDemoApp {

	public static void main(String[] args) {
		
		// Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from Spring Container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		// Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();
		
	}
	
}
