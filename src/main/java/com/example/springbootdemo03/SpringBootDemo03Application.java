package com.example.springbootdemo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SpringBootDemo03Application {

	@RequestMapping("/test01")
	public String test01(){
		return  "Cereal";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo03Application.class, args);
	}
}
