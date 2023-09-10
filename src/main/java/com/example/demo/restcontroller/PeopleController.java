package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.People;

@RestController
@RequestMapping("/api")
public class PeopleController {
	
	@Autowired
	People people;
	
	@GetMapping("/get")
	public People getPeople() {
		
		return this.people;		
	}

	@PostMapping
	public People createPeople(@RequestBody People people) {
		
		this.people = people;		
		return this.people;				
	}
	
	@DeleteMapping("{id}")
	public String deletepeople(@PathVariable int id) {
		
		this.people =null;
		return "Done";
		
	}
	
	@PutMapping
	public People updatePeople(@RequestBody People people) {
		
		this.people = people;
		return this.people;
	}
	
	
	
	

}
