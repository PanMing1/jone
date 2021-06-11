package com.unit04.test;

import java.util.ArrayList;

import com.unit02.pojo.Stu;

public class Test04_04_01 {
	public static void main(String[] args) {
		ArrayList<Stu> al1 = new ArrayList<Stu>();
		ArrayList<Stu> al2 = new ArrayList<Stu>();
		Stu stu1 = new Stu("朱老大", 28);
		Stu stu2 = new Stu("朱老e", 27);
		Stu stu3 = new Stu("朱老a", 26);
		Stu stu4 = new Stu("朱老b", 25);
		Stu stu5 = new Stu("朱老c", 24);
		Stu stu6 = new Stu("朱老d", 23);
		Stu stu7 = new Stu("朱老f", 22);
		Stu stu8 = new Stu("朱老g", 21);
		
		al1.add(stu1);
		al1.add(stu2);
		al1.add(stu3);
		al1.add(stu4);
		
//		判断一个集合是否为空
		System.out.println(al1.isEmpty());
		
//		集合的几个
		System.out.println(al1.size());
		
		al2.add(stu5);
		al2.add(stu6);
		al2.add(stu7);
		al2.add(stu8);
		
//		判断一个集合是否包含该元素
		System.out.println(al1.contains(stu8));
		
//		将一个集合所有元素添加到另一个集合
		al1.addAll(al2);
		System.out.println(al1.size());
		System.out.println(al2.size());
		
//		清空一个集合
		al1.clear();
		System.out.println(al1.isEmpty());
		
//		将一个集合转换为数组
		Stu[] sArray = (Stu[]) al2.toArray();
		for (Stu stu : sArray) {
			System.out.println(stu.getName());
		}
	}
}
