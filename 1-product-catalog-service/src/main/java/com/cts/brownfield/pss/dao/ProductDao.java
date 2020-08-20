package com.cts.brownfield.pss.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.brownfield.pss.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long>{
	
	
	@Query(value = "from Product p where p.productName like %:productName%")
	List<Product> findProductByNameLike(@Param("productName") String productName);
	
	@Modifying
	@Transactional
	@Query(value= "insert into product(product_name, price,description) values (:productName, :price,:description)",nativeQuery=true)
	public void updateproducts(@Param("productName") String productName,@Param("price") Double price,@Param("description") String description);
}
