package DemoOne7;

import java.io.*;

public class L7_1_2 {
	public static void main(String[] args) throws IOException {
		FileReader wj1 = new FileReader("D:\\PanMing\\home\\tuqu.java");
		FileWriter wj2 = new FileWriter("D:\\PanMing\\home1\\tuqu.java");
		int aa;
		aa = wj1.read();
		System.out.println("��ȡ���ļ�����Ϊ��");
		while (aa != (-1)) {
			wj2.write((char)aa);
			aa = wj1.read();
		}
		wj2.flush(); //�����в���������ȫ�����
		wj1.close();
		wj2.close();
	}
}
