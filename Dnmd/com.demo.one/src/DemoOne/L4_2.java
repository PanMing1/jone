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
			System.out.println("ѡ�������\n1-��ӣ�\n2-��ѯ��\n3-�޸ģ�\n4-ɾ����\n0-�˳�");
			String cz = sr.readLine();
			switch (cz) {
			case "1":
				System.out.println("������");
				String Number1 = sr.readLine();
				System.out.println("��������");
				String Name1 = sr.readLine();
				System.out.println("����۸�");
				float Price1 = Float.parseFloat(sr.readLine());
				Product pr = new Product(Number1, Name1, Price1);
				pmg.ProductAdd(pr);
				break;
			case "2":
				System.out.println("������");
				String Number2 = sr.readLine();
				pmg.ProductQuery(Number2);
				break;
			case "3":
				System.out.println("������");
				String Number3 = sr.readLine();
				System.out.println("����۸�");
				float Price3 = Float.parseFloat(sr.readLine());
				pmg.ProductUp(Number3, Price3);
				break;
			case "4":
				System.out.println("������");
				String Number4 = sr.readLine();
				pmg.ProductDe(Number4);
				break;
			case "0":
				System.out.println("�˳�");
				System.exit(0);
			default:
				System.out.println("���벻��ȷ��������");
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
		System.out.println("��ӳɹ�");
	}

	public void ProductQuery(String Number) {
		int i;
		for (i = 0; i < aa.size(); i++) {
			Product pr = (Product) aa.get(i);
			if (pr.getNumber().equals(Number)) {
				System.out.println("��ţ�" + pr.getNumber());
				System.out.println("���ƣ�" + pr.getName());
				System.out.println("�۸�" + pr.getPrice());
				break;
			}
		}
		if (i == aa.size()) {
			System.out.println("��ѯ����");
		}
	}

	public void ProductUp(String Number, float price) {
		int i;
		for (i = 0; i < aa.size(); i++) {
			Product pr = (Product) aa.get(i);
			if (pr.getNumber().equals(Number)) {
				pr.setPrice(price);
				System.out.println("�޸ĳɹ�");
				break;
			}
		}
		if (i == aa.size()) {
			System.out.println("��ѯ�������޸�ʧ��");
		}
	}

	public void ProductDe(String Number) {
		int i;
		if (aa.size() == 0) {
			System.out.println("�ֿ���û����Ʒ");
		}
		for (i = 0; i < aa.size(); i++) {
			Product pr = (Product) aa.get(i);
			if (pr.getNumber().equals(Number)) {
				aa.remove(i);
				System.out.println("ɾ���ɹ�");
				break;
			}
		}
		if (i == aa.size() && (aa.size() != 0)) {
			System.out.println("��ѯ������ɾ��ʧ��");
		}
	}
}
