package com.cts.product.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties( ignoreUnknown = true )
public class ItemLine implements Serializable {

	private static final long serialVersionUID = 1L;

	   @XmlElement( required = true )
    @JsonProperty("product")
	private Product product;
	   
	@XmlElement( required = true )
    @JsonProperty("qty")    
	private int qty;
    
	   @XmlElement( required = true )
	@JsonProperty("itemtotal")
	private Double itemtotal;
	
	public ItemLine() {
		// TODO Auto-generated constructor stub
	}

	public ItemLine(Product product, int qty,double itemtotal) {
		super();
		this.product = product;
		this.qty = qty;
		this.itemtotal = itemtotal;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Double getItemtotal() {
		return itemtotal;
	}

	public void setItemtotal(Double itemtotal) {
		this.itemtotal = itemtotal;
	}

}
