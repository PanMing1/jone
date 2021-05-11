package com.unit02.pojo;

public class Stu implements Cloneable{
	String name;
	int age;
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
