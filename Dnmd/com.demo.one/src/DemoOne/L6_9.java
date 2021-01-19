package DemoOne;

public class L6_9 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Chep2());
		t1.setName("沈阳");
		t1.start();
		Thread t2 = new Thread(new Chep2());
		t2.setName("黄山");
		t2.start();
	}
}

class Chep2 implements Runnable {
	private static int ticke = 100;
	private static String ss = new String("随便放");

	@Override
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