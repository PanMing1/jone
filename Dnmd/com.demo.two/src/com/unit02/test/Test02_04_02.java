package com.unit02.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02_04_02 {
	public static void main(String[] args) throws Exception {
//		�ַ���ת����
		String s1 = "2020/05/11 11:50:40";
		String pattern = "yyyy/MM/dd HH:mm:dd";
		SimpleDateFormat sd1 = new SimpleDateFormat(pattern);
		Date d1 = sd1.parse(s1);
		System.out.println(d1);
		
//		����ת�ַ���
		Date d2 = new Date();
		SimpleDateFormat sd2 = new SimpleDateFormat(pattern);
		String s2 = sd2.format(d2);
		System.out.println(s2);
	}
}
