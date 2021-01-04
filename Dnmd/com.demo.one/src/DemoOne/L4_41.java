package DemoOne;

import java.util.Stack;

public class L4_41 {
	public static void main(String[] args) {
		Stack<Product> ss = new Stack<Product>();
		Product pr1 = new Product("001","1ºÅ",9f);
		Product pr2 = new Product("002","2ºÅ",8.5f);
		Product pr3 = new Product("003","3ºÅ",8.4f);
		Product pr4 = new Product("004","4ºÅ",8.4f);
		ss.add(pr1);
		ss.add(pr2);
		ss.add(pr3);
		ss.add(pr4);
		for (int i = 0; i < ss.size(); i++) {
			System.out.println(((Product) ss.get(i)).getName());
		}
	}
}	
