package org.example;

import org.apache.catalina.startup.Tomcat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    static void main(String[] args) {

        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();


    }
}
