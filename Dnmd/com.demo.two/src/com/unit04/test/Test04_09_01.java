package com.unit04.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test04_09_01 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("1001", "����");
		hm.put("1002", "����");
		hm.put("1003", "����");
		hm.put("1004", "����");
		System.out.println(hm.get("1002"));
		System.out.println(hm.size());
//		ɾ��Ԫ��
		hm.remove("1003");
		System.out.println(hm.size());
		Set set = hm.keySet();
//		ʹ�õ��������
		Iterator set1 = set.iterator();
		while (set1.hasNext()) {
			System.out.println(set1.next());	
		}
//		ʹ��forѭ�����
		Collection s = hm.values();
		for (Object object : s) {
			System.out.println(object);
		}
	}

}
