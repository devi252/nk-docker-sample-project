package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/k8s-test")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Application is running.....");
	}
	
	@GetMapping(value = {"/home", "/"})
	public String home() {
		return "home page API is woring....";
	}
	
	@GetMapping("/test")
	public String test() {
		return "TEST API is working...";
	}
	
	@GetMapping("/test-2")
	public String test2() {
		return "TEST API is working...";
	}

}
