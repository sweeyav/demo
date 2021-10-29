package com.example.demo.inventoryresource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Order;
import com.example.demo.Shipment;

@Component
public class OrderandShipmentDAO {
	
	private static List<Order> order = new ArrayList<>();
	private static List<Shipment> shipment = new ArrayList<>();
	
	static {
		
		order.add(new Order("Order1", "Prod1", 2.0));
		shipment.add(new Shipment ("Order1", "Ship1", "Prod1" ,new Date (2021 - 02 - 19), 2.0));
		
	}
	
	public Order orders(String orderId) {
		return order.stream().filter(order1 -> order1.getOrderId().equals(orderId)).findFirst().get();
		
	}
	
	public Shipment shipments(String orderId) {
		return shipment.stream().filter(s -> s.getOrderId().equals(orderId)).findFirst().get();
		
	}
	
}
