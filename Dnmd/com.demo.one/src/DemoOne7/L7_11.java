package DemoOne7;

import java.io.File;

public class L7_11 {
	public static void main(String[] args) {
		File a = new File("D:/PanMing/home/a.txt");
		System.out.println(a.exists());
		if (a.exists()) {//�ļ��Ƿ����
			System.out.println("�ļ�·����"+a.getAbsolutePath());
			//��ȡ�ļ�·��
			System.out.println("�ļ���С��"+a.length());
			//��ȡ�ļ���С��ռ�ö����ֽ�
			System.out.println(a.canRead());
			//�ļ��Ƿ�ɶ�
			System.out.println(a.canWrite());
			//�ļ��Ƿ��д
		}else {
			System.out.println("�ļ�����");
		}
	}
}
