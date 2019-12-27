package com.study.spring_demo_annotations.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring_demo_annotations.model.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from Spring Container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach personalCoach = context.getBean("personalCoach", Coach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(personalCoach.getDailyWorkout());
		
		// Close the context
		context.close();
		
	}
	
}
