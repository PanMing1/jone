package shijian;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {
	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1 = sdf1.format(new Date());
		System.out.println(s1);
		Date d1 = null;
		try {
			d1 = sdf1.parse("2008-08-08 22:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d1.getTime());
		System.out.println(sdf1.format(d1));
		SimpleDateFormat sdf2 = new SimpleDateFormat("今年第w周");
		System.out.println(sdf2.format(new Date()));
		DateFormat sdf3 = new SimpleDateFormat("今天E");
		System.out.println(sdf3.format(new Date()));
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			d1 = sdf4.parse("2020-07-19");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf3.format(d1));
	}
}
