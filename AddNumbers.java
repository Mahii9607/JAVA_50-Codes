package com.Java_Programs;
import java.util.Scanner;


public class AddNumbers {
	
	public static void main(String[] args) {
		
		int x , y ,z ;
		
		System.out.println("Enter two integers to calculate their sum ");
		
		Scanner in = new Scanner(System.in);
		
		 x = in.nextInt();
		 y = in.nextInt();
		 
		 z = x + y;
		 
		 System.out.println("sum of entered integers = " +z);
				
		
	}

	
}
