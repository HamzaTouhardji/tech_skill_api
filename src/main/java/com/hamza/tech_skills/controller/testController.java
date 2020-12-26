package com.hamza.tech_skills.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	@GetMapping("/message")
	public String message() {
		return "hello !";
	}
}
