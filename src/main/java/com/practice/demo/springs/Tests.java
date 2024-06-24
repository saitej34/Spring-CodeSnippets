package com.practice.demo.springs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        var context = new AnnotationConfigApplicationContext(GameConfiguration.class);
        context.getBean(GameRunner.class).run();
	}

}
