package DemoOne;

import java.util.ArrayList;

public class L4_1 {
	public static void main(String[] args) {
		ArrayList aa = new ArrayList();
		System.out.println("��СΪ" + aa.size());
		XS x1 = new XS("С��", 10, 80);
		XS x2 = new XS("����", 20, 78);
		XS x3 = new XS("���", 30, 86);
		XS x4 = new XS("����", 31, 56);
		XS x5 = new XS("��ϣ", 32, 76);
		aa.add(x1);
		aa.add(x2);
		aa.add(x3);
		aa.add(x4);
		aa.add(x5);
		System.out.println("��СΪ" + aa.size());
		for (int i = 0; i < aa.size(); i++) {
			XS xs = (XS) aa.get(i);
			System.out.println("��"+(i+1)+"�������֣�"+xs.getXiaoming()+"������"+xs.getXuehao()+"����Ϣ"+xs.getChegnji());
		}
		System.out.println("------------------------------------");
		aa.remove(1);
		for (int i = 0; i < aa.size(); i++) {
			XS xs = (XS) aa.get(i);
			System.out.println("��"+(i+1)+"�������֣�"+xs.getXiaoming()+"������"+xs.getXuehao()+"����Ϣ"+xs.getChegnji());
		}
		System.out.println("------------------------------------");
//		XS x6 = new XS("", 100, 101);
//		aa.add(1, x6);
//		for (int i = 0; i < aa.size(); i++) {
//			XS xs = (XS) aa.get(i);
//			System.out.println("��"+(i+1)+"�������֣�"+xs.getXiaoming()+"������"+xs.getXuehao()+"����Ϣ"+xs.getChegnji());
//		}
		System.out.println("------------------------------------");
		XS x7 = new XS("Ϥ��", 77, 78);
		aa.add(x7);
		for (int i = 0; i < aa.size(); i++) {
			XS xs = (XS) aa.get(i);
			System.out.println("��"+(i+1)+"�������֣�"+xs.getXiaoming()+"������"+xs.getXuehao()+"����Ϣ"+xs.getChegnji());
		}
		System.out.println("------------------------------------");
		System.out.println(aa);
	}
}

class XS {
	private String xiaoming;
	private int xuehao;
	private int chegnji;

	XS(String xiaoming, int xuehao, int chegnji) {
		this.xiaoming = xiaoming;
		this.xuehao = xuehao;
		this.chegnji = chegnji;
	}

	public String getXiaoming() {
		return xiaoming;
	}

	public void setXiaoming(String xiaoming) {
		this.xiaoming = xiaoming;
	}

	public int getXuehao() {
		return xuehao;
	}

	public void setXuehao(int xuehao) {
		this.xuehao = xuehao;
	}

	public int getChegnji() {
		return chegnji;
	}

	public void setChegnji(int chegnji) {
		this.chegnji = chegnji;
	}

}