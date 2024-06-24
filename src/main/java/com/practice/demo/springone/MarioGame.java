package com.practice.demo.springone;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mario")
public class MarioGame implements GConsole {
    public void jump() {
    	System.out.println("Jumping in Mario");
    }
    public void walk() {
    	System.out.println("Walk in Mario");
    }
    public void up() {
    	System.out.println("Up in Mario");
    }
}
