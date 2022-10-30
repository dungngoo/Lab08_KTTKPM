package com.exampleDemoAPIgateway.demoAPIgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApIgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApIgatewayApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello() {
		return "Hello !!!";
	}
}