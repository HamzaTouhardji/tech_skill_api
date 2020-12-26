package com.hamza.tech_skills.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2Controller {
	
    @GetMapping("/")
    public String helloWorld() {
        return "Connxion /login";
    }

    @GetMapping("/deconnexion")
    public String notRestricted() {
        return "Deconnexion !";
    }

    @GetMapping("/connexion")
    public String restricted() {
        return "Tu es connecté";
    }
}
