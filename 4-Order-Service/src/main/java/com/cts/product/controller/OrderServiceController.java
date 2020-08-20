package com.cts.product.controller;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.product.model.Item;
import com.cts.product.model.ItemLine;
import com.cts.product.repository.OrderRepositoryImpl;
import com.cts.product.service.SearchServiceImpl;

@RestController
@CrossOrigin
@RefreshScope
@RequestMapping("/api/orders")
public class OrderServiceController {

	@Autowired
	private OrderRepositoryImpl cartDao;
	
	@Autowired
	private SearchServiceImpl searchservice;
	
	@Autowired
	private RestTemplate resttemplate;

	private static final String bookingURL = "http://localhost:8083/api/cart";

	@PostMapping("/{userName}")
	public Item displayOrders(@PathVariable("userName") String user) {
		
		String url = bookingURL+"/"+user;

		
		return searchservice.Response(url,user);

	}

	/*@GetMapping("/{userName}")
	public List<ItemLine> getCartItems(@PathVariable("userName") String user) {

		List<ItemLine> cartItems = cartDao.findAll(user);

		return cartItems;

	}

	@DeleteMapping("/{userName}")
	public void clearCart(@PathVariable("userName") String user) {

		cartDao.clear(user);
		System.out.println(">>>> Cleared....");
	}
*/
}