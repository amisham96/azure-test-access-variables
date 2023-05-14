package com.myapp.azureapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureAppController {

	@GetMapping(value = "/my-var")
	public String getMyVar() {
		return "The value of MY_VAR is: " + System.getenv("MY_VAR");
	}
	
}
