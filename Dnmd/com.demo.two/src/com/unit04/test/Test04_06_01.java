package com.unit04.test;

import java.util.HashSet;

import com.unit02.pojo.Stu;

public class Test04_06_01 {
	public static void main(String[] args) {
		Stu stu1 = new Stu("朱老大", 28);
		Stu stu2 = new Stu("朱老e", 27);
		Stu stu3 = new Stu("朱老a", 26);
		Stu stu4 = new Stu("朱老b", 25);
		Stu stu5 = new Stu("朱老c", 24);
		
//		泛型
		HashSet<Stu> hs = new HashSet<Stu>();  
		
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
//		HashSet重复提交是无效的
		hs.add(stu3);
		
//		输出个数依旧是3个
		System.out.println(hs.size());
		
		for (Stu stu : hs) {
			System.out.println(stu.getName());
		}
	}
}
