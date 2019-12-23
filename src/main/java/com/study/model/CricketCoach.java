package com.study.model;

import com.study.service.*;

public class CricketCoach implements Coach {
    
    // Define a private field for the dependency
    private FortuneService fortuneService;
    
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }
    
    //Our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
    
    @Override
    public String getDailyFortune() {
        // Use my fortune service to get my fortune
        return fortuneService.getFortune();
    }

}