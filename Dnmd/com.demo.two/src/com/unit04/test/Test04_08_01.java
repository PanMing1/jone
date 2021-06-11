package com.unit04.test;

import java.util.HashSet;
import java.util.Iterator;


public class Test04_08_01 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("杨柳");
		hs.add(123);
		hs.add("桂花");
		hs.add(456);
		hs.add("青樟");
		hs.add(789);
		hs.add("柳叶");
		
//		迭代器
		Iterator it = hs.iterator();
		
//		hasNext：判断是否有下一个
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
