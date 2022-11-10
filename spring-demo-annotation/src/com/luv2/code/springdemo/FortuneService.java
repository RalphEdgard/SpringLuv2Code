package com.luv2.code.springdemo;

import org.springframework.stereotype.Component;

@Component
public interface FortuneService {
	public String getDailyFortune();
}