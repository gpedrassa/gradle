package com.amanager.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amanager.entity.Greeting;
import com.amanager.repository.GreetingRepository;

@RestController
public class GreetingController {

	private String template = "Hello, %s";
	
	@Autowired
	private GreetingRepository repository;

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name){
		Greeting greeting = new Greeting(ObjectId.get().toHexString(),
                String.format(template , name));
		
		repository.save(greeting);
		
        return greeting;
	}
	
}
