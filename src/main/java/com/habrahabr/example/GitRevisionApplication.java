package com.habrahabr.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class GitRevisionApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		LoggerExample loggerExample = context.getBean(LoggerExampleImpl.class);
		loggerExample.printLog();
	}
}
