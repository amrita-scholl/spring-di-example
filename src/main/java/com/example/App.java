package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.A;

public class App 
{
    
    //  public static void main(String[] args) {
    //     ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    //     A a = context.getBean(A.class);
    //     a.doSomething();
    // }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        A a = context.getBean(A.class);
        a.doSomething();
    }
}
