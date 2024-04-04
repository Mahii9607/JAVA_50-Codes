package com.Java_Programs;

public class StaticInstance_Difference {

	public static void main(String[] args) {
		
		display();
		
		StaticInstance_Difference t =  new StaticInstance_Difference();
		t.show();
	}
	
	static void display() {
		System.out.println("Programming is amazing.");
	}
	
	void show() {
		System.out.println("Java is awesome.");
	}
}
