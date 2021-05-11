package com.unit02.test;

import java.text.DecimalFormat;

public class Test02_05_01 {
	public static void main(String[] args) throws Exception {
		int a = -20;
//		求绝对值
		int b = Math.abs(a);
		System.out.println(b);
//		平方根
		double c = Math.sqrt(16);
		System.out.println(c);
//		四舍五入
		double d = Math.round(16.723);
		System.out.println(d);
		int[] e = {12,7,8,3,4,11,89,54};
		int f = e[(int) (Math.random()*e.length)];
		System.out.println(f);
		int g = e[(int) Math.floor(Math.random()*e.length)];
		System.out.println(g);
		DecimalFormat df = new DecimalFormat("0.00");
		double i = 15.3/3;
		System.out.println(i);
		double h = Double.valueOf(df.format(i));
		System.out.println(h);
	}
}
