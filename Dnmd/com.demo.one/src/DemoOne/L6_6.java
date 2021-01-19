package DemoOne;

public class L6_6 {
	public static void main(String[] args) {
		Thread aa = new Thread(new Xh());
		Thread bb = new Thread(new Xh());
		aa.setName("线程一");
		bb.setName("线程二");
		aa.start();
		bb.start();
	}
}

class Xh implements Runnable {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(Thread.currentThread().getName() + i);
			if (i % 5 == 0) {
				Thread.yield();
			}
		}
	}
}