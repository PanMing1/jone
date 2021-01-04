package DemoOne;

import java.util.HashMap;
import java.util.Iterator;

public class L4_5 {
	public static void main(String[] args) {
		HashMap<Integer, Product> hm = new HashMap<Integer, Product>();
		Product pr1 = new Product("001", "1号", 9f);
		Product pr2 = new Product("002", "2号", 8.5f);
		Product pr3 = new Product("003", "3号", 8.4f);
//		Product pr4 = new Product("004","4号",8.4f);
		hm.put(1, pr1);
		hm.put(2, pr2);
		hm.put(2, pr3);
		if (hm.containsKey(2)) {
			System.out.println("==================");
			Product pr = hm.get(2);
			System.out.println(pr.getNumber());
			System.out.println(pr.getName());
			System.out.println(pr.getPrice());
		} else {
			System.out.println("没有");
		}
		System.out.println("==================");
//		取出所有的键值
		Iterator<Integer> it = hm.keySet().iterator();
//		System.out.println(it);
		while (it.hasNext()) {// 判断是否有下一个
//			System.out.println(it.next());
			int key = (int) it.next();
			Product pr = hm.get(key);
			System.out.println(pr.getNumber() + "----" + pr.getName() + "----" + pr.getPrice());
//			System.out.println("11");
		}
	}
}
