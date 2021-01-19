package DemoOne7;

import java.io.*;

public class L7_3 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream hcfz = new BufferedInputStream(new FileInputStream("D:/PanMing/home/333.mp3"));
		BufferedOutputStream hczt = new BufferedOutputStream(new FileOutputStream("D:/PanMing/home1/333.mp3"));
		int ff;
		byte hc[] = new byte[1048576];
		ff = hcfz.read(hc);
		int i = 1;
		while (ff != (-1)) {
			System.out.println("»º´æ´ÎÊý" + i++);
			hczt.write(hc, 0, ff);
			ff = hcfz.read(hc);
		}
		hczt.flush();
		hcfz.close();
		hczt.close();
	}
}
// 12,185.6
// 12,503,040