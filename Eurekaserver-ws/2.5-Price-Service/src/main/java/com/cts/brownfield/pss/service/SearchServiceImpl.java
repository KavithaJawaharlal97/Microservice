package com.cts.brownfield.pss.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.brownfield.pss.dao.PriceDao;
import com.cts.brownfield.pss.entity.Product;


@Service
public class SearchServiceImpl implements SearchService{

	@Autowired
	private PriceDao priceDao;
	

	@Override
	public Optional<Product> findById(Long id) {
		// TODO Auto-generated method stub
		return priceDao.findById(id);
	}	
	
	
	
	

}
