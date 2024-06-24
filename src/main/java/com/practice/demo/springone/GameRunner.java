package com.practice.demo.springone;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner{
    GConsole g;
    public GameRunner(@Qualifier("mario") GConsole g) {
    	this.g=g;
    }
    public void runGame() {
    	g.jump();
    	g.up();
    	g.walk();
    }
}
