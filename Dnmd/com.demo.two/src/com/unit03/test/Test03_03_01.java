package com.unit03.test;

public class Test03_03_01 {

	public static void main(String[] args) {
//		���ַ�������Ѱ�Ҷ�Ӧ�ַ���������У�ָ����ж������û�����ڳ�������һ���ַ���
		String s1 = "hello";
		String s2 = "hello";
//		������true
		System.out.println(s1==s2);
//		new�����ڴ�Ķ��������·���һ��ռ䱣���ַ���
		String s3 = new String("hello");
		String s4 = new String("hello");
//		ÿһ��new�������������false
		System.out.println(s3==s4);
//		һ�����ַ������У�һ���Ƕ����ռ䣬������false
		System.out.println(s1==s3);
	}

}
