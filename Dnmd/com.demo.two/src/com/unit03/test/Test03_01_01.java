package com.unit03.test;

public class Test03_01_01 {

	public static void main(String[] args) {
		int a = 20;
		Integer i1 = new Integer(a);
		Integer i2 = Integer.valueOf(a);
		int b = i1.intValue();
//		�Զ��������
		Integer i3 = 30;
		int c = i3;
	}

}
