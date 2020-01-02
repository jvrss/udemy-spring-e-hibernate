package com.study.spring_demo_annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.study.spring_demo_annotations.model.Coach;
import com.study.spring_demo_annotations.model.SwimCoach;
import com.study.spring_demo_annotations.service.FortuneService;
import com.study.spring_demo_annotations.service.SadFortuneService;

@Configuration
//@ComponentScan("com.study.spring_demo_annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// Define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// Define bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
