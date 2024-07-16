package com.graymatter;

import java.util.Arrays;

public class School {

	private String schoolName;
	private String address;
	ClassRoom cr[];
	
	School() {
		super();
	}

	School(String schoolName, String address) {
		super();
		this.schoolName = schoolName;
		this.address = address;
		
		ClassRoom c1 = new ClassRoom(3,2);
		ClassRoom c2 = new ClassRoom(5,1);
		ClassRoom cr[] = new ClassRoom[2];
		this.cr = cr;
	
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", address=" + address + ", cr=" + Arrays.toString(cr) + "]";
	}

	protected void finalize() throws Throwable {
		System.out.println("Manual invoke to finalize");
		System.gc();
		
	}
	
}
	
	
