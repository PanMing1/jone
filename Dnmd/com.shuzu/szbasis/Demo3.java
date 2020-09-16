package szbasis;

import java.util.Random;
import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] i = new int[10];
		for (int j = 0; j < i.length; j++) {
			i[j] = r.nextInt(33);
		}
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j] + "\t");
		}
		System.out.println();
		Arrays.sort(i);
		for (int m : i) {
			System.out.print(m + "\t");
		}
		System.out.println();
		int a = 10;
		int b = 20;
		System.out.println(a+" "+b);
		System.out.println(Arrays.binarySearch(i, 17));
	}
}
