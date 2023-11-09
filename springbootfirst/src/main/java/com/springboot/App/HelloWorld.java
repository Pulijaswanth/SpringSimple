package com.springboot.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/HelloWorld")
public String HelloWorld() {
       String s="Hello World";
       return s;
}
}
