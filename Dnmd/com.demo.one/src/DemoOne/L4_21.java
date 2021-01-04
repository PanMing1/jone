package DemoOne;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class L4_21 {
	public static void main(String[] args) {
//		int i;
//		for (i = 0; i < 5; i++) {
//			
//		}
//		System.out.println(i);
//		Scanner sc = new Scanner(System.in);
//		try {
//			int y = sc.nextInt();
//			System.out.println(y);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String str1 = format.format(new Date());
		System.out.println(str1);
	}
}
