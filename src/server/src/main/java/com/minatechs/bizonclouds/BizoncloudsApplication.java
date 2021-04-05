package com.minatechs.bizonclouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class BizoncloudsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BizoncloudsApplication.class, args);
	}

}
