package com.unit03.test;

public class Test03_05_01 {

	public static void main(String[] args) {
		String s1 = "{ \"_id\" : ObjectId(\"56066169ade2f21f36b03137\"), \"title\" : \"MongoDB �̳�\", \"description\" : \"MongoDB ��һ�� Nosql ���ݿ�\", \"by\" : \"����̳�\", \"url\" : \"http://www.runoob.com\", \"tags\" : [ \"mongodb\", \"database\", \"NoSQL\" ], \"likes\" : 100 }\r\n";
//		MongoDB �̳�
//		��ȡ�ַ�������
		System.out.println(s1.length());
//		�ж��ַ����Ƿ�Ϊ���ַ���
		System.out.println(s1.isEmpty());
//		���������Ƿ����
		System.out.println(s1.contains("MongoDB �̳�"));
//		��ѯ����λ�ã��У��򷵻�λ�ã�û�У��򷵻�-1
		System.out.println(s1.indexOf("MongoDB �̳�"));
//		�ж��Ƿ��Ǹ����ݿ�ͷ
		System.out.println(s1.startsWith("{"));
//		�ж��Ƿ��Ǹ����ݽ�β
		System.out.println(s1.endsWith("\n"));
	}
}
