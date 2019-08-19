package com.assessment.DockerArnab.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class Controller {
	
	@GetMapping
	public String index() {
		return "HelloWorld .This is Arnab";
	}

}
