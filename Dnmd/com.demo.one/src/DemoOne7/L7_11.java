package DemoOne7;

import java.io.File;

public class L7_11 {
	public static void main(String[] args) {
		File a = new File("D:/PanMing/home/a.txt");
		System.out.println(a.exists());
		if (a.exists()) {//文件是否存在
			System.out.println("文件路径："+a.getAbsolutePath());
			//读取文件路径
			System.out.println("文件大小："+a.length());
			//读取文件大小，占用多少字节
			System.out.println(a.canRead());
			//文件是否可读
			System.out.println(a.canWrite());
			//文件是否可写
		}else {
			System.out.println("文件存在");
		}
	}
}
