package com.unit02.pojo;

public class Master01 {
	private String name;
	private static Master01 master01;
	private Master01(String name) {
		this.name = name;
	}
	public static Master01 getMaster01() {
		if (master01 == null) {
			System.out.println("���ж��󱻴�����");
			master01 = new Master01("����");
		}
		return master01;
	}
}
