package com.yangkai.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:providers.xml"})
public class DubboProvider01Application {

	public static void main(String[] args) {
		SpringApplication.run(DubboProvider01Application.class, args);
	}
}
