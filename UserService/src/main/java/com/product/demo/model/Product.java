package com.product.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private int id;
	
	private String name;
	
	private String type;
	
	private String desccription;
	
	private String model;
	
	private double price;
	
	private String msg;
	
}
