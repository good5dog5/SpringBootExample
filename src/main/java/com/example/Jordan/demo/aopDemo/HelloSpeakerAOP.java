package com.example.Jordan.demo.aopDemo;

import com.example.Jordan.demo.aopDemo.aop.LogTarget;
import com.example.Jordan.demo.aopDemo.aop.Loggable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@LogTarget
@Primary
public class HelloSpeakerAOP implements IHello {

    @Loggable(methodName = "Hello")
    public void hello(String name) {
        System.out.println("Demo hello " + name);
    }

    public void hello(Customer customer) {
        System.out.println("Demo hello customer " + customer.getName());
    }
}
