package com.graymatter;

import java.util.Arrays;

public class Car {

	private String modelName;
	private int year;
	Engine en[];
	
	Car() {
		super();
	}

	Car(String modelName, int year) {
		super();
		this.modelName = modelName;
		this.year = year;
		
		Engine e1 = new Engine(1,2);
		Engine e2 = new Engine(5,1);
		Engine en[] = new Engine[2];
		this.en = en;
	
	}

	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", year=" + year + ", en=" + Arrays.toString(en) + "]";
	}

	protected void finalize() throws Throwable {
		System.out.println("Manual invoke to finalize");
		System.gc();
		
	}
	
}
	
	
