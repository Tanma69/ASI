package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpAppMarket {
	
	public static void main(String[] args) {
		System.getProperties().put("server.port",8080);
		SpringApplication.run(SpAppMarket.class,args);
	}
}
