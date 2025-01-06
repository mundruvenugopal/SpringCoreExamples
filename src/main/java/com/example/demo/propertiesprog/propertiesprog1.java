package com.example.demo.propertiesprog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@SpringBootApplication
@PropertySource("classpath:application.properties")
@PropertySource("classpath:custom2.yaml")
@PropertySource("classpath:custom1.properties")
public class propertiesprog1{

	@Value("${info.name}")
	 private String greeting;
	 @Value("${info.num}")
	 private String greeting1;
	 
	 @Value("${uname}")
	 private String greeting2;
	 
	 @Value("${unum}")
	 private String greeting3;
	 
	 @Value("${uname}")
	 private String greeting4;
	 
	 @Value("${unum}")
	 private String greeting5;
	 
	 @Autowired
    public void init() {
        System.out.println("Info Name: " + greeting);
        System.out.println("Info Num: " + greeting1);
        System.out.println("App Name: " + greeting2);
        System.out.println("App Num: " + greeting3);
        System.out.println("App Name: " + greeting4);
        System.out.println("App Num: " + greeting5);
    }	
	public static void main(String[] args) {
		SpringApplication.run(propertiesprog1.class, args);
	}
}
