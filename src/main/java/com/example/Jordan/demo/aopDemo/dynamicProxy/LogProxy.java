package com.example.Jordan.demo.aopDemo.dynamicProxy;

import com.example.Jordan.demo.aopDemo.HelloSpeaker;
import com.example.Jordan.demo.aopDemo.IHello;
import lombok.extern.java.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogProxy implements InvocationHandler {
    Object subject;

    public Object getLogPorxy(Object subject) {
        this.subject = subject;

        return Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Exception {
        System.out.println("Dynamic proxy method starts ... " + method);

        Object result = method.invoke(subject, args);

        System.out.println("Dynamic proxy method ends ... " + method);
        return result;
    }

}
