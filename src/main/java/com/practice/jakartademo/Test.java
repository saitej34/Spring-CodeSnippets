package com.practice.jakartademo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;


/*@Component*/
@Named
class BusinessService {
	Dependency d;
	
	/* @Autowired */
	@Inject
	public void setD(Dependency d) {
		this.d=d;
	}
}

@Component
class Dependency {
	
}


@Configuration
@ComponentScan
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var context = new AnnotationConfigApplicationContext(Test.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(element -> System.out.println(element));

	}

}
