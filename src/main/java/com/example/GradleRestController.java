package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradleRestController {

	@GetMapping
	public String displayWord() {
		return "rest is light weight webservice...";
	}
	
}
