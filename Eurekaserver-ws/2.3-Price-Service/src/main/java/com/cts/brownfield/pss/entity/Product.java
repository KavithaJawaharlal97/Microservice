package com.cts.brownfield.pss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "product")
//@DynamicUpdate
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "product_id")
	private long productId;
	private String productName;
	private double price;
	private String description;
	
	public Product(){}
	
	public Product(String productName, double price, String description) {
	
		this.productName = productName;
		this.price = price;
		this.description = description;
	}
	
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}
