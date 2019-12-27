package com.study.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.model.Coach;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		//Load the Spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are the same
		boolean result = (theCoach == alphaCoach); 
		
		// Print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		//Close the context
		context.close();
	}

}
