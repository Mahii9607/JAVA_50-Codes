package com.Java_Programs;

public class Constructor_Overloading {

	String name;
	
	Constructor_Overloading(){
		System.out.println("Constructor method called.");
		
	}
	
	Constructor_Overloading(String t){
		name = t ;
	}
	
	public static void main(String[] args) {
		
		Constructor_Overloading cpp = new Constructor_Overloading();
		Constructor_Overloading java = new Constructor_Overloading("Java");
		
		cpp.setName("Ruby");
		
		java.getName();
		cpp.getName();
	}
	
	void setName(String t) {
		name = t ;
	}
	
	void getName() {
		
		System.out.println("Language name: " + name);
	}

	
		
	}

