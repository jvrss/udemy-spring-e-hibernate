package com.study.spring_demo_annotations.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring_demo_annotations.model.Coach;

public class AnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// Check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// Print out the results
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// Close the context
		context.close();

	}

}
