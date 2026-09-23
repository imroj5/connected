package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    static void main(String[] args) {

        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
OrederService orders =context.getBean(OrederService.class);
     orders.orederService();


    }
}
