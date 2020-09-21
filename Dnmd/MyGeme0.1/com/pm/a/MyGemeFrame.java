package com.pm.a;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGemeFrame extends Frame{
	
	@Override
	public void paint(Graphics g) {
		g.setColor(new Color(255, 0, 255));
	}
	
	public void launchFrame() {
		setTitle("练习窗口");
		setVisible(true);
		setSize(500, 500);
		setLocation(400, 400);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		MyGemeFrame myGemeFrame = new MyGemeFrame();
		myGemeFrame.launchFrame();
	}
}
