package com.study.spring_demo_annotations.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.study.spring_demo_annotations.service.FortuneService;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor");
	}
	
	// Define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMystartupStuff()");
	}
	
	
	// Define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}
	
	
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	*/
	
	// Define a setter method
	@Autowired 
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
