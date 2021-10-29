package com.example.demo.inventoryresource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Availability;
import com.example.demo.Supply;

@Component
public class SupplyDAO {
	
private static List<Supply> supply = new ArrayList<>();
	
	static {
		
		supply.add(new Supply("Product1",new Date(2021-03-16),10.0));
		supply.add(new Supply ("Product2",new Date(2021-03-16),5.0));
		supply.add(new Supply ("Product3",new Date(2021-03-16),30.0));
	}
	
}
