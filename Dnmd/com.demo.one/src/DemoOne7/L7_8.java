package DemoOne7;

import java.io.*;

public class L7_8 {
	public static void main(String[] args) throws Exception {
		PrintStream a = new PrintStream("D:/PanMing/home/3.txt");
		System.setOut(a);
		System.out.println("��ѧ֮������������");
	}
}
//DataOutputStream writeXXX(data)����Ƕ�����
//PrintStream print(data)������ַ�����ʽ