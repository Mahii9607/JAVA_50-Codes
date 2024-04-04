package com.Java_Programs;

public class ReplaceString {

	
	public static void main(String[] args) {
		
		String s1 = "Sagar sir teaching Java very well..!";
		
		String[] words = s1.split("\\s");
		
		for(String w:words) {
			System.out.println(w);
		}
	}
}
