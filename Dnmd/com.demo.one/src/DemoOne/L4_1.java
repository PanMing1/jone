package DemoOne;

import java.util.ArrayList;

public class L4_1 {
	public static void main(String[] args) {
		ArrayList aa = new ArrayList();
		System.out.println("大小为" + aa.size());
		XS x1 = new XS("小明", 10, 80);
		XS x2 = new XS("王二", 20, 78);
		XS x3 = new XS("李辉", 30, 86);
		XS x4 = new XS("于民", 31, 56);
		XS x5 = new XS("刘希", 32, 76);
		aa.add(x1);
		aa.add(x2);
		aa.add(x3);
		aa.add(x4);
		aa.add(x5);
		System.out.println("大小为" + aa.size());
		for (int i = 0; i < aa.size(); i++) {
			XS xs = (XS) aa.get(i);
			System.out.println("第"+(i+1)+"个，名字："+xs.getXiaoming()+"，其他"+xs.getXuehao()+"，信息"+xs.getChegnji());
		}
		System.out.println("------------------------------------");
		aa.remove(1);
		for (int i = 0; i < aa.size(); i++) {
			XS xs = (XS) aa.get(i);
			System.out.println("第"+(i+1)+"个，名字："+xs.getXiaoming()+"，其他"+xs.getXuehao()+"，信息"+xs.getChegnji());
		}
		System.out.println("------------------------------------");
//		XS x6 = new XS("", 100, 101);
//		aa.add(1, x6);
//		for (int i = 0; i < aa.size(); i++) {
//			XS xs = (XS) aa.get(i);
//			System.out.println("第"+(i+1)+"个，名字："+xs.getXiaoming()+"，其他"+xs.getXuehao()+"，信息"+xs.getChegnji());
//		}
		System.out.println("------------------------------------");
		XS x7 = new XS("悉尼", 77, 78);
		aa.add(x7);
		for (int i = 0; i < aa.size(); i++) {
			XS xs = (XS) aa.get(i);
			System.out.println("第"+(i+1)+"个，名字："+xs.getXiaoming()+"，其他"+xs.getXuehao()+"，信息"+xs.getChegnji());
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