package com.unit04.test;

import java.util.ArrayList;

import com.unit02.pojo.Stu;

public class Test04_04_01 {
	public static void main(String[] args) {
		ArrayList<Stu> al1 = new ArrayList<Stu>();
		ArrayList<Stu> al2 = new ArrayList<Stu>();
		Stu stu1 = new Stu("���ϴ�", 28);
		Stu stu2 = new Stu("����e", 27);
		Stu stu3 = new Stu("����a", 26);
		Stu stu4 = new Stu("����b", 25);
		Stu stu5 = new Stu("����c", 24);
		Stu stu6 = new Stu("����d", 23);
		Stu stu7 = new Stu("����f", 22);
		Stu stu8 = new Stu("����g", 21);
		
		al1.add(stu1);
		al1.add(stu2);
		al1.add(stu3);
		al1.add(stu4);
		
//		�ж�һ�������Ƿ�Ϊ��
		System.out.println(al1.isEmpty());
		
//		���ϵļ���
		System.out.println(al1.size());
		
		al2.add(stu5);
		al2.add(stu6);
		al2.add(stu7);
		al2.add(stu8);
		
//		�ж�һ�������Ƿ������Ԫ��
		System.out.println(al1.contains(stu8));
		
//		��һ����������Ԫ����ӵ���һ������
		al1.addAll(al2);
		System.out.println(al1.size());
		System.out.println(al2.size());
		
//		���һ������
		al1.clear();
		System.out.println(al1.isEmpty());
		
//		��һ������ת��Ϊ����
		Stu[] sArray = (Stu[]) al2.toArray();
		for (Stu stu : sArray) {
			System.out.println(stu.getName());
		}
	}
}
