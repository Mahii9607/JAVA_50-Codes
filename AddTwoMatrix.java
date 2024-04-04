package com.Java_Programs;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {

		int m , n , c ,d ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nuber of rows and columns of matrix");
		
		m = sc.nextInt();
		n = sc.hashCode();
		
		int first[][] = new int[m] [n];
		int second [][]= new int [m] [n];
		int sum[][] = new int [m] [n];
		
		System.out.println("Enter the elements of first matrix");
		
		for(c = 0 ; c < m ; c++)
			for(d = 0 ; d < n ; d++)
				first[c] [d] = sc.nextInt();
		
		System.out.println("Enter the elements of second matrix");
		
		for(c = 0 ; c < m ; c++) 
			for(d = 0 ; d <n ; d++)
				second [c] [d] = sc.nextInt();
		
		for(c = 0 ; c < m ; c++)
			for(d = 0 ; d < n ; d++)
				sum[c] [d] = first[c] [d] + second[c] [d];
		
		System.out.println("Sum oof enterd matrices:-");
		
		for(c = 0 ; c < m ; c++)
		{
			for(d = 0; d < n ; d++)
				System.out.println(sum[c] [d] + "\t");
			
			System.out.println();
		}
		
		
 

	}

}
