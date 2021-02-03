package DemoOne8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.tools.Tool;

public class L8_3_1 extends JFrame{
	Wdmb3_1 wm = null;
	Jtq jtq = null;
	JButton button1,button2;
	public static void main(String[] args) {
		L8_3_1 lx = new L8_3_1();
	}
	public L8_3_1() {
		wm = new Wdmb3_1();
		jtq = new Jtq();
		button1 = new JButton("红色");
		button2 = new JButton("绿色");
		this.add(button1,BorderLayout.NORTH);
		this.add(button2,BorderLayout.SOUTH);
		wm.setBackground(Color.pink);
		this.add(wm);
		button1.addActionListener(jtq);
		button1.setActionCommand("红");
		button2.addActionListener(jtq);
		button2.setActionCommand("绿");
		
		this.setSize(400,450);
		this.setLocation(300, 280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class Wdmb3_1 extends JPanel{
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
}
class Jtq implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("红")) {
			System.out.println("红色按钮");
		}
		if (e.getActionCommand().equals("绿")) {
			System.out.println("绿色按钮");
		}
	}
	
}