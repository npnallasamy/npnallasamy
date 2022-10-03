package com.student.mark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		
		return "Hello World";
	}

}
