package DemoOne7;

import java.io.*;

public class L7_1 {
	public static void main(String[] args) throws IOException {
		FileReader wj1 = new FileReader("D:\\PanMing\\home\\tuqu.java");
		FileReader wj2 = new FileReader("D:\\anshi\\jone\\Dnmd\\com.demo.one\\src\\DemoOne7\\L7_1.java");
//		D:\anshi\jone\Dnmd\com.demo.one\src\DemoOne7\L7_1.java
		int aa;
		aa = wj2.read();
		System.out.println("读取的文件内容为：");
		while (aa != (-1)) {
			System.out.print((char) aa);
			aa = wj2.read();
		}
		wj2.close();
	}
}
