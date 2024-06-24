package com.demo.practice.lazyInit;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A1 {
	public A1() {
		System.out.println("Intialization");
	}
}


@Component
@Lazy
class A2 {
	A1 obj;
	public A2(A1 a) {
		System.out.println("Initialization");
		this.obj = a;
	}
}


@Configuration
@ComponentScan
public class Test {
    public static void main(String[] args) {

    	var context = new AnnotationConfigApplicationContext(Test.class);
    	System.out.println("Hey I am launching the Context Application"); 
    	// The Following are the Beans that are the that are being managed by the spring
    	Arrays.stream(context.getBeanDefinitionNames()).forEach(element -> System.out.println(element));
    	System.out.println(A2.class);
    }
}
