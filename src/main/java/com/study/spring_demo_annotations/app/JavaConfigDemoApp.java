package com.study.spring_demo_annotations.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring_demo_annotations.config.SportConfig;
import com.study.spring_demo_annotations.model.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read Spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from Spring Container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach personalCoach = context.getBean("personalCoach", Coach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(personalCoach.getDailyWorkout());
		
		// Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println(personalCoach.getDailyFortune());
		
		// Close the context
		context.close();
		
	}
	
}
