package com.hamza.tech_skills.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/code")
public class CodeController {
	
	@GetMapping("/all")
	public String allAccess() {
		return "L'algorithme à faire.";
	}
}