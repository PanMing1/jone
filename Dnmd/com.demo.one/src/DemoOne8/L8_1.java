package DemoOne8;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class L8_1 extends JFrame{
	Wdmb wm = null;
	public static void main(String[] args) {
		L8_1 lx = new L8_1();
	}
	public L8_1() {
		wm = new Wdmb();
		this.add(wm);
		this.setSize(500,500);
		this.setLocation(300, 280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class Wdmb extends JPanel{
	@Override
	public void paint(Graphics g) {
//		g.drawOval(100, 100, 300, 300);
		//drawOval��Բ��
//		g.drawLine(300, 300, 400, 400);
		//drawLine������
		g.drawRect(300, 300, 300, 300);
		//drawRect������
//		g.draw3DRect(300, 300, 300, 300, true);
		//draw3DRect��3D���Σ�true:͹ false����
//		g.setColor(Color.black);
//		g.fillRect(300, 300, 300, 300);
		
//		super.paint(g);
	}
}
/*
 * paint���������������ַ�ʽ����
 * 1����������ʱ
 * 2�����ڴ�С�����仯ʱ
 * 3������repaint����ʱ
 */
