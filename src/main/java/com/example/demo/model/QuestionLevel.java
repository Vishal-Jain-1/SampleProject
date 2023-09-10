package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class QuestionLevel {
	
	private Long id;
	private Long questionId;
	private String topic;
	private String description;
	private String levelOfDifficulty;
	
}
