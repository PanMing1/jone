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

public class L8_3 extends JFrame implements ActionListener{
	Wdmb3 wm = null;
	JButton button1,button2;
	public static void main(String[] args) {
		L8_3 lx = new L8_3();
	}
	public L8_3() {
		wm = new Wdmb3();
		button1 = new JButton("ºìÉ«");
		button2 = new JButton("ÂÌÉ«");
		this.add(button1,BorderLayout.NORTH);
		this.add(button2,BorderLayout.SOUTH);
		wm.setBackground(Color.pink);
		button1.addActionListener(this);
		button1.setActionCommand("ºì");
		button2.addActionListener(this);
		button2.setActionCommand("ÂÌ");
		this.add(wm);
		this.setSize(400,450);
		this.setLocation(300, 280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("ºì")) {
			wm.setBackground(Color.red);
		}
		if (e.getActionCommand().equals("ÂÌ")) {
			wm.setBackground(Color.green);
		}
		
	}
}
class Wdmb3 extends JPanel{
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
}