package DemoOne7;

import java.io.File;
import java.io.IOException;

public class L7_11_2 {
	public static void main(String[] args) {
		File a = new File("D:/PanMing/home/abcd");
		if (a.isDirectory()) {
			System.out.println(a.getName());
			File b[] = a.listFiles();
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i].getName());
				System.out.println(b[i].getAbsolutePath());
			}
		}else {
			a.mkdir();
		}
	}
}
