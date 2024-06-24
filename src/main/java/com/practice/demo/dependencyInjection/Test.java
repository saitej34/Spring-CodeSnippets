package com.practice.demo.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


//Dependency Injection Types 

// 1 . using fields
// 2. using setters
// 3. using constructors


@Component
class Business {
	
	
	Dependency1 depend1;
	Dependency2 depend2;
	
	public Business (Dependency1 d1,Dependency2 d2) {
		this.depend1=d1;
		this.depend2=d2;
	}
	
	public String toString() {
		return "Hey " + depend1 + " " + depend2;
	}
}

@Component 
class Dependency1 {
	
}

@Component 
class Dependency2{
	
}

@ComponentScan
public class Test {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(Test.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(element -> System.out.println(element));
        System.out.println(context.getBean(Business.class).toString());
	}

}
