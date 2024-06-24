package com.practice.loose;

import com.practice.demo.game.ContraGame;
import com.practice.demo.game.GameRunner;
import com.practice.demo.game.MarioGame;

public class TestClass {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var contraGame = new ContraGame();
		GameRunner gr = new GameRunner(marioGame);
		gr.run();
		GameRunner gr1 = new GameRunner(contraGame);
		gr1.run();

	}

}
