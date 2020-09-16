package shijian;

import java.util.Date;
import java.util.GregorianCalendar;

public class Demo04 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(new Date());
		TestCalendar tc = new TestCalendar();
		tc.printCalendar(calendar);
	}
}
