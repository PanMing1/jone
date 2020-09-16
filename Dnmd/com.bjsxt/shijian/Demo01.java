package shijian;

import java.util.Date;

public class Demo01 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		Date date1 = new Date(1000L*3600*24*365*100);
		System.out.println(date1);
	}
}
