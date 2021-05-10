package com.unit2.test;

import java.util.Date;

public class Test2_2_01 {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		long a = d1.getTime();
		System.out.println(a);
		Date d2 = new Date(2001-1900,1-1,1);
		System.out.println(d2);
		Date d3 = new Date();
		long start = d3.getTime();
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
		Date d4 = new Date();
		long end = d4.getTime();
		System.out.println("循环运行的毫秒数："+(end - start));
	}
}
