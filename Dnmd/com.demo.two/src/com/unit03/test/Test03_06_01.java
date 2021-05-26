package com.unit03.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03_06_01 {

	public static void main(String[] args) {
		System.out.println("开始输入：");
		Scanner sc = new Scanner(System.in);	
//		正则表达式，下方正则是以1开头+10位数字
		String pat = "1\\d{10}";
//		获取Pattern对象，传入正则表达式
		Pattern p = Pattern.compile(pat);
		for (int i = 4; i >= 0; i--) {
			String s1 = sc.next();
//			获取Matcher对象,传入字符串
			Matcher m = p.matcher(s1);
//			m.matches() :字符串是否符合正则表达式
//			m.find() :字符串是否包含了符合正则表达式的内容
			if (m.matches()) {
				System.out.println("输入符合要求");
				break;
			}else {
				if (i==0) {
					System.out.println("尝试次数已使用完！");
				}else {
					System.out.println("输入不符合要求，重新输入，剩余次数为："+i);
				}				
			}
		}	
	}
}
