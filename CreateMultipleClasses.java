package com.Java_Programs;

public class CreateMultipleClasses {

	CreateMultipleClasses(){
		System.out.println("Constructor of Computer class.");
	}
	
	void CreateMultipleClasses_method() {
		System.out.println("Power gone! Shut down your PC soon...");
	}
	
	public static void main(String[] args) {
		
		CreateMultipleClasses cm = new CreateMultipleClasses();
		cm.CreateMultipleClasses_method();
		
		
	}
}
