package com.example.Jordan.demo;

import com.example.Jordan.demo.aopDemo.HelloSpeaker;
import com.example.Jordan.demo.aopDemo.IHello;
import com.example.Jordan.demo.aopDemo.dynamicProxy.LogProxy;
import com.example.Jordan.demo.aopDemo.enums.AopType;
import com.example.Jordan.demo.aopDemo.staticProxy.HelloProxy;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.Jordan.demo"})
public class AopApplication implements ApplicationRunner {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AopApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		runAopDemo(AopType.DYNAMIC_PROXY);
	}

	public void runAopDemo(AopType aopType) throws Exception {
		switch (aopType) {
			case STATIC_PROXY:
			{
			    runStaticProxy();
				break;
			}
			case DYNAMIC_PROXY:
			{
			    runDynamicProxy();
			    break;
			}
		}
	}

	public void runStaticProxy() throws Exception {
		System.out.println(" static proxy ==== ");

		HelloSpeaker helloSpeaker = new HelloSpeaker();
		IHello proxy = new HelloProxy(helloSpeaker);

		proxy.hello("Jordan");

	}

	public void runDynamicProxy() throws Exception {
		System.out.println("dynamic proxy ===");
		IHello speaker = (IHello) new LogProxy().getLogPorxy(new HelloSpeaker());
		speaker.hello("Jordan");
	}
}
