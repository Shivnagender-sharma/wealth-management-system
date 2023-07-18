package com.immersion.wealth;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class WealthAppApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(WealthAppApisApplication.class, args);
	}

	//bean annotation so that spring container creates its object automatically  and provide it  at the place where we do the autowiring of this
	@Bean
	//creating modelMapper Method
	public ModelMapper modelMapper() {
		return new ModelMapper();

	}

}
