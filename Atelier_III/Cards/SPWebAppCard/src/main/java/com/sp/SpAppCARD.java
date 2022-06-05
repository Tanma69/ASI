package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpAppCARD {
	
	public static void main(String[] args) {
		System.getProperties().put("server.port",8070);
		SpringApplication.run(SpAppCARD.class,args);
	}
}
