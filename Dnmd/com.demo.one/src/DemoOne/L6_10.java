package DemoOne;

public class L6_10 {
	public static void main(String[] args) {
		Chep3 c3_1 = new Chep3();
		c3_1.setName("����");
		c3_1.start();
		Chep3 c3_2 = new Chep3();
		c3_2.setName("��ɽ");
		c3_2.start();
	}
}

class Chep3 extends Thread {
	private static int ticke = 100;
	private static String ss = new String("����");

	public void run() {
		while (true) {
			synchronized (ss) {
				if (ticke > 0) {
					System.out.println("�̣߳�{" + Thread.currentThread().getName() + "}���˵ڡ�" + (101 - ticke) + "���ų�Ʊ");
					--ticke;
				} else {
					break;
				}
			}
		}
	}
}