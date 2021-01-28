package DemoOne8;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.tools.Tool;

public class L8_2_1 extends JFrame{
	Wdmb2_1 wm = null;
	public static void main(String[] args) {
		L8_2_1 lx = new L8_2_1();
	}
	public L8_2_1() {
		wm = new Wdmb2_1();
		this.add(wm);
		this.setSize(800,800);
		this.setLocation(300, 280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class Wdmb2_1 extends JPanel{
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.setFont(new Font("»ªÎÄ²ÊÔÆ", Font.BOLD, 50));
		g.drawString("·äÃÛèÖ×Ó²è", 100, 100);
	}
}