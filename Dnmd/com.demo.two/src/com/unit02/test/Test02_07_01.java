package com.unit02.test;

import java.math.BigInteger;

public class Test02_07_01 {
	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("7777777777");
		BigInteger b2 = new BigInteger("2222222222");
//		加
		System.out.println(b1.add(b2));
//		减
		System.out.println(b1.subtract(b2));
//		成
		System.out.println(b1.multiply(b2));
//		除（只取整数）
		System.out.println(b1.divide(b2));
//		取余
		System.out.println(b1.remainder(b2));
	}
}
