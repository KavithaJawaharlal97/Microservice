package com.cts.brownfield.pss.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.brownfield.pss.entity.Product;
//import com.cts.brownfield.pss.entity.Fares;
import com.cts.brownfield.pss.entity.Review;

@Repository
public interface ReviewDao extends JpaRepository<Review, Long>{
	
	public final static String findbyid = "select r from Review r "+
	"left join r.product pr"+
	" where r.product = (select p.productId from Product p"
	+ " where p.productId = :id)";

	@Query(value = findbyid)
	List<Review> findByProductId(@Param("id") Long id);
	
	@Modifying
	@Transactional
	@Query(value= "insert into Review(review_id,stars,author,body,product_id) values (3,:stars,:author,:body,:id)",nativeQuery=true)
	public void addreview(@Param("stars") Integer stars,@Param("author") String author,@Param("body") String body,@Param("id") Long id);
}
