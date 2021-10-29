package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Order {

	private String orderId;
	private String productId;
	private double qty;
	
	public Order(String orderId, String productId, double qty) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.qty = qty;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	
	
}
