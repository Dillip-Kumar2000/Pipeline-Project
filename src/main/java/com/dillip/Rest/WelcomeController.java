package com.dillip.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/msg")
	public String welcomeMsg() {
		return "Welcome to Pipeline Project";
	}

}
