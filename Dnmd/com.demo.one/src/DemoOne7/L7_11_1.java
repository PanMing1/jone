package DemoOne7;

import java.io.File;
import java.io.IOException;

public class L7_11_1 {
	public static void main(String[] args) {
		File a = new File("D:/PanMing/home/a1.txt");
		if (!a.exists()) {
			try {//�쳣�Ǵ����ļ��п��ܲ����ڵ����
				a.createNewFile();
				//�����ļ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("�ļ��Ѵ���");
		}
	}
}
