package com.unit02.test;

import java.util.logging.Logger;

public class Test02_01_02 {
	public static void main(String[] args) { 
		System.out.println("��ʼ");
		long a = System.currentTimeMillis();
//		currentTimeMillis() ���ص��ǵ�ǰʱ��������Э��ʱ��1970.1.1 00:00:00�ĺ����
		System.out.println(a);
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("forѭ��ʹ�ú���"+time);
	}
}
