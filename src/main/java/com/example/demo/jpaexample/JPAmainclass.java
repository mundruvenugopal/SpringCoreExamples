package com.example.demo.jpaexample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
@SpringBootApplication
public class JPAmainclass {
	@Autowired
	private OverallProcess stud;
	public static void main(String[] args) {
		SpringApplication.run(JPAmainclass.class, args);	
	}
	@PostConstruct
    public void init() {
        stud.Test(); 
    }
	}	




