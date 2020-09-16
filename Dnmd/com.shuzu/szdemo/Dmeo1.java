package szdemo;

import java.util.Arrays;

public class Dmeo1 {
	public static void main(String[] args) {
		Mana[] m1 = { new Mana(14, "Ç®"), new Mana(1, "ÕÔ"), new Mana(35, "Àî"), new Mana(21, "Ëï") };
		Arrays.sort(m1);
		System.out.println(Arrays.toString(m1));
	}
}

class Mana implements Comparable<Object> {
	int age;
	String name;

	@Override
	public String toString() {

		return this.name;
	}

	@Override
	public int compareTo(Object o) {
		Mana mana = (Mana) o;
		if (this.age < mana.age) {
			return -1;
		} else if (this.age > mana.age) {
			return 1;
		}
		return 0;
	}

	public Mana() {
		super();
	}

	public Mana(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

}