package com.Java_Programs;

public class StringMethods {

	public static void main(String[] args) {
		int n;
		
		String s = "Java Programming" , t = "" , u = "";
		
		System.out.println(s);
		
		n = s.length();
		System.out.println("Number of characters = " + n );
		
		t  = s.replace("Java", "PHP");
		System.out.println(s);
		System.out.println(t);
		
		u = s.concat(" is fun");
		System.out.println(s);
		System.out.println(u);

	}

}
