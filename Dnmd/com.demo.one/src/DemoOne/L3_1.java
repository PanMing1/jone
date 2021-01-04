package DemoOne;

public class L3_1 {
	public static void main(String[] args) {
		B b1 = new B(20);
		B b2 = new B(20);
		System.out.println(b1 == b2); // false
		System.out.println(b1.equals(b2));
		C c1 = new C(10);
		C c2 = new C(10);
		System.out.println(c1.equals(c2));
	}
}

class B {
	private int i;

	B(int i) {
		this.i = i;
	}

	public boolean equals(B b2) {
		if (this.i == b2.i) {
			return true;
		} else {
			return false;
		}
	}
}

class C extends B {
	private int j;

	C(int j) {
		super(j);
		this.j = j;
	}

	@Override
	public boolean equals(B b2) {
		C c = (C) b2;
		if (this.j == c.j) {
			return true;
		} else {
			return false;
		}
	}
}