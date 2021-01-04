package DemoOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class L4_2 {
	public static void main(String[] args) throws IOException {
		ProductMg pmg = new ProductMg();
		BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("选择操作：\n1-添加；\n2-查询；\n3-修改；\n4-删除；\n0-退出");
			String cz = sr.readLine();
			switch (cz) {
			case "1":
				System.out.println("输入编号");
				String Number1 = sr.readLine();
				System.out.println("输入名称");
				String Name1 = sr.readLine();
				System.out.println("输入价格");
				float Price1 = Float.parseFloat(sr.readLine());
				Product pr = new Product(Number1, Name1, Price1);
				pmg.ProductAdd(pr);
				break;
			case "2":
				System.out.println("输入编号");
				String Number2 = sr.readLine();
				pmg.ProductQuery(Number2);
				break;
			case "3":
				System.out.println("输入编号");
				String Number3 = sr.readLine();
				System.out.println("输入价格");
				float Price3 = Float.parseFloat(sr.readLine());
				pmg.ProductUp(Number3, Price3);
				break;
			case "4":
				System.out.println("输入编号");
				String Number4 = sr.readLine();
				pmg.ProductDe(Number4);
				break;
			case "0":
				System.out.println("退出");
				System.exit(0);
			default:
				System.out.println("输入不正确重新输入");
				break;
			}
		}
	}
}

class Product {
	private String Number;
	private String Name;
	private float Price;

	public Product() {
	}

	public Product(String number, String name, float price) {
		super();
		Number = number;
		Name = name;
		Price = price;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

}

class ProductMg {
	private ArrayList aa = null;

	public ProductMg() {
		aa = new ArrayList();
	}

	public void ProductAdd(Product pr) {
		aa.add(pr);
		System.out.println("添加成功");
	}

	public void ProductQuery(String Number) {
		int i;
		for (i = 0; i < aa.size(); i++) {
			Product pr = (Product) aa.get(i);
			if (pr.getNumber().equals(Number)) {
				System.out.println("编号：" + pr.getNumber());
				System.out.println("名称：" + pr.getName());
				System.out.println("价格：" + pr.getPrice());
				break;
			}
		}
		if (i == aa.size()) {
			System.out.println("查询不到");
		}
	}

	public void ProductUp(String Number, float price) {
		int i;
		for (i = 0; i < aa.size(); i++) {
			Product pr = (Product) aa.get(i);
			if (pr.getNumber().equals(Number)) {
				pr.setPrice(price);
				System.out.println("修改成功");
				break;
			}
		}
		if (i == aa.size()) {
			System.out.println("查询不到，修改失败");
		}
	}

	public void ProductDe(String Number) {
		int i;
		if (aa.size() == 0) {
			System.out.println("仓库中没有商品");
		}
		for (i = 0; i < aa.size(); i++) {
			Product pr = (Product) aa.get(i);
			if (pr.getNumber().equals(Number)) {
				aa.remove(i);
				System.out.println("删除成功");
				break;
			}
		}
		if (i == aa.size() && (aa.size() != 0)) {
			System.out.println("查询不到，删除失败");
		}
	}
}
