package com.graymatter;


public class DemoOnStatic {
	
	
	static {
		System.out.println("Static Block 1");
	}

	static {
		System.out.println("Static Block 2");
	}

	static {
		System.out.println("Static Block 3");
	}

	static String name;	
	
	public static void main (String[] args) {
		
		System.out.println("Inside main");
		main();
		name = "Divyanshu";
		sayHello(name);
		
	}
	
	public static void main() {
		System.out.println("Static main without argument");
		
	}
	

	public static void sayHello(String name) {
		System.out.println("Hello" + name);
	}
	
	static {
		System.out.println("Static Block 4");
	}


	
}
