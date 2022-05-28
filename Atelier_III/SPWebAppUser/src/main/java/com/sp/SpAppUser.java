package com.sp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpAppUser {
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 8050);
		SpringApplication.run(SpAppUser.class,args);
	}
	
}
