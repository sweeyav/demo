package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderandShipment {
	@Autowired
	private Order order;
	@Autowired
	private Shipment shipment;
	
	/*
	 * public OrderandShipment(Order order, Shipment shipment) { super(); this.order
	 * = order; this.shipment = shipment; }
	 */
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Shipment getShipment() {
		return shipment;
	}
	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
	
	

}
