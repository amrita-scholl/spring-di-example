package com.example.service;

public class A {
    private B b;

    public void setB(B b) {
        this.b = b;
    }

    public void doSomething() {
        System.out.println("Class A is doing something");
        b.doSomething();
    }
}