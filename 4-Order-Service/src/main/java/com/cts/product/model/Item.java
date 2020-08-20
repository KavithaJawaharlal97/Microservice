package com.cts.product.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Item implements Serializable {

	
	private long itemId;
	private LocalDateTime date;
	private double itemtotal;
	private String user;
	
	
	public Item() {
		// TODO Auto-generated constructor stub
	}


	public Item(long itemId, LocalDateTime date, double itemtotal, String user) {
		super();
		this.itemId = itemId;
		this.date = date;
		this.itemtotal = itemtotal;
		this.user = user;
	}


	public long getItemId() {
		return itemId;
	}


	public void setItemId(long itemId) {
		this.itemId = itemId;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	public double getItemtotal() {
		return itemtotal;
	}


	public void setItemtotal(double itemtotal) {
		this.itemtotal = itemtotal;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


		

	}
