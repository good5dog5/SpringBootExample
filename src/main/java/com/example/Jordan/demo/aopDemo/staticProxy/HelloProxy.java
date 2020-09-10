package com.example.Jordan.demo.aopDemo.staticProxy;

import com.example.Jordan.demo.aopDemo.IHello;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloProxy implements IHello {
    private IHello iHello;

    public HelloProxy(IHello iHello) {
        this.iHello = iHello;
    }

    public void hello(String name) throws Exception {
        log("hello method starts ...");
        iHello.hello(name);
        log("hello method ends ...");
    }

    private void log(String msg) {
        log.info(msg);
    }
}
