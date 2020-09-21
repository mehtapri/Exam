package com.controller.Q35;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, 6, 20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
System.out.println("dat1"+date1);//will print today's date as output
System.out.println("dat2"+date2);
System.out.println("dat3"+date3);
	}

}
