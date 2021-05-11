package com.unit02.test;

import java.math.BigDecimal;

public class Test02_08_01 {

	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("15.31");
		BigDecimal d2 = new BigDecimal("3.23");
		System.out.println(d1.add(d2));
		System.out.println(d1.subtract(d2));
		System.out.println(d1.multiply(d2));
		System.out.println(d1.divide(d2,5,BigDecimal.ROUND_HALF_UP));
		System.out.println(d1.remainder(d2));
	}

}
