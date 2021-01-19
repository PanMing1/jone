package DemoOne7;

import java.io.*;

public class L7_5 {
	public static void main(String[] args) {
		String a = null;
		try {
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			a = b.readLine();
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//System.in 输入默认的是字节流
//BufferedReader 这个是字符流
//InputStreamReader 将字节流转换成字符流