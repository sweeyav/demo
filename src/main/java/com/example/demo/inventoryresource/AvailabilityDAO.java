package com.example.demo.inventoryresource;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Availability;

@Component
public class AvailabilityDAO {
	
	private static List<Availability> products = new ArrayList<>();
	
	static {
		
		products.add(new Availability ("Store001", "Prod1", 1.0,new Date(2021 - 10 - 29)));
		products.add(new Availability ("Store001", "Prod2", 3.0,new Date(2021 - 10 - 26)));
		products.add(new Availability ("Store001", "Prod3", 2.0,new Date(2021 - 10 - 25)));
	}
	
	public Availability getAvailability(String storeNo) {
		return products.stream().filter(prod -> prod.getStoreNo().equals(storeNo)).findFirst().get();
		
	}
	
}
