package com.unit02.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02_04_01 {
	public static void main(String[] args) throws Exception {
//		�ַ���ת����
		String s1 = "2020/15/11 11:50:40";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:dd");
		Date d1 = sdf1.parse(s1);
		System.out.println(d1);
		
//		����ת�ַ���
		Date d2 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd��  HHʱmm��dd��");
		String s2 = sdf2.format(d2);
		System.out.println(s2);
	}
}
