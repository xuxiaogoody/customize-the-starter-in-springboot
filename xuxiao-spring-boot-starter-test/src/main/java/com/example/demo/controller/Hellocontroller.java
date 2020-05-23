package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.HelloService;
@RestController
public class Hellocontroller {
	@Autowired
	HelloService service;
	@GetMapping("/hello")
	public String hello(String name) {
		return service.sayHello(name);
	}

}
