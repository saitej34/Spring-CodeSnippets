package com.practice.prepostdestroy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class someDependency {
	
}

@Component
class SomeClass {
	someDependency some;
	public SomeClass(someDependency same) {
		this.some = same;
	}
	
	@PostConstruct 
	public void initlize() {
		System.out.println("Pre Construction Happening");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destruction in Progress");
	}
}



@Configuration
@ComponentScan
public class Test {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(Test.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(element -> System.out.println(element));

	}

}
