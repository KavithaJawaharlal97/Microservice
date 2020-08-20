package com.cts.product.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties( ignoreUnknown = true )
public class Product implements Serializable{
	
	@XmlElement( required = true )
    @JsonProperty( "productId" )
	private long productId;
	@XmlElement( required = true )
    @JsonProperty( "productName" )
	private String productName;
	@XmlElement( required = true )
    @JsonProperty( "price" )
	private double price;
	@XmlElement( required = true )
    @JsonProperty( "description" )
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
