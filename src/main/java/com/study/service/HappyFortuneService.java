package com.study.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;

import lombok.Setter;

class HappyFortuneService implements FortuneService {
	
	@Value("${foo.fortunes}")
	@Setter private String[] fortunes;
    
    @Override
    public String getFortune(){
        return fortunes[new Random().nextInt(fortunes.length)];
    }
    
}