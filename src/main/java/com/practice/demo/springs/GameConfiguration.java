package com.practice.demo.springs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {
    @Bean
    public GameRunner gameRunner() {
    	var marioGame = new MarioGame();
    	return new GameRunner(marioGame);
    }
}
