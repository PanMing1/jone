package DemoOne;

public class L6_9 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Chep2());
		t1.setName("����");
		t1.start();
		Thread t2 = new Thread(new Chep2());
		t2.setName("��ɽ");
		t2.start();
	}
}

class Chep2 implements Runnable {
	private static int ticke = 100;
	private static String ss = new String("����");

	@Override
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