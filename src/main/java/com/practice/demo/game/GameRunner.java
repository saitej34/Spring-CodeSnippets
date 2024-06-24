package com.practice.demo.game;

public class GameRunner {
	Console game;
    public GameRunner(Console game) {
    	this.game = game;
    }
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Game" + game);
		game.moveLeft();
		game.moveRight();
		game.moveDown();
		game.moveUp();
	}
}
