package com.Java_Programs;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int n , sum = 0 , temp , remainder , digits = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a number to check if it is an Armstrong number");
		
		n = sc.nextInt();
		
		temp = n;
		
		//count number of digits
		
		while(temp != 0) {
			remainder = temp%10;
			sum = sum+ power(remainder , digits);
			temp = temp/10;
			
		}
		
		if(n == sum)
			System.out.println(n +" is an Armstrong number.");
		else
			System.out.println(n + " is not an Armstrong number.");
		
	}
	
	static int power(int n, int r) {
		int c , p =1;
		for(c=1 ; c<=r ; c++);
		return p;
	}

}
