package com.unit03.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03_08_01 {

	public static void main(String[] args) {
//	正则表达式规则
/*		
		常用原子（通用字符）：
	    \w  匹配任意字母/数字/下划线  
	    \d  匹配数字
	    \s  匹配空白字符  
	    \W  和小写 w 相反，匹配任意字母/数字/下划线以外的字符
	    \D  匹配除了十进制数以外的值
	    [0-9]  匹配一个0-9之间的数字
	    [a-z]  匹配小写英文字母
	    [A-Z]  匹配大写英文字母
	    [\u4e00-\u9fa5]  匹配中文字符
*/	    
/*	
		常用元字符：
	    . 匹配任意字符  
	    {n} 前面的原子出现了 n 次
	    {n,} 前面的原子至少出现 n 次
	    {n,m} 前面的原子出现次数介于 n-m 之间
	    ( ) 分组，可用来提取字符串内容
*/
		String s1 = "每次输入变量名 或者 设置一个变量名13662215070每次输入变量名 或者 设置一个变量名13662215071量名 或者 设置一个变量13662215072量名 或者 设置一个变量量名 或者 设置一个变量量名 或者 设置一个变量";
		String s2 = "(1\\d{10})";
		Pattern p = Pattern.compile(s2);
		Matcher m = p.matcher(s1);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
