package DemoOne7;

import java.io.File;
import java.io.IOException;

public class L7_11_1 {
	public static void main(String[] args) {
		File a = new File("D:/PanMing/home/a1.txt");
		if (!a.exists()) {
			try {//异常是处理文件夹可能不存在的情况
				a.createNewFile();
				//创建文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("文件已存在");
		}
	}
}
