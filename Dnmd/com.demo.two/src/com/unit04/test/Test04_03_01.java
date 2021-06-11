package com.unit04.test;

import java.util.ArrayList;

import com.unit02.pojo.Stu;

public class Test04_03_01 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Stu stu1 = new Stu("朱老大", 28);
		Stu stu2 = new Stu("朱老大", 28);
		Stu stu3 = new Stu("朱老大", 28);
		Stu stu4 = new Stu("朱老大", 28);
		
		al.add(stu1);
		al.add(stu2);
		al.add(stu3);
		al.add(stu4);
		
		System.out.println(al.size());
	}
}
