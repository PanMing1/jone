package com.unit03.test;

public class Test03_04_01 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
//		== �����ж��������ַ����Ƿ���һ������
		System.out.println(s1 == s2);
//		.equals() :����Ҳ���ж��Ƿ���Ҫ��һ�����󣬵�����String���б���д
//		���Կ����ж�ֵ�Ƿ����
		System.out.println(s1.equals(s2));
		String s3 = null;
		System.out.println("1".equals(s3));
//		.equals() :ǰ��Ϊnull���ᱨ��ָ���쳣��java.lang.NullPointerException��
//		System.out.println(s3.equals("1"));
		String s4 = "";
//		���ַ���������²��ᱨ��ָ���쳣
		System.out.println(s4.equals("1"));
		String s5 = "HELLO";
//		.equalsIgnoreCase() :�����ִ�Сд�ж�ֵ������
		System.out.println(s1.equalsIgnoreCase(s5));
//		�ַ�����ƴ��
		String s6 = "hello" + false;
//		�ַ���һ���������Ͳ����Ըı䣬��ƴ��ֻ�����¿�����һ���ڴ�ռ�
//		�κκ��ַ�����ƴ�ӵ��������Ͷ��ᱻת�����ַ���
		System.out.println(s6);
	}

}
