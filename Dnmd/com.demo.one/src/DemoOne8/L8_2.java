package DemoOne8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.tools.Tool;

public class L8_2 extends JFrame{
	Wdmb2 wm = null;
	public static void main(String[] args) {
		L8_2 lx = new L8_2();
	}
	public L8_2() {
		wm = new Wdmb2();
		this.add(wm);
		this.setSize(800,800);
		this.setLocation(300, 280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class Wdmb2 extends JPanel{
	@Override
	public void paint(Graphics g) {
		Image a = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/Imges/a1.png"));
		g.drawImage(a, 50, 50, 300, 300, this);
	}
}