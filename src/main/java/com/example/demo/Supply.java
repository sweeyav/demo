package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Supply {

	private String productId;
	private Date updateTimeStamp;
	private Double quantity;
	
	public Supply(String productId, Date updateTimeStamp, Double quantity) {
		super();
		this.productId = productId;
		this.updateTimeStamp = updateTimeStamp;
		this.quantity = quantity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Date getUpdateTimeStamp() {
		return updateTimeStamp;
	}
	public void setUpdateTimeStamp(Date updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	
}
