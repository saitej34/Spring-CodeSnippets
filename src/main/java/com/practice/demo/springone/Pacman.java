package com.practice.demo.springone;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements GConsole {
	public void jump() {
    	System.out.println("Jumping in PacMan");
    }
    public void walk() {
    	System.out.println("Walk in Pacman");
    }
    public void up() {
    	System.out.println("Up in Pacman");
    }
}
