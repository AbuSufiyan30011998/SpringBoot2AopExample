package com.sb.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBoot2AopExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2AopExampleApplication.class, args);
	}

}
