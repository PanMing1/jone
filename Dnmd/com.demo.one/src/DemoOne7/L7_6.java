package DemoOne7;

import java.io.*;

public class L7_6 {
	public static void main(String[] args) throws Exception {
		String a = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(a);
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String c = b.readLine();
		System.out.println("---------------------");
		System.out.println(c+"xxxxxxxx");
		System.out.println(c.equals(""));
		System.out.println(c.equals(null));
	}
}
