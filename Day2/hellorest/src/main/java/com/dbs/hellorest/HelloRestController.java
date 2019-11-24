package com.dbs.hellorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloRestController {

	@Autowired
	private Hello hello;

	public HelloRestController() {
		
	}
	
	@Bean
	public Hello createHello() {
		return new Hello();
	}
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(name="name") String name ) {
		return hello.sayHello(name);
	}
			
}