package com.cts.brownfield.pss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.jdbc.DataSourceHealthIndicatorAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.actuate.health.HealthEndpoint;
import com.cts.brownfield.pss.controller.ProductCatalogRestController;


@SpringBootApplication
//@EnableJpaRepositories
//@EnableAutoConfiguration(exclude={DataSourceHealthIndicatorAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogRestController.class, args);
	}

}
