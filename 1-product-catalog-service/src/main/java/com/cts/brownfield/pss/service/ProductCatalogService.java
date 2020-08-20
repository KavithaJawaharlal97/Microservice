package com.cts.brownfield.pss.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.cts.brownfield.pss.entity.Product;
import com.cts.brownfield.pss.entity.Review;

public interface ProductCatalogService {
	
	List<Product> findAll();
	List<Product> findById(Long id);
	void updateproducts(String productName,Double price,String description);
	List<Product> findProductByNameLike(String name);
	List<Product> saveAll(List<Product> products);
	List<Review> findByProductId(Long id);
	public void addreview(Integer stars,String author,String body,Long id);

/*
	Product getFare(String flightNumber, LocalDate flightDate);
	public Product getFareByFlightId(long id);
*/
}