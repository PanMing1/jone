package DemoOne7;

import java.io.*;
import java.util.Scanner;

public class L7_9_1 {
	public static void main(String[] args) {
		PrintStream a = null;
		PrintStream b = null;
		Scanner c = null;
		try {
			a = new PrintStream("D:/PanMing/home/a.txt");
			b = new PrintStream("D:/PanMing/home/b.txt");
			c = new Scanner(System.in);
			int d;			
			System.setOut(a);
			System.setErr(b);
			d = c.nextInt();
			System.out.println(d);
		} catch (Exception e) {
			System.err.println("在亲民，在止于至善");
		}
	}
}
