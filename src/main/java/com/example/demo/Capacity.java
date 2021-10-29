package com.example.demo;

import java.util.Date;

public class Capacity {

	private String storeNo;
	private String prodId;
	private Date date;
	private Double noOfOrdersAccepted;
	
	
	public Capacity(String storeNo, String prodId, Date date, Double noOfOrdersAccepted) {
		super();
		this.storeNo = storeNo;
		this.prodId = prodId;
		this.date = date;
		this.noOfOrdersAccepted = noOfOrdersAccepted;
	}


	public String getProdId() {
		return prodId;
	}


	public void setProdId(String prodId) {
		this.prodId = prodId;
	}


	public String getStoreNo() {
		return storeNo;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getNoOfOrdersAccepted() {
		return noOfOrdersAccepted;
	}
	public void setNoOfOrdersAccepted(Double noOfOrdersAccepted) {
		this.noOfOrdersAccepted = noOfOrdersAccepted;
	}
	
}
