package szdemo;

public class MyInteger {
	private int value;
	private static MyInteger[] cache = new MyInteger[256];
	private static final int low = -128;
	private static final int high = 127;

	static {
		for (int i = low; i < high; i++) {
			cache[i + 128] = new MyInteger(i);
		}
	}

	public MyInteger(int i) {
		this.value = i;
	}

	public static MyInteger valueOf(int i) {
		if (i > low && i < high) {
			return cache[i + 128];
		}
		return new MyInteger(i);
	}
	
	@Override
	public String toString() {
		return this.value+"";
	}

	public static void main(String[] args) {
		MyInteger m = MyInteger.valueOf(300);
		System.out.println(m);
	}
}
