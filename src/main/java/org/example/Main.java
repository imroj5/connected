package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;


public class Main {
    static void main(String[] args) {

        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();

        String contextpath="";
        String baseDoc=new File(System.getProperty("src/main/webapp")).getAbsolutePath();

       Context contet= tomcat.addContext(contextpath,baseDoc);


    }
}
