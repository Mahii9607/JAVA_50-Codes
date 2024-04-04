package com.Java_Programs;

import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		
		int a   ,  b  , result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input two integers");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		//try block
		
		try {
			result = a / b ;
			System.out.println("Result = " + result);
		}
		
		//catch
		
		catch(ArithmeticException e) {
			System.out.println("Exception caught:Division by zero.");
		}
		
	}
}
