package com.graymatter;

public class DemoClass {

	public String name;
	
	public void printName() {
		System.out.println(name);
		InnerClass ic = new InnerClass();
		ic.innerClassName = "My inner class property.";
		
		ClassA ca = new ClassA();
		
	}
	
	public DemoClass() {
		this.name = "Private Name";
	}
	
	public class InnerClass {
		
		String innerClassName;
		
	}

	
	public DemoClass createDemoClassInstance () {
		DemoClass dc = new DemoClass();
		return dc;
	}

}
