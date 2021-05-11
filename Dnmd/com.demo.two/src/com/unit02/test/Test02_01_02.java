package com.unit02.test;

import java.util.logging.Logger;

public class Test02_01_02 {
	public static void main(String[] args) { 
		System.out.println("开始");
		long a = System.currentTimeMillis();
//		currentTimeMillis() 返回的是当前时间与世界协调时间1970.1.1 00:00:00的毫秒差
		System.out.println(a);
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("for循环使用毫秒"+time);
	}
}
