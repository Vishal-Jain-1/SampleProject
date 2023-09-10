package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class Emp implements Person {
		
	private int id;
	private String name;	
}
