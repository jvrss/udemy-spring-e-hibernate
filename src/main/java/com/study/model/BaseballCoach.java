package com.study.model;

import com.study.service.*;

public class BaseballCoach implements Coach {
    
    // Define a private field for the dependency
    private FortuneService fortuneService;
    
    // Define a construtor for the dependency
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
    
    @Override
    public String getDailyFortune() {
        // Use my fortune service to get my fortune
        return fortuneService.getFortune();
    }

}