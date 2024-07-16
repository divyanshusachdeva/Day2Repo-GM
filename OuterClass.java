package com.graymatter;

public class OuterClass {

	static int id;
	
	static class Inner {
		
		String name;
		
	}
	
	public static void main(String[] args) {
		
//		OuterClass.Inner i = new OuterClass().new Inner(); // if the class is static, no need to use OuterClass here
		
		Inner i = new Inner();
		
	}
	
}
