package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

public class Test {
    @Value("${property.name:Kumar}")
    String name;

    @Autowired
    private Environment env;

    public void welcome() {
        System.out.println("Welcome in Spring Framework, " + name);
        System.out.println("Welcome in Spring Framework, " + env.getProperty("property.name"));
    }
}
