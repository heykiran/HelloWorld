package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {


    public static void main(String[] args) {

        // read XML file
        //@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // create Greet object
        Test gt = (Test) context.getBean("sayHello");
        gt.welcome();
    }
}
