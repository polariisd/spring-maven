package com.example.spring_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMavenApplication.class, args);
	}

}

@RestController
class HelloWorldController {
	@GetMapping("/")
	public String sayHello () {
		return "Hello, World! ";
	}
}
