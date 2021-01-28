package DemoOne7;

import java.io.*;

public class L7_10 {
	public static void main(String[] args) {
		ObjectOutputStream o = null;
		ObjectInputStream p = null;
		PrintStream r = null;
		Aaa aaa = new Aaa("知止而后有定", 108, 89.9f);
		Aaa bbb = null;
		try {
			// FileOutputStream这句意思是要把文件写到什么文件中
			FileOutputStream a = new FileOutputStream("D:/PanMing/home/a.txt");
			o = new ObjectOutputStream(a);
			o.writeObject(aaa);
			FileInputStream b = new FileInputStream("D:/PanMing/home/a.txt");
			p = new ObjectInputStream(b);
			bbb = (Aaa) p.readObject();
			// readObject() 用于读取数据，并且进行数据转换
			System.out.println(bbb.q + "----------" + bbb.w + "----------" + bbb.e);
			r = new PrintStream("D:/PanMing/home/c.txt");
			System.setOut(r);
			System.out.println(bbb.q + "----------" + bbb.w + "----------" + bbb.e);
			System.out.println(bbb.q + "----------" + bbb.w + "----------" + bbb.e);
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //善后，保证文件能正常关闭
			try {
				o.close();
				p.close();
				System.exit(-1);
				//关闭文件退出程序
			} catch (Exception e2) {
				System.exit(-1);
				//文件关闭失败，照样退出程序
			}
		}
	}
}

//必须要implements Serializable 不然报 java.io.NotSerializableException
class Aaa implements Serializable {
	String q = null;
	int w = 0;
	transient float e = 0;
	//transient 是忽略的意思

	public Aaa(String q, int w, float e) {
		super();
		this.q = q;
		this.w = w;
		this.e = e;
	}
}