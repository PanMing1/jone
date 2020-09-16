package shijian;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Demo03 {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar(2008,9,2,22,10,50);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day1 = calendar.get(Calendar.DATE);
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(day);
//		System.out.println(day1);
		GregorianCalendar calendar2 = new GregorianCalendar();
		calendar2.set(Calendar.YEAR, 2020);
		calendar2.set(Calendar.MONTH, Calendar.FEBRUARY);
		calendar2.set(Calendar.DATE, 14);
		calendar2.set(Calendar.HOUR_OF_DAY, 16);
		calendar2.set(Calendar.MINUTE, 31);
		calendar2.set(Calendar.SECOND, 41);
		System.out.println(calendar2);
	}
	static void ppp(Calendar calendar) {
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day1 = calendar.get(Calendar.DATE);
	}
}
