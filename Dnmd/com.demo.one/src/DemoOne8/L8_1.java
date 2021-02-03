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
		//drawOval：圆形
//		g.drawLine(300, 300, 400, 400);
		//drawLine：线条
		g.drawRect(300, 300, 300, 300);
		//drawRect：矩形
//		g.draw3DRect(300, 300, 300, 300, true);
		//draw3DRect：3D矩形，true:凸 false：凹
//		g.setColor(Color.black);
//		g.fillRect(300, 300, 300, 300);
		
//		super.paint(g);
	}
}
/*
 * paint方法会在以下三种方式调用
 * 1、启动程序时
 * 2、窗口大小发生变化时
 * 3、运行repaint函数时
 */
