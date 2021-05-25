package com.unit03.test;

public class Test03_04_01 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
//		== ：是判断两个的字符串是否是一个对象
		System.out.println(s1 == s2);
//		.equals() :本身也是判断是否是要给一个对象，但是在String类中被重写
//		所以可以判断值是否相等
		System.out.println(s1.equals(s2));
		String s3 = null;
		System.out.println("1".equals(s3));
//		.equals() :前面为null，会报空指针异常（java.lang.NullPointerException）
//		System.out.println(s3.equals("1"));
		String s4 = "";
//		空字符串的情况下不会报空指针异常
		System.out.println(s4.equals("1"));
		String s5 = "HELLO";
//		.equalsIgnoreCase() :不区分大小写判断值的内容
		System.out.println(s1.equalsIgnoreCase(s5));
//		字符串简单拼接
		String s6 = "hello" + false;
//		字符串一旦声明，就不可以改变，简单拼接只是重新开辟了一块内存空间
//		任何和字符串简单拼接的数据类型都会被转换成字符串
		System.out.println(s6);
	}

}
