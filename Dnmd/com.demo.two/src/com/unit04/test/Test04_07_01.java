package com.unit04.test;

import java.util.Random;
import java.util.TreeSet;

public class Test04_07_01 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		Random r = new Random();
		int i = 1;
		while (ts.size() < 5) {
			ts.add(r.nextInt(33) + 1);
			System.out.println("Ñ­»·´ÎÊý" + i);
			i++;
		}
		for (Integer integer : ts) {
			System.out.print(integer + "\t");
		}
	}
}
