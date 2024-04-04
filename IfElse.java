package com.Java_Programs;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		int markObtained , passingMarks;
		
		passingMarks = 40;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input marks scored by you");
		
		markObtained = in.nextInt();
		
		if(markObtained >= passingMarks) {
			System.out.println("You paased the exam.");
			
		}
		else {
			System.out.println("Unfortunately you failed to pass the exam.");
		}
		
		
	}
}
