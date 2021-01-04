package DemoOne;

import java.util.LinkedList;

public class L4_31 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		Product pr1 = new Product("001","1ºÅ",9f);
		Product pr2 = new Product("002","2ºÅ",8.5f);
		Product pr3 = new Product("003","3ºÅ",8.4f);
		Product pr4 = new Product("004","4ºÅ",8.4f);
		Product pr5 = new Product("005","5ºÅ",8.3f);
		
		ll.addFirst(pr1);
		ll.addLast(pr2);
		ll.addFirst(pr3);
		ll.addLast(pr4);
		ll.addFirst(pr5);
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(((Product) ll.get(i)).getNumber());
		}
	}
}
