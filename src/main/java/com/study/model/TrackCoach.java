package com.study.model;

import com.study.service.*;

public class TrackCoach implements Coach {
    
    // Define a private field for the dependency
    private FortuneService fortuneService;
    
    public TrackCoach() {}
    
    // Define a construtor for the dependency
    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
    
    @Override
    public String getDailyFortune() {
        // Use my fortune service to get my fortune
        return "Just Do It: " + fortuneService.getFortune();
    }
    
    // Add an init method
    public void doMyStartupStuff() {
    	System.out.println("TrackCoach: inside method doMyStartupStuff");
    }
    
    // Add a destroy method
    public void doMyCleanuppStuffYoYo() {
    	System.out.println("TrackCoach: inside method doMyCleanuppStuffYoYo");
    }

}