package com.example.service;

public class C {
    private D d;

    public void setD(D d) {
        this.d = d;
    }

    public void doSomething() {
        System.out.println("Class C is doing something");
        d.doSomething();
    }
}