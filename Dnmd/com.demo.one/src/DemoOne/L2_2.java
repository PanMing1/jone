package DemoOne;

import java.util.Scanner;

public class L2_2 {
	public static void main(String[] args) {
		A aa = new A();
		try {
			aa.a();
		} catch (Exception e) {
			System.out.println("输入错误");
		}
		System.out.println("正常运行中");
	}
}
class A{
	void a() throws Exception {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a%b;
		System.out.println("余数为："+ c);
	}
}