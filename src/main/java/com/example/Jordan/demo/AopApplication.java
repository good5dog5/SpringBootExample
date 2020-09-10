package com.example.Jordan.demo;

import  com.example.Jordan.demo.aopDemo.HelloSpeaker;
import com.example.Jordan.demo.aopDemo.IHello;
import com.example.Jordan.demo.aopDemo.staticProxy.HelloProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.Jordan.demo"})
public class AopApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AopApplication.class, args);

		System.out.println(" static proxy ==== ");

		HelloSpeaker helloSpeaker = new HelloSpeaker();
		IHello proxy = new HelloProxy(helloSpeaker);

		proxy.hello("Jordan static proxy Test");
	}

}
