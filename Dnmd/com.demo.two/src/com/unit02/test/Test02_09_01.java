package com.unit02.test;

import com.unit02.pojo.Stu;

public class Test02_09_01 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Stu stu1 = new Stu("张三", 21);
		System.out.println(stu1.getName()+"---------"+stu1.getAge());
		Stu stu2 = stu1;
		stu2.setName("李四");
		stu2.setAge(23);
		System.out.println("------------------------------------");
		System.out.println(stu1.getName()+"---------"+stu1.getAge());
		System.out.println(stu2.getName()+"---------"+stu2.getAge());
		Stu stu3 = stu1.clone();
		stu3.setName("牛五");
		stu3.setAge(25);
		System.out.println("------------------------------------");
		System.out.println(stu1.getName()+"---------"+stu1.getAge());
		System.out.println(stu2.getName()+"---------"+stu2.getAge());
		System.out.println(stu3.getName()+"---------"+stu3.getAge());
		System.out.println(stu3.getName()+"---------"+stu3.getAge());
	}
}
