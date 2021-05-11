package com.unit02.test;

import java.text.DecimalFormat;
import java.util.Random;

public class Test02_06_01 {
	public static void main(String[] args) {
		Random r1 = new Random();
		int a;
		for (int i = 0; i < 10; i++) {
			a = r1.nextInt(33)+1;
			System.out.print(a+"\t");
		}
		System.out.println();
		double b;
		DecimalFormat df = new DecimalFormat("#0.00");
		for (int i = 0; i < 10; i++) {
			b = Double.valueOf(df.format(r1.nextDouble()*100));
			System.out.print(b+"\t");
		}
	}
}
