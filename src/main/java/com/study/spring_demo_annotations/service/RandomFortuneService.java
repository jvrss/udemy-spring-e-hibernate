package com.study.spring_demo_annotations.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of Strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good look",
			"The journey is the reward"
	};
	
	// Create a random number generator
	private Random myRandom = new Random();
	
	public String getFortune() {
		// Pick a random string from array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
