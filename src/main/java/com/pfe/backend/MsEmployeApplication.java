package com.pfe.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class MsEmployeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEmployeApplication.class, args);
	}

}
