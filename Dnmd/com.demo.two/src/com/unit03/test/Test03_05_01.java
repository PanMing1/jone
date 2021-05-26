package com.unit03.test;

public class Test03_05_01 {

	public static void main(String[] args) {
		String s1 = "{ \"_id\" : ObjectId(\"56066169ade2f21f36b03137\"), \"title\" : \"MongoDB 教程\", \"description\" : \"MongoDB 是一个 Nosql 数据库\", \"by\" : \"菜鸟教程\", \"url\" : \"http://www.runoob.com\", \"tags\" : [ \"mongodb\", \"database\", \"NoSQL\" ], \"likes\" : 100 }\r\n";
//		MongoDB 教程
//		获取字符串长度
		System.out.println(s1.length());
//		判断字符串是否为空字符串
		System.out.println(s1.isEmpty());
//		检索内容是否包含
		System.out.println(s1.contains("MongoDB 教程"));
//		查询内容位置，有，则返回位置，没有，则返回-1
		System.out.println(s1.indexOf("MongoDB 教程"));
//		判断是否是该内容开头
		System.out.println(s1.startsWith("{"));
//		判断是否是该内容结尾
		System.out.println(s1.endsWith("\n"));
	}
}
