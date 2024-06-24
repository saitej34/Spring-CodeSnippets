package com.practice.demo.springone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.practice.demo.springone")
public class Gaming {
	
	/*
	 * @Bean public GConsole game() { var game = new MarioGame(); return game; }
	 */
	
	/*
	 * @Bean public GameRunner gameStart(GConsole game) { return new
	 * GameRunner(game); }
	 */
	
	
    public static void main(String[] args) {
    	var context = new AnnotationConfigApplicationContext(Gaming.class);
    	context.getBean(GameRunner.class).runGame();  	
    }
}
