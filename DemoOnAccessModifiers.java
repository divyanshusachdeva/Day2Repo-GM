package com.graymatter;

public class DemoOnAccessModifiers {

	public static void main(String[] args) {
		
		DemoClass dc = new DemoClass();
		dc.name = "Divyanshu";
		System.out.println(dc.name);
		
		DemoClass.InnerClass ic = new DemoClass().new InnerClass();
		
	}
}
