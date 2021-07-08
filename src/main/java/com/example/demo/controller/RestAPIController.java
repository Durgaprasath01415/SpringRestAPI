package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestAPIController {
		
	@GetMapping()
	public String hello() {
		return "Hello from Bridgelabz";
	}
	
	@RequestMapping(value = {"/query"})
	public String helloParam(@RequestParam(value ="name") String name) {
		return "Hello Mark from Bridgelabz";
	}
	
	@RequestMapping("/param/{name}")
	public String helloPath(@PathVariable String name) {
		return "Hello " +name +" Taylor from Bridgelabz";
	}
	
	@PostMapping("/post")
	public String helloPost(@RequestBody User user) {
		return "Hello " +user.getFirstName()+" " +user.getLastName();
	}
	
	@PutMapping("/put/{firstName}")
	public String helloPut(@PathVariable String firstName, @RequestParam(value = "lastName")String lastName) {
		return "Hello " + firstName + " " + lastName ;
	}
	
}
