package com.unit04.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test04_09_01 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("1001", "奔腾");
		hm.put("1002", "联想");
		hm.put("1003", "戴尔");
		hm.put("1004", "索尼");
		System.out.println(hm.get("1002"));
		System.out.println(hm.size());
//		删除元素
		hm.remove("1003");
		System.out.println(hm.size());
		Set set = hm.keySet();
//		使用迭代器输出
		Iterator set1 = set.iterator();
		while (set1.hasNext()) {
			System.out.println(set1.next());	
		}
//		使用for循环输出
		Collection s = hm.values();
		for (Object object : s) {
			System.out.println(object);
		}
	}

}
