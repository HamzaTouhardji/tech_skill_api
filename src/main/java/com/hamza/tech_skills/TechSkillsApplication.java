package com.hamza.tech_skills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class TechSkillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechSkillsApplication.class, args);
	}

}
