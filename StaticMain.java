package com.graymatter;

public class StaticMain {

	public static void main(String[] args) {
		
		OuterClass o = new OuterClass();
		OuterClass.Inner i = new OuterClass.Inner();
		
		OuterClass.id = 67;

	}

}
