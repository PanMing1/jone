package com.unit03.test;

public class Test03_03_01 {

	public static void main(String[] args) {
//		在字符串池中寻找对应字符串，如果有，指向池中对象，如果没有则在池中新增一个字符串
		String s1 = "hello";
		String s2 = "hello";
//		所以是true
		System.out.println(s1==s2);
//		new：在内存的堆区中重新分配一快空间保存字符串
		String s3 = new String("hello");
		String s4 = new String("hello");
//		每一次new都会分配所以是false
		System.out.println(s3==s4);
//		一个是字符串池中，一个是堆区空间，所以是false
		System.out.println(s1==s3);
	}

}
