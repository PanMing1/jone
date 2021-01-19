package DemoOne7;

import java.io.*;

public class L7_1_2 {
	public static void main(String[] args) throws IOException {
		FileReader wj1 = new FileReader("D:\\PanMing\\home\\tuqu.java");
		FileWriter wj2 = new FileWriter("D:\\PanMing\\home1\\tuqu.java");
		int aa;
		aa = wj1.read();
		System.out.println("读取的文件内容为：");
		while (aa != (-1)) {
			wj2.write((char)aa);
			aa = wj1.read();
		}
		wj2.flush(); //将流中残留的内容全部输出
		wj1.close();
		wj2.close();
	}
}
