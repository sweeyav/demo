package com.example.demo;

import java.util.Date;

public class Availability {
	
	private String storeNo;
	private String productId;
	private double availQty;
	private Date availDate;
	
	
	public Availability(String storeNo, String productId, double availQty, Date availDate) {
		super();
		this.storeNo = storeNo;
		this.productId = productId;
		this.availQty = availQty;
		this.availDate = availDate;
	}


	public String getStoreNo() {
		return storeNo;
	}


	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public double getAvailQty() {
		return availQty;
	}


	public void setAvailQty(double availQty) {
		this.availQty = availQty;
	}


	public Date getAvailDate() {
		return availDate;
	}


	public void setAvailDate(Date availDate) {
		this.availDate = availDate;
	}
	
	
}
