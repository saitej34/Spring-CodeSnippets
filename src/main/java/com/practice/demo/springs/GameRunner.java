package com.practice.demo.springs;

public class GameRunner {
     GameConsole game;
     public GameRunner(GameConsole game) {
    	 this.game=game;
     }
     public void run() {
    	 game.jump();
     }
}
