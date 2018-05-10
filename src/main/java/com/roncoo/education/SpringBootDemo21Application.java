package com.roncoo.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootDemo21Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemo21Application.class, args);
	}
}
