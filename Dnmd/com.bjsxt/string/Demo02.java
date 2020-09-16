package string;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入：");
		StringBuffer a1 = new StringBuffer(sc.nextLine());
		a1.insert(4, '仙');
		a1.delete(1, 3);
		System.out.println(a1);
	}
}
