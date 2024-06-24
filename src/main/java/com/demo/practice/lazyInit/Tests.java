package com.demo.practice.lazyInit;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
	
}

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Protottype {
   	
}




@Configuration
@ComponentScan
public class Tests {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var context = new AnnotationConfigApplicationContext(Tests.class);
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(NormalClass.class));
	    System.out.println(context.getBean(Protottype.class));
	    System.out.println(context.getBean(Protottype.class));
	    System.out.println(context.getBean(Protottype.class));
	    System.out.println(context.getBean(Protottype.class));
	    

	}

}
