package DemoOne7;

import java.io.*;

public class L7_2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fz = new FileInputStream("D:\\PanMing\\home\\111.mp3");
		FileOutputStream zt = new FileOutputStream("D:\\PanMing\\home1\\222.mp3");
		int aa;
		aa = fz.read();
		System.out.println("��ȡ���ļ�����Ϊ��");
		while (aa != (-1)) {
			zt.write(aa);
			aa = fz.read();
		}
		zt.flush();
		fz.close();
		zt.close();
	}
}
