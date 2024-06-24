package com.practice.demo.springstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGame {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = null;
        try {
            context = new AnnotationConfigApplicationContext(HelloConfiguration.class);
            
        } finally {
            // Ensure that the context is closed when done
            if (context != null) {
                context.close();
            }
        }
    }
}
