package com.graymatter;

public class Customer extends Person{
	
	private double orderSum;
	private int orderId;
	
	public Customer() {
		super();
	}

	public Customer(double orderSum, int orderId) {
		super();
		this.orderSum = orderSum;
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "Customer [orderSum=" + orderSum + ", orderId=" + orderId + ", toString()=" + super.toString() + "]";
	}
	
	
}
