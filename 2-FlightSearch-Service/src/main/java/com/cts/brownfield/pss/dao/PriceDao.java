package com.cts.brownfield.pss.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.brownfield.pss.entity.Product;

public interface PriceDao extends JpaRepository<Product, Long>{

	public final static String findbyid = "from Product p "+
			 "where p.productId = :id";

			@Query(value = findbyid)
			Optional<Product> findById(@Param("id") Long id);

}
