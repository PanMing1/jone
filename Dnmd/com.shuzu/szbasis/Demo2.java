package szbasis;

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		String[] a = { "一个", "两个", "三个", "四个", "五个" };
		String[] b = new String[7];
		System.arraycopy(a, 0, b, 0, a.length);
		for (String c : b) {
			System.out.print(c + '\t');
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]+'\t');
		}
		System.out.println(Arrays.toString(a));
	}
}
