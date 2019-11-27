package com.example.config.cloudconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudconfigdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudconfigdemoApplication.class, args);
	}

}
