package DemoOne;

import java.util.Scanner;

public class L2_1 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a%b;
			System.out.println("余数为："+ c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("程序继续运行");
	}
}
