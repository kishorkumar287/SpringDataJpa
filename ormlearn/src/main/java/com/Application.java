package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.service.CountryRepository;

@SpringBootApplication
@ComponentScan("com")
public class Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
@Autowired
	static CountryRepository r;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
		LOGGER.info("Inside main");
	
	}

}
