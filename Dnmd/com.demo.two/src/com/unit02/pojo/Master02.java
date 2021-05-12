package com.unit02.pojo;

public class Master02 {
	private String name;
	private static Master02 master01 = new Master02("ÀîËÄ");
	private Master02(String name) {
		this.name = name;
	}
	public static Master02 getMaster02() {
		return master01;
	}
}
