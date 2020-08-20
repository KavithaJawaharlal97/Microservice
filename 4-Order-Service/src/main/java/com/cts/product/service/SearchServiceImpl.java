package com.cts.product.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.product.model.Item;
import com.cts.product.model.ItemLine;

@Service
public class SearchServiceImpl<T> implements SearchService{

	@Autowired
	private RestTemplate resttemplate;

	
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
	@Override
	public Item Response(String url,String user){
		
		ItemLine product = resttemplate.getForObject(url,ItemLine.class);
		Item item = new Item();
		 Random random = new Random();
	      //print a random int within range of 0 to 10.
		item.setItemId(random.nextInt(100));
		item.setDate(LocalDateTime.now());
		item.setItemtotal(product.getItemtotal());
		item.setUser(user);
		//resttemplate.delete(url);
		return item;
	}
	
	

}
