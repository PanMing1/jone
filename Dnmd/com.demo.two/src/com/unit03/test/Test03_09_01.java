package com.unit03.test;

public class Test03_09_01 {

	public static void main(String[] args) {
		String s1 = "-����-";
		String s2 = "-����-";
//		�ٶ�: StringBuilder > StringBuilder > string
//		StringBuilder�̲߳���ȫ��StringBuilder�̱߳Ƚϰ�ȫ
		StringBuffer sb1 = new StringBuffer(s1);
		String s3 = sb1.append(s1).toString();
		System.out.println(s3);
		System.out.println(s1);
	}

}
