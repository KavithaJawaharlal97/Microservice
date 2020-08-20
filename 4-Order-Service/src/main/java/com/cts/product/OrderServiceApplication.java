package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.cts.product.repository.OrderRepositoryImpl;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(OrderServiceApplication.class, args);
		
		OrderRepositoryImpl cr = ac.getBean(OrderRepositoryImpl.class);
		
		
	}

}
