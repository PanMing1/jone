package com.unit04.test;

import java.util.HashSet;
import java.util.Iterator;


public class Test04_08_01 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("����");
		hs.add(123);
		hs.add("��");
		hs.add(456);
		hs.add("����");
		hs.add(789);
		hs.add("��Ҷ");
		
//		������
		Iterator it = hs.iterator();
		
//		hasNext���ж��Ƿ�����һ��
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
