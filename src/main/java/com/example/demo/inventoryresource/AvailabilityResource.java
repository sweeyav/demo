package com.example.demo.inventoryresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Availability;
import com.example.demo.Capacity;
import com.example.demo.Order;
import com.example.demo.OrderandShipment;
import com.example.demo.Shipment;
import com.example.demo.ShipmentDetails;

@RestController
public class AvailabilityResource {

	@Autowired
	private AvailabilityDAO dao;

	@Autowired
	private CapacityDao capacityDao;
	
	@Autowired
	private OrderandShipmentDAO orderandShipmentDAO;

	@GetMapping(path = "/getDatesByService/{storeNo}")
	public ResponseEntity<ShipmentDetails> getDatesByService(@RequestParam("storeNo") String storeNo) {
		Availability availability = dao.getAvailability(storeNo);
		Capacity capacity = capacityDao.getCapacity(storeNo);
		ShipmentDetails shilpmentDetails = new ShipmentDetails(storeNo, availability.getProductId(),
				availability.getAvailQty(), availability.getAvailDate());
		if (availability.getAvailDate().after(capacity.getDate())) {
			return new ResponseEntity<ShipmentDetails>(shilpmentDetails, HttpStatus.OK);
		} else if (availability.getAvailDate().before(capacity.getDate())) {
			ShipmentDetails shilpmentDetails1 = new ShipmentDetails(storeNo, availability.getProductId(),
					availability.getAvailQty(), capacity.getDate());
			return new ResponseEntity<ShipmentDetails>(shilpmentDetails1, HttpStatus.OK);
		}
		return new ResponseEntity<ShipmentDetails>(shilpmentDetails, HttpStatus.OK);

	}
	
	@GetMapping(path = "/getOrderDetails/{orderId}" )
	public ResponseEntity<OrderandShipment> getOrderDetails(@RequestParam("orderId") String orderId) {
		Order orders = orderandShipmentDAO.orders(orderId);
		Shipment shipments = orderandShipmentDAO.shipments(orderId);
		OrderandShipment orderandShipment = new OrderandShipment();
		orderandShipment.setOrder(orders);
		orderandShipment.setShipment(shipments);
		 
		return new ResponseEntity<OrderandShipment>(orderandShipment, HttpStatus.OK);
		
		
	}

}
