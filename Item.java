package com.graymatter;

public class Item {

	String name;
	int cost;
	
	
	public Item() {
		super();
	}
	
	
	public Item(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Item [name=" + name + ", cost=" + cost + "]";
	}
	
}
