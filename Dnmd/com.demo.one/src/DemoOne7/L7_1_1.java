package DemoOne7;

import java.io.*;

public class L7_1_1 {
	public static void main(String[] args) throws IOException {
		FileInputStream wj1 = new FileInputStream("D:\\PanMing\\home\\tuqu.java");
//		FileInputStream �ֽ���ÿ��ֻ��һ���ֽ�
//		FileReader      �ַ���ÿ�ζ�һ���ַ�
//		1�ַ� = 2�ֽ�
//		1���� = 2�ֽ�
		FileReader wj2 = new FileReader("D:\\anshi\\jone\\Dnmd\\com.demo.one\\src\\DemoOne7\\L7_1.java");
		int aa;
		aa = wj1.read();
		System.out.println("��ȡ���ļ�����Ϊ��");
		while (aa != (-1)) {
			System.out.print((char) aa);
			aa = wj1.read();
		}
		wj1.close();
	}
}
