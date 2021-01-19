package DemoOne7;

import java.io.*;

public class L7_7 {
	public static void main(String[] args) throws Exception {
		DataOutputStream a = new DataOutputStream(new FileOutputStream("D:/PanMing/home/1.txt"));
		a.writeLong(12345);
		System.out.printf("%#x\n",12345);
		PrintStream b = new PrintStream(new FileOutputStream("D:/PanMing/home/2.txt"));
		b.print(12345);
	}
}
//DataOutputStream writeXXX(data)结果是二进制
//PrintStream print(data)结果是字符串形式