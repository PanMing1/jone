package com.unit02.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test02_10_02 {

	public static void main(String[] args) {
		System.out.println("��ʼ����-------------");
		Timer ti = new Timer();
		TimerTask task1 =new TimerTask() {
			
			@Override
			public void run() {
				Date d1 = new Date();
				DateFormat df = DateFormat.getDateTimeInstance();
				String s1 = df.format(d1);
				System.out.println("����ʱ�䣺"+s1);
			}
		};
		TimerTask task2 = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("��ʱ����ִ���ˣ�");
				
			}
		};
		ti.schedule(task1, 0, 1000);
		ti.schedule(task2, 5000);
	}

}
