package com.unit02.pojo;

public class Color01 {
	private int id;
	private String name;
	public static final Color01 c1 = new Color01(101, "��ɫ");
	public static final Color01 c2 = new Color01(102, "��ɫ");
	public static final Color01 c3 = new Color01(103, "��ɫ");

	private Color01(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
