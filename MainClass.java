package com.graymatter;

public class MainClass {

	public static void main(String[] args) throws Throwable {
		
		School sc = new School("KV", "Hyd");
		
		sc.finalize();
		
		Student s1 = new Student("Divyanshu", 123);
		Student s2 = new Student("Qwerty", 456);
		Student s3 = new Student("Amit", 789);
		
		Student st[] = {s1, s2, s3};
		
		ClassRoom c = new ClassRoom(7,4,st);
		
		System.out.println(sc);
		
		System.out.println(c);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		MainClass mc = new MainClass();
		mc.finalize();
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Manual invoke to finalize");
		System.gc();
		
	}
	
}
