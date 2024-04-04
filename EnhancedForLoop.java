package com.Java_Programs;

public class EnhancedForLoop {

	public static void main(String[] args) {
		//for numbers
		int primes[] = {2,3,5,7,11,13,17,19,23,29};
		
		//for string
		String languages[] = {"C", "C++" , "Java" , "Python" , "Ruby"};
		
		for(int sample1 :primes) {
			System.out.println(sample1);
		}
		
		for(String sample2: languages) {
			System.out.println(sample2);
		}
		}

}
