package szbasis;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		int[] a = {103,102,101,100,51,52,4,23};
		System.out.println(a.length);
//		int a1 = a[8];
//		System.out.println(a1);
		for (int i : a) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(a, 4));
		Arrays.sort(a);
		for (int i : a) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(a, 100));
	}
}
