package szbasis;

public class Demo9 {
	public static void main(String[] args) {
		Spl product1 = new Spl(101, "百战牌鼠标", "BZ_001", 99.21, 0.9);
		Spl product2 = new Spl(102, "键盘侠玩偶", "WO_102", 403.00, 0.7);
		Spl product3 = new Spl(103, "实战序设计", "BK_001", 89.00, 0.8);
		Spl product4 = new Spl(104, "劲霸牌西装", "GQ_XF_12", 700.00, 0.5);
		Spl product5 = new Spl(105, "小米牌手机", "DM_13", 900.00, 0.3);
		Spl[] prod = { product1, product2, product3, product4, product5 };
		int m = 280;
		for (int i = 0; i < prod.length; i++) {
			if (prod[i].getPrice() * prod[i].getDiscount() < m) {
				System.out.println(prod[i]);
			}
		}
	}
}

class Spl {
	private int id;
	private String name;
	private String model;
	private double price;
	private double discount;

	@Override
	public String toString() {
		return getId() + "\t" + getName() + '\t' + getModel() + '\t' + getPrice() + '\t' + getDiscount();
	}

	public Spl() {
		// TODO Auto-generated constructor stub
	}

	public Spl(int id, String name, String model, double price, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}