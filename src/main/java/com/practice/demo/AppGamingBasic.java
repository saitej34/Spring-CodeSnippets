package com.practice.demo;

import com.practice.demo.game.ContraGame;
import com.practice.demo.game.GameRunner;
import com.practice.demo.game.MarioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		//var marioGame = new MarioGame();
		var contraGame = new ContraGame();
		var gameRunner = new GameRunner(contraGame);
		gameRunner.run();
		

	}

}
