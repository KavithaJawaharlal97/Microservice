package com.cts.brownfield.pss.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.brownfield.pss.dao.PriceDao;
import com.cts.brownfield.pss.entity.Product;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RestController
@CrossOrigin
@Scope("session")
@ComponentScan({"com.cts.brownfield.pss"})
@EnableJpaRepositories("com.cts.brownfield.pss.dao")
@EnableAutoConfiguration
@RefreshScope
public class PriceController {

	@Autowired
	private PriceDao pricedao;

	@GetMapping(value = "/api/price/{id}")
    public Optional<Product> deletePost(@PathVariable Long id) {

		return pricedao.findById(id);
      
    }

	
	
}
