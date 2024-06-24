package com.practice.demo.tightcouple;

public class Test {

	public static void main(String[] args) {
		MarioGame game = new MarioGame();
		GameRunner tr = new GameRunner(game);
		tr.run();
		

	}

}
