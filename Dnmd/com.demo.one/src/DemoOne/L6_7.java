package DemoOne;

public class L6_7 {
	public static void main(String[] args) {
		Thread aa = new Thread(new Xj());
		aa.start();
		try {
			aa.join();
		} catch (InterruptedException e) {
		}
		for (int i = 1; i <= 20; i++) {
			System.out.println("���߳�" + i);
		}
	}
}

class Xj implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("���߳�" + i);
		}
	}
}