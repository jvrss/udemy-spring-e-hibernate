package com.study.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.study.model.*;

class SetterDemoApp {

    public static void main(String[] args){
        
        // Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCricketCoach", Coach.class);
        
        // Call methods on bean 
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        
        // Close the context
        context.close();
    }

}