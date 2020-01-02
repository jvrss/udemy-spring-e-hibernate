package com.study.spring_demo_annotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.study.spring_demo_annotations.service.FortuneService;

import lombok.Getter;

@Component
public class SwimCoach implements Coach {
	
	@Value("${foo.email}")
	@Getter private String email;
	    
	@Value("${foo.team}")
	@Getter private String team;
	
	FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swin 1000 meters as a warm up";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
