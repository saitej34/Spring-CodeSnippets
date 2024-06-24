package com.practice.demo.tightcouple;

public class GameRunner{
	MarioGame game;
	public GameRunner(MarioGame game) {
		this.game=game;
	}
	public void run() {
		game.jump();
	}
}
