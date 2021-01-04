package DemoOne;

import java.util.Vector;

public class L4_4 {
	public static void main(String[] args) {
		Vector vv = new Vector();
		Product pr1 = new Product("001","1ºÅ",9f);
		Product pr2 = new Product("002","2ºÅ",8.5f);
		Product pr3 = new Product("003","3ºÅ",8.4f);
		Product pr4 = new Product("004","4ºÅ",8.4f);
		vv.add(pr1);
		vv.add(pr2);
		for (int i = 0; i < vv.size(); i++) {
			System.out.println(((Product) vv.get(i)).getName());
		}
	}
}
