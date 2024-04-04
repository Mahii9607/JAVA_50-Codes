package com.Java_Programs;

public class PrintDateTime {

	public static void main(String[] args) {


		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		System.out.println(date);
		}

}
