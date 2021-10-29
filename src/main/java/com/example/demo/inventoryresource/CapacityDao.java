package com.example.demo.inventoryresource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Capacity;


@Component
public class CapacityDao {
private static List<Capacity> capacity = new ArrayList<>();
	
	static {
		capacity.add(new Capacity(" Store001", "Prod1", new Date(2021 - 10 - 28), 1.0));
		capacity.add(new Capacity (" Store001", "Prod2", new Date(2021 - 10- 30), 3.0));
		capacity.add(new Capacity (" Store001", "Prod3", new Date(2021 - 10 - 29), 2.0));
	}
	
	public List<Capacity> findAll() {
		return capacity;
		
	}
	
	public Capacity getCapacity(String storeNo) {
		return capacity.stream().filter(capacity -> capacity.getStoreNo().equals(storeNo)).findFirst().get();
		
	}
	

}
