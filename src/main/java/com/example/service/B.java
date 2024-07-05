package com.example.service;

public class B {
    private C c;

    public void setC(C c) {
        this.c = c;
    }

    public void doSomething() {
        System.out.println("Class B is doing something");
        c.doSomething();
    }
}
