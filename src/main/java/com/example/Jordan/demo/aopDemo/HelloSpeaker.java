package com.example.Jordan.demo.aopDemo;


import com.example.Jordan.demo.aopDemo.aop.Loggable;

public class HelloSpeaker implements IHello {

    @Loggable(methodName = "Hello")
    public void hello(String name) throws Exception {
        System.out.println("Demo hello " + name);
    }


}
