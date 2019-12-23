package com.study.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.study.model.*;

class SpringHelloApp {

    public static void main(String[] args){
        
        // Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        
        // Call methods on bean 
        System.out.println(theCoach.getDailyWorkout());
        
        // Lets call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());
        
        // Close the context
        context.close();
    }

}