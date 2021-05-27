package com.unit04.test;

import java.util.Random;

public class Test04_01_01 {
	public static void main(String[] args) {
		Random r = new Random();
		int a;
		int b[] = new int[6];
		b[0] = r.nextInt(33) + 1;
		int j = 1;
		while (j <= b.length - 1) {
			int c = r.nextInt(33) + 1;
			boolean d = true;
			for (int i = 0; i < j; i++) {
				if (c == b[i]) {
					d = false;
					break;
				}
			}
			if (d) {
				b[j] = c;
				for (int i = j; i > 0; i--) {
					if (b[i] < b[i - 1]) {
						int e = b[i];
						b[i] = b[i - 1];
						b[i - 1] = e;
					}
				}
				j++;
			}
		}
		for (int i : b) {
			System.out.print(i);
			System.out.print("\t");
		}
	}
}
