package DemoOne;

import java.util.LinkedList;

public class L4_3 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		Product pr1 = new Product("001","1号",9f);
		Product pr2 = new Product("002","2号",8.5f);
		Product pr3 = new Product("003","3号",8.4f);
		Product pr4 = new Product("004","4号",8.4f);
//		后进先出
//		ll.addFirst(pr1);
//		ll.addFirst(pr2);
//		
//		for (int i = 0; i < ll.size(); i++) {
////			System.out.println(((Product) ll.get(i)).getName());
////			只取最上面的
////			System.out.println(((Product) ll.getFirst()).getName());
////			只取最下面的
//			System.out.println(((Product) ll.getLast()).getName());
//		}
//		从底部进 先进先出
		ll.addLast(pr1);
		ll.addLast(pr2);
		ll.add(1, pr3);
		ll.remove(2);
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(((Product) ll.get(i)).getName());
		}
	}
}
