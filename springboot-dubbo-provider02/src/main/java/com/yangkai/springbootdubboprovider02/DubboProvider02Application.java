package com.yangkai.springbootdubboprovider02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.yangkai")
@ImportResource(value = {"classpath:providers.xml"})
public class DubboProvider02Application {

	public static void main(String[] args) {
		SpringApplication.run(DubboProvider02Application.class, args);
	}
}
