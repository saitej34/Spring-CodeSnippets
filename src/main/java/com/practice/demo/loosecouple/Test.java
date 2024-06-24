package com.practice.demo.loosecouple;

public class Test {
    public static void main(String[] args) {
    	MarioGame game1 = new MarioGame();
    	PacMan game2 = new PacMan();
    	GameRunner gr1 = new GameRunner(game1);
    	GameRunner gr2 = new GameRunner(game2);
    	gr1.run();
    	gr2.run();
    }
}
