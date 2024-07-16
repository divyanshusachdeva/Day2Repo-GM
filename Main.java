package com.graymatter;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		System.out.println(emp);

		Employee emp1 = new Employee("Divyanshu", 234, "9289890765", "divyanshu@gmail.com", new Date("09/21/2002"), "SD", 65000, new Date("07/08/2024"));
		
		System.out.println(emp1);
		
		System.out.println(emp1 instanceof Employee);
		System.out.println(emp1 instanceof Person);
		
		
		Customer cus = new Customer();
		System.out.println(cus);

		Customer cus1 = new Customer(234000, 70654);
		
		System.out.println(cus1);
		
		
	}

}
