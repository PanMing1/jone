package com.unit04.test;

import java.util.HashSet;

import com.unit02.pojo.Stu;

public class Test04_06_01 {
	public static void main(String[] args) {
		Stu stu1 = new Stu("���ϴ�", 28);
		Stu stu2 = new Stu("����e", 27);
		Stu stu3 = new Stu("����a", 26);
		Stu stu4 = new Stu("����b", 25);
		Stu stu5 = new Stu("����c", 24);
		
//		����
		HashSet<Stu> hs = new HashSet<Stu>();  
		
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
//		HashSet�ظ��ύ����Ч��
		hs.add(stu3);
		
//		�������������3��
		System.out.println(hs.size());
		
		for (Stu stu : hs) {
			System.out.println(stu.getName());
		}
	}
}
