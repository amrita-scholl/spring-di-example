package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.A;
import com.example.service.B;
import com.example.service.C;
import com.example.service.D;

@Configuration
public class AppConfig {

    @Bean
    public D d() {
        return new D();
    }

    @Bean
    public C c(D d) {
        C c = new C();
        c.setD(d);
        return c;
    }

    @Bean
    public B b(C c) {
        B b = new B();
        b.setC(c);
        return b;
    }

    @Bean
    public A a(B b) {
        A a = new A();
        a.setB(b);
        return a;
    }
}
