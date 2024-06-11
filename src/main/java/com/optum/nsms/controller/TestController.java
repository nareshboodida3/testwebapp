package com.optum.nsms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "<h1>Test service called</h1>";
	}
}
