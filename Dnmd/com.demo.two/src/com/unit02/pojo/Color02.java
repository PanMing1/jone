package com.unit02.pojo;

public enum Color02 {
	RED(101, "ºìÉ«"), GREEN(102, "ºìÉ«"), BLUE(103, "À¶É«");
	private int id;
	private String name;

	private Color02(int id, String name) {
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
