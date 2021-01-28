package DemoOne7;

import java.io.*;

public class L7_10 {
	public static void main(String[] args) {
		ObjectOutputStream o = null;
		ObjectInputStream p = null;
		PrintStream r = null;
		Aaa aaa = new Aaa("ֹ֪�����ж�", 108, 89.9f);
		Aaa bbb = null;
		try {
			// FileOutputStream�����˼��Ҫ���ļ�д��ʲô�ļ���
			FileOutputStream a = new FileOutputStream("D:/PanMing/home/a.txt");
			o = new ObjectOutputStream(a);
			o.writeObject(aaa);
			FileInputStream b = new FileInputStream("D:/PanMing/home/a.txt");
			p = new ObjectInputStream(b);
			bbb = (Aaa) p.readObject();
			// readObject() ���ڶ�ȡ���ݣ����ҽ�������ת��
			System.out.println(bbb.q + "----------" + bbb.w + "----------" + bbb.e);
			r = new PrintStream("D:/PanMing/home/c.txt");
			System.setOut(r);
			System.out.println(bbb.q + "----------" + bbb.w + "----------" + bbb.e);
			System.out.println(bbb.q + "----------" + bbb.w + "----------" + bbb.e);
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //�ƺ󣬱�֤�ļ��������ر�
			try {
				o.close();
				p.close();
				System.exit(-1);
				//�ر��ļ��˳�����
			} catch (Exception e2) {
				System.exit(-1);
				//�ļ��ر�ʧ�ܣ������˳�����
			}
		}
	}
}

//����Ҫimplements Serializable ��Ȼ�� java.io.NotSerializableException
class Aaa implements Serializable {
	String q = null;
	int w = 0;
	transient float e = 0;
	//transient �Ǻ��Ե���˼

	public Aaa(String q, int w, float e) {
		super();
		this.q = q;
		this.w = w;
		this.e = e;
	}
}