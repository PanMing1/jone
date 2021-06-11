package com.unit02.pojo;

// 第一步：克隆技术需要实现Cloneable接口
public class Stu implements Cloneable {
	String name;
	int age;

//	浅克隆
//	第二步：实现一个克隆的方法，对方法进行一个重写，返回值为当前类对象
	public Stu clone() throws CloneNotSupportedException {
		Stu s = (Stu) super.clone();
		return s;
	}

	public Stu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
