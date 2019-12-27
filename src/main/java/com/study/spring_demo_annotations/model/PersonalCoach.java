package com.study.spring_demo_annotations.model;

import org.springframework.stereotype.Component;

@Component
public class PersonalCoach implements Coach {

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Live";
	}

}
