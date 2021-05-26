package com.unit03.test;

public class Test03_09_01 {

	public static void main(String[] args) {
		String s1 = "-我相-";
		String s2 = "-人相-";
//		速度: StringBuilder > StringBuilder > string
//		StringBuilder线程不安全；StringBuilder线程比较安全
		StringBuffer sb1 = new StringBuffer(s1);
		String s3 = sb1.append(s1).toString();
		System.out.println(s3);
		System.out.println(s1);
	}

}
