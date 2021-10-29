package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ShipmentDetails {
	private String storeNo ;
	private String productId;
	private double reqQty;
	private Date shipmentDate;
	
	public ShipmentDetails(String storeNo, String productId, double reqQty, Date shipmentDate) {
		super();
		this.storeNo = storeNo;
		this.productId = productId;
		this.reqQty = reqQty;
		this.shipmentDate = shipmentDate;
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
	public double getReqQty() {
		return reqQty;
	}
	public void setReqQty(double reqQty) {
		this.reqQty = reqQty;
	}
	public Date getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	
	

}
