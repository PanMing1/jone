package string;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		StringBuffer abc = new StringBuffer();
		for (int i = 0; i < 7; i++) {
			abc.append((char)('a'+i));
		}
		System.out.println(abc.toString());
		int a = (int)'b';
		System.out.println(a);
		char b = 99;
		System.out.println(b);
		System.out.println("输入：");
		Scanner sc = new Scanner(System.in);
		String a2 = sc.nextLine();
		StringBuffer a3 = new StringBuffer(a2);
		System.out.println(a3);
		a3.append('哪');
		System.out.println(a3);
		a3.append('古').append('事').append('修');
		System.out.println(a3);
		a3.deleteCharAt(2);
		System.out.println(a3);
		System.out.println("输入：");
		StringBuffer a4 = new StringBuffer(sc.nextLine());
		a4.insert(0, '参').insert(3, '离');
		System.out.println(a4);
	}
}
