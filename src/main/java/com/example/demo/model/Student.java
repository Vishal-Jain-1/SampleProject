package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Student implements Person {
		@Value("${id}")
		private int id;
		@Value("${name}")
		private String name;
		@Value("${designation}")
		private String design;
		@Value("${salary}")
		private int salary;	
}
