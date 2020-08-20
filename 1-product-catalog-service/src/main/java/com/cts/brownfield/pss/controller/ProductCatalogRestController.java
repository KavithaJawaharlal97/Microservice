package com.cts.brownfield.pss.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.brownfield.pss.dao.ProductDao;
import com.cts.brownfield.pss.dao.ReviewDao;
import com.cts.brownfield.pss.entity.Product;
import com.cts.brownfield.pss.entity.Review;

@RestController
@CrossOrigin
@Scope("session")
@ComponentScan({"com.cts.brownfield.pss"})
@EnableJpaRepositories("com.cts.brownfield.pss.dao")
@EnableAutoConfiguration
public class ProductCatalogRestController {
	@Autowired
	private ProductDao productdao;
	
	@Autowired
	private ReviewDao reviewdao;
	
	@GetMapping("/api/products")
	public List<Product> getProducts() {
		
		return productdao.findAll();
	}
	
	@PostMapping("/api/products")  
	public List<Product> adduser(@RequestParam(value="productName",required = false) String productName,@RequestParam(value="price",required = false) Double price,@RequestParam(value="description",required = false) String description)   
	{  
		productdao.updateproducts(productName, price,description);
		return productdao.findAll();
	} 
	
	@PostMapping("/api/products/all")  
	public List<Product> saveall(@RequestBody List<Product> products)   
	{  
		productdao.saveAll(products);
		return productdao.findAll();
	} 
	
	@GetMapping(value = "/api/products/{id}")
    public Optional<Product> deletePost(@PathVariable Long id) {

		return productdao.findById(id);
      
    }
	
	@GetMapping(value = "/api/products/{id}/reviews")
    public List<Review> productReview(@PathVariable Long id) {

		return reviewdao.findByProductId(id);
      
    }
	
	@PostMapping("/api/products/{id}/reviews")  
	public List<Review> addreview(@RequestParam(value="stars",required=false) Integer stars,@RequestParam(value="author",required=false) String author,@RequestParam(value="body",required=false) String body,@PathVariable Long id)   
	{  
		reviewdao.addreview(stars,author,body,id);
		return reviewdao.findByProductId(id);
	} 
	

	@GetMapping(value = "/api/products/byName/{letter}")
    public List<Product> findByLetter(@PathVariable String letter) {

		return productdao.findProductByNameLike(letter);
      
    }

/*	@GetMapping("/getFare/{flightNumber}/{flightDate}")
	public Fares getFare(@PathVariable("flightNumber") String flightNumber,
			@PathVariable("flightDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate flightDate) {
		
		return productCatalogService.getFare(flightNumber, flightDate);
	}
	
	@GetMapping("/getFare/{id}")
	public Fares getFareByFlightId(@PathVariable("id") long id) {
		return productCatalogService.getFareByFlightId(id);
	}

*/
}
