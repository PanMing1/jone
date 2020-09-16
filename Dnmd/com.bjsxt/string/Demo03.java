package string;

public class Demo03 {
	public static void main(String[] args) {
		String a = "";
		long num1  = Runtime.getRuntime().freeMemory();
		long date1 = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			a = a + i;
		}
		long num2 = Runtime.getRuntime().freeMemory();
		long date2 = System.currentTimeMillis();
		System.out.println(num1 - num2);
		System.out.println(date2 - date1);
		StringBuffer b = new StringBuffer("");
		long num3 = Runtime.getRuntime().freeMemory();
		long date3 = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			b.append(i);
		}
		long num4 = Runtime.getRuntime().freeMemory();
		long date4 = System.currentTimeMillis();
		System.out.println(num3 - num4);
		System.out.println(date4 - date3);
	}
}
