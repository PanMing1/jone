package com.unit2.test;

import java.text.DateFormat;
import java.util.Date;

public class Test2_3_01 {
	public static void main(String[] args) {
		Date d1 = new Date();
		DateFormat df1 = DateFormat.getDateInstance();
		String time1 = df1.format(d1);
		System.out.println(time1);
		
		Date d2 = new Date();
		DateFormat df2 = DateFormat.getDateTimeInstance();
		String time2 = df2.format(d2);
		System.out.println(time2);
	}
}
