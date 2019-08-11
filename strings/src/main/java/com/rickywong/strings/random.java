package com.rickywong.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RestController
public class random {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/random")
	public String main() {
		return "Spring Boot is great! So easy to just respond with strings!";
	}
	

}