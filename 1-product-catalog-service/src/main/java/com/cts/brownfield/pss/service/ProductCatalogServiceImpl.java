package com.cts.brownfield.pss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.brownfield.pss.dao.ProductDao;
import com.cts.brownfield.pss.dao.ReviewDao;
import com.cts.brownfield.pss.entity.Product;
import com.cts.brownfield.pss.entity.Review;

@Service
public class ProductCatalogServiceImpl implements ProductCatalogService {
	
	@Autowired
	private ProductDao prodDao;
	
	@Autowired
	private ReviewDao reviewDao;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}
	
	@Override
	public List<Product> saveAll(List<Product> products) {
		// TODO Auto-generated method stub
		return prodDao.saveAll(products);
	}

	@Override
	public List<Review> findByProductId(Long id) {
		// TODO Auto-generated method stub
		return reviewDao.findByProductId(id);
	}

	@Override
	public void addreview(Integer stars, String author, String body, Long id) {
		// TODO Auto-generated method stub
		reviewDao.addreview(stars, author, body, id);
	}

	@Override
	public List<Product> findProductByNameLike(String name) {
		// TODO Auto-generated method stub
		return prodDao.findProductByNameLike(name);
	}

	@Override
	public void updateproducts(String productName, Double price, String description) {
		// TODO Auto-generated method stub
		prodDao.updateproducts(productName, price, description);
	}

	@Override
	public List<Product> findById(Long id) {
		return (List<Product>) prodDao.findById(id).orElse(null);
	}
	
	/*@Override
	public Product getFare(String flightNumber,LocalDate flightDate) {
		return reviewDao.findByFlightNumberAndFlightDate(flightNumber, flightDate).getFares();
	}
	
	@Override
	public Product getFareByFlightId(long id) {
		Review review=reviewDao.findById(id).orElse(null);
		if(review!=null) {
			return review.getFares();
		}
		return null;
	}*/

}
