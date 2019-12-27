package com.study.spring_demo_annotations.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	
	@Autowired
	@Value("${foo.fortunes}")
	private String[] fortunes;

	public String getFortune() {
		return fortunes[new Random().nextInt(fortunes.length)];
	}

}
