package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	public static void main(String[] args) throws Exception {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer-zk.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"classpath*:spring/dubbo-consumer-zk.xml"
		});
		context.start();
		DemoService demoService = context.getBean("demoService", DemoService.class);
		String hello = demoService.sayHello("world");
		System.out.println("result: " + hello);
	}
}