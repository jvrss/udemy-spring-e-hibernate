package com.study.model;

import com.study.service.*;
import lombok.Getter;

public class CricketCoach implements Coach {
    
    // Define a private field for the dependency
    private FortuneService fortuneService;
    
    // Add new field for emailAddress and team
    @Getter private String emailAddress;
    @Getter private String team;
    
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }
    
    public void setEmailAddress(String emailAddress){
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }
    
    public void setTeam(String team){
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
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