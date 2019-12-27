package com.study.spring_demo_annotations.model;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
