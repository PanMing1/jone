package com.unit03.test;

public class Test03_02_01 {

	public static void main(String[] args) {
		String s1 = "456";
//		Stringת����int��Ҫ������
		int a1 = Integer.parseInt(s1);
//		����ת����ʽ
		int a2 = Integer.valueOf(s1);
		System.out.println(a1);
		System.out.println(a2);
//		ת����ɿ��Խ�����ֵ����
		int a3 = a1 + a2;
		System.out.println(a3);
		int a4 = 789;
		String s2 = Integer.toString(a4);
		System.out.println(s2);
		int a5 = 1234;
//		ת�����ַ�ʽ��1.�����Զ�ת��
		String s3 = a5 + "";
//		2
		String s4 = String.valueOf(a5);
//		3
		String s5 = Integer.toString(a5);
		System.out.println(s3 + s4 + s5);
	}

}
