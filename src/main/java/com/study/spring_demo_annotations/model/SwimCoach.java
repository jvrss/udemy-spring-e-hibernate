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
	
	@Autowired
	@Qualifier("databaseFortuneService")
	FortuneService fortuneService;

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
