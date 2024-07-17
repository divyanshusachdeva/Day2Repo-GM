package com.graymatter;

import java.util.Arrays;

public class Order {

	int id;
	int amount;
	
	public Order() {
		super();
	}

	public Order(int id, int amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

	
	@Override
	public String toString() {
		return "Order [id=" + id + ", Amount=" + amount + "]";
	}
	
	
	
	
	
}
