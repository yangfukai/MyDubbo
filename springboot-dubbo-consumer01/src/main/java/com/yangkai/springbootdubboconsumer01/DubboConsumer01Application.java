package com.yangkai.springbootdubboconsumer01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.yangkai")
@ImportResource(value = {"classpath:consumer.xml"})
public class DubboConsumer01Application {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumer01Application.class, args);
	}
}
