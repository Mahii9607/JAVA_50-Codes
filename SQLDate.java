package com.Java_Programs;

import java.sql.Date;

public class SQLDate {

	public static void main(String[] args) {
		
		String str = "2024-04-03";
		Date date = Date.valueOf(str);
		System.out.println(date);
	}
}
