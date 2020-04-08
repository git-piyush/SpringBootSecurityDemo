package com.springboot.demo.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!! Current Time is "+LocalDate.now();
	}
	
	@GetMapping("/fortune")
	public String fortune() {
		return "Today is your lucky day";
	}
	
	@GetMapping("/ind")
	public String india() {
		return "Currently india is under Lockdown";
	}
}
