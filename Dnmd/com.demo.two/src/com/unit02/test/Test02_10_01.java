package com.unit02.test;

import java.util.Timer;
import java.util.TimerTask;

public class Test02_10_01 {
	public static void main(String[] args) {
		System.out.println("��ʼ---------------");
		Timer ti = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("��ʱ����ִ�У�");
				
			}
		};
		ti.schedule(task, 2000);
	}
}
