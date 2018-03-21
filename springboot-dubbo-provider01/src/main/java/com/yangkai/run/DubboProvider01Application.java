package com.yangkai.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.yangkai")
@ImportResource(value = {"classpath:providers.xml"})
public class DubboProvider01Application {

	public static void main(String[] args) {
		SpringApplication.run(DubboProvider01Application.class, args);
	}
}
