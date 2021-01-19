package DemoOne7;

import java.io.*;

public class L7_1_1 {
	public static void main(String[] args) throws IOException {
		FileInputStream wj1 = new FileInputStream("D:\\PanMing\\home\\tuqu.java");
//		FileInputStream 字节流每次只读一个字节
//		FileReader      字符流每次读一个字符
//		1字符 = 2字节
//		1汉字 = 2字节
		FileReader wj2 = new FileReader("D:\\anshi\\jone\\Dnmd\\com.demo.one\\src\\DemoOne7\\L7_1.java");
		int aa;
		aa = wj1.read();
		System.out.println("读取的文件内容为：");
		while (aa != (-1)) {
			System.out.print((char) aa);
			aa = wj1.read();
		}
		wj1.close();
	}
}
