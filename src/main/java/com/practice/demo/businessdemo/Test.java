package com.practice.demo.businessdemo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class Test {
    DataService dataService;
    
    public Test(DataService d) {
    	this.dataService = d;
    }
    
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(Test.class);
        System.out.println(context.getBean(Test.class).findMax());
        
	}
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
