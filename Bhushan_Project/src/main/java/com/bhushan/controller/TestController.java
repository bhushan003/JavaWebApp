package com.bhushan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/getName")
	public String getName() {
		return "Hi";
	}

}
