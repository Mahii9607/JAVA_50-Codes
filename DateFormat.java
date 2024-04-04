package com.Java_Programs;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormat {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Date format change by KiranAcademy");
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);
		System.out.println("Date format with MM/dd/yyyy :" +strDate);
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = formatter.format(date);
		System.out.println("Date format with dd-M-yyyy hh:mm:ss : "+strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy : "+strDate);
		strDate = formatter.format(date);
		System.out.println("Date format with  dd MMMM yyyy : " +strDate);

		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formatter.format(date);
		System.out.println("Date fomat with dd  MMMM yyyy zzzz :" +strDate);
		
		formatter = new SimpleDateFormat("E , dd MM yyyy HH:mm:ss z");
		strDate = formatter.format(date);
		System.out.println("Date Format E , dd MMM yyyy HH:mm:ss z : "+strDate);
	}
}
