package DemoOne;

public class L6_10 {
	public static void main(String[] args) {
		Chep3 c3_1 = new Chep3();
		c3_1.setName("沈阳");
		c3_1.start();
		Chep3 c3_2 = new Chep3();
		c3_2.setName("黄山");
		c3_2.start();
	}
}

class Chep3 extends Thread {
	private static int ticke = 100;
	private static String ss = new String("随便放");

	public void run() {
		while (true) {
			synchronized (ss) {
				if (ticke > 0) {
					System.out.println("线程：{" + Thread.currentThread().getName() + "}出了第【" + (101 - ticke) + "】张车票");
					--ticke;
				} else {
					break;
				}
			}
		}
	}
}