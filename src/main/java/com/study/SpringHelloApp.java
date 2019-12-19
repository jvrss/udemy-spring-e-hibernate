package com.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class SpringHelloApp {

    public static void main(String[] args){
        
        // Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        
        // Call methods on bean 
        System.out.println(theCoach.getDailyWorkout());
        
        // Close the context
        context.close();
    }

}