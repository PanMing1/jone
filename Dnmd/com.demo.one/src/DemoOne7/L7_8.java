package DemoOne7;

import java.io.*;

public class L7_8 {
	public static void main(String[] args) throws Exception {
		PrintStream a = new PrintStream("D:/PanMing/home/3.txt");
		System.setOut(a);
		System.out.println("大学之道，在明明德");
	}
}
//DataOutputStream writeXXX(data)结果是二进制
//PrintStream print(data)结果是字符串形式