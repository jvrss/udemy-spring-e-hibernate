package com.study.spring_demo_annotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.study.spring_demo_annotations.service.FortuneService;

@Component
public class PersonalCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	/*
	@Autowired
	public PersonalCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	*/
	
	

	public String getDailyWorkout() {
		return "Live";
	}

	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> PersonalCoach: Inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}
	*/

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
