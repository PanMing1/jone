package com.unit03.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03_06_01 {

	public static void main(String[] args) {
		System.out.println("��ʼ���룺");
		Scanner sc = new Scanner(System.in);	
//		������ʽ���·���������1��ͷ+10λ����
		String pat = "1\\d{10}";
//		��ȡPattern���󣬴���������ʽ
		Pattern p = Pattern.compile(pat);
		for (int i = 4; i >= 0; i--) {
			String s1 = sc.next();
//			��ȡMatcher����,�����ַ���
			Matcher m = p.matcher(s1);
//			m.matches() :�ַ����Ƿ����������ʽ
//			m.find() :�ַ����Ƿ�����˷���������ʽ������
			if (m.matches()) {
				System.out.println("�������Ҫ��");
				break;
			}else {
				if (i==0) {
					System.out.println("���Դ�����ʹ���꣡");
				}else {
					System.out.println("���벻����Ҫ���������룬ʣ�����Ϊ��"+i);
				}				
			}
		}	
	}
}
