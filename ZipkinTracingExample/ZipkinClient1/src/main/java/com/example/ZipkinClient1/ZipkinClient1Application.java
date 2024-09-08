package com.example.ZipkinClient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ZipkinClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinClient1Application.class, args);
	}

}
